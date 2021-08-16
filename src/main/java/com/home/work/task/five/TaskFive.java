package com.home.work.task.five;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFive {
    /*Если правильно поняла условие задачи, я создаю два списка
      определяю стрим меньше длины и в третий наполняю елементами
      из первого и второго стрима.
      */
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstStream = first.collect(Collectors.toList());
        List<T> secondStream = second.collect(Collectors.toList());
        List<T> lst = new ArrayList<>();

        int min = Math.min(firstStream.size(), secondStream.size());
        int loopStream = firstStream.size() == min ? firstStream.size() : secondStream.size();

            for (int i = 0; i < loopStream; i++) {
                lst.add(firstStream.get(i));
                lst.add(secondStream.get(i));
        }
        return lst.stream();
    }

    public static void main(String[] args) {
        zip(Stream.of("1", "2", "3", "4", "5"), Stream.of("A", "B", "C", "D", "E", "F", "G", "H", "I")).map(String::new).forEach(System.out::print);
    }
}
