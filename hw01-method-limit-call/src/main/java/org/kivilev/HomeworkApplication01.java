package org.kivilev;

public class HomeworkApplication01 {
    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo(3);

        // output
        demo.limitMethod();

        Thread.sleep(1000);
        demo.limitMethod();

        Thread.sleep(1000);
        demo.limitMethod();

        Thread.sleep(1000);
        // output
        demo.limitMethod();

        Thread.sleep(1000);
        demo.limitMethod();
    }
}
