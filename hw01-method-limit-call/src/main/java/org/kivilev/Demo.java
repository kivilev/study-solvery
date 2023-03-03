package org.kivilev;

public class Demo {
    private final int minLimitMilliSec;
    private long lastExecuteTime = 0;


    public Demo(int minLimitSec) {
        this.minLimitMilliSec = minLimitSec * 1000;
    }

    public void limitMethod() {
        synchronized (this) {
            final long currentTime = System.currentTimeMillis(); // nanoTime вроде более лучше
            if (currentTime >= lastExecuteTime + minLimitMilliSec) {

                System.out.println("Очень полезное действие");

                lastExecuteTime = currentTime;
            }
        }
    }
}
