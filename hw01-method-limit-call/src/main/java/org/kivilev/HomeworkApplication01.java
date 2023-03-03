package org.kivilev;

public class HomeworkApplication01 {
    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo(3);

        demo.limitMethod();// output

        Thread.sleep(1000);
        demo.limitMethod();// not output

        Thread.sleep(1000);
        demo.limitMethod();// not output

        Thread.sleep(1000);
        demo.limitMethod();// output

        Thread.sleep(1000);
        demo.limitMethod();// not output
    }
}
