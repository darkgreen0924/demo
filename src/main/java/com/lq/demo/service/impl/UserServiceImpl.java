package com.lq.demo.service.impl;

import com.lq.demo.dto.Man;
import com.lq.demo.mapper.UserMapper;
import com.lq.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * UserServiceImpl
 *
 * @author qingqing
 * @date 2025/2/16
 */
@Service
public class UserServiceImpl implements UserService {

    private static final int CORE_POOL_SIZE = Runtime.getRuntime().availableProcessors() * 2;
    private static final int MAX_POOL_SIZE = 200;
    private static final int QUEUE_CAPACITY = 1000;
    private static final long KEEP_ALIVE_TIME = 60L;
    // 自定义线程工厂（命名线程便于监控）
    private static final ThreadFactory threadFactory = new ThreadFactory() {
        private final AtomicInteger threadCount = new AtomicInteger(0);

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "order-processor-" + threadCount.getAndIncrement());
        }
    };
    // 拒绝策略：队列满时阻塞提交直到有空闲（生产环境慎用，根据场景选择）
    private static final RejectedExecutionHandler rejectionHandler = new ThreadPoolExecutor.CallerRunsPolicy();
    // 创建线程池
    private static final ExecutorService poolExecutor = new ThreadPoolExecutor(
            CORE_POOL_SIZE,
            MAX_POOL_SIZE,
            KEEP_ALIVE_TIME,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(QUEUE_CAPACITY),
            threadFactory,
            rejectionHandler
    );
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(Man user) {
        return false;
    }

    @Override
    public boolean deleteUser(String id) {
        boolean b = userMapper.deleteUser(id);
        return b;
    }

    //    @Async
    @Override
    public Man searchUser(String id) throws ExecutionException, InterruptedException {
        return poolExecutor.submit(() -> {
            return userMapper.searchMan(id);
        }).get();
    }

    @Override
    public Man searchUser2(String id) {
        return userMapper.searchMan(id);
    }


    @Override
    public boolean updateUser(Man user) {
        return false;
    }
}
