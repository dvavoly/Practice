package com.example.concurrency;

import java.util.concurrent.Semaphore;

public class LoginQueueUsingSemaphore {
    private final Semaphore semaphore;

    LoginQueueUsingSemaphore(int slotLimit) {
        semaphore = new Semaphore(slotLimit);
    }

    boolean tryLogin() {
        return semaphore.tryAcquire();
    }

    void logout() {
        semaphore.release();
    }

    int availableSlot() {
        return semaphore.availablePermits();
    }
}
