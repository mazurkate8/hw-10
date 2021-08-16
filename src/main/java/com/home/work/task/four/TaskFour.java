package com.home.work.task.four;

import java.util.stream.Stream;

public class TaskFour {
    public static Stream<Long> randomGenerator(long a, long c, long m, long seed) {
        Long[] randomNums = new Long[2];
        randomNums[0] = seed;
        randomNums[1] = ((randomNums[0] * a) + c) % m;
        return Stream.of(randomNums[1]);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = 0x1_0000_0000_0000L;

        Stream.iterate(1, n -> n + 1)
                .limit(100)
                .forEach(x -> randomGenerator(a, c, m, Long.valueOf(x)).forEach(System.out::println));
    }
}
