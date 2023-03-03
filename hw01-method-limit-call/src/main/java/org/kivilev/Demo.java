package org.kivilev;

public class Demo {
    private final int minLimitMilliSec;
    private long lastExecuteTime;

    public Demo(int minLimitSec) {
        this.minLimitMilliSec = minLimitSec * 1000;
    }

    public void limitMethod() {
        synchronized (this) {
            // nanoTime вроде более лучше
            final long currentTime = System.currentTimeMillis();
            if (currentTime >= lastExecuteTime + minLimitMilliSec) {

                System.out.println("Очень полезное действие");

                lastExecuteTime = currentTime;
            }
        }
    }
}
