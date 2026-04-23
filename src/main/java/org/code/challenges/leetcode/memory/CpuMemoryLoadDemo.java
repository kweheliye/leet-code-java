package org.code.challenges.leetcode.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CpuMemoryLoadDemo {

    private static final int CPU_THREADS = 4;
    private static final int MEMORY_THREADS = 2;

    public static void main(String[] args) {
        System.out.println("Starting CPU & Memory load demo...");

        // Spawn CPU intensive threads
        for (int i = 0; i < CPU_THREADS; i++) {
            Thread cpuThread = new Thread(new CpuTask(), "cpu-thread-" + i);
            cpuThread.start();
        }

        // Spawn memory intensive threads
        for (int i = 0; i < MEMORY_THREADS; i++) {
            Thread memThread = new Thread(new MemoryTask(), "memory-thread-" + i);
            memThread.start();
        }
    }

    // 🔥 CPU burner
    static class CpuTask implements Runnable {
        @Override
        public void run() {
            long count = 0;
            while (true) {
                count += Math.sqrt(new Random().nextDouble());
                if (count % 1_000_000 == 0) {
                    Thread.yield();
                }
            }
        }
    }

    // 🧠 Memory allocator
    static class MemoryTask implements Runnable {
        @Override
        public void run() {
            List<byte[]> memory = new ArrayList<>();
            try {
                while (true) {
                    // Allocate 1 MB
                    memory.add(new byte[1024 * 1024]);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

