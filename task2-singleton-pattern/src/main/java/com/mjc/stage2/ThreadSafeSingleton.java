package com.mjc.stage2;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;
    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        ThreadSafeSingleton result = threadSafeSingleton;
        if (result != null) {
            return result;
        }
        synchronized (ThreadSafeSingleton.class) {
            if (threadSafeSingleton == null) {
                threadSafeSingleton = new ThreadSafeSingleton();
            }
            return threadSafeSingleton;
        }
    }
}