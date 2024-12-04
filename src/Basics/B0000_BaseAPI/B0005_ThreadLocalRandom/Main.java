package Basics.B0000_BaseAPI.B0005_ThreadLocalRandom;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadLocalRandom.current().nextInt(10));
            //ThreadLocalRandom原理
            // 使用 ThreadLocalRandom 代替 Math.random() 可以减少竞争，从而获得更好的性能。
            // ThreadLocalRandom 是 JDK 1.7 新添加的类，它使用 ThreadLocal 来保证每个线程都有自己的随机数生成器，从而避免了多线程环境下的竞争。
            // 在多线程环境下，使用 ThreadLocalRandom 可以获得更好的性能。
            // 但是，在单线程环境下，使用 ThreadLocalRandom 也没有问题。

            //使用中只需调用 ThreadLocalRandom.current()， 然后调用它的其中一个方法去获取一个随机数即可
            //例如：nextInt()、nextLong()、nextDouble()、nextBoolean()、nextGaussian()等。

        }
    }
}
