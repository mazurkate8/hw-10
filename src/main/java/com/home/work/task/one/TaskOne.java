package com.home.work.task.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskOne {
    public static String convertToString(List<String> names) {
        return IntStream
                .range(0, names.size())
                .filter(index -> index%2 != 0)
                .mapToObj(index-> index + ". " + names.get(index))
                .collect(Collectors.joining( ", "));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("Maks");
        list.add("Nik");
        list.add("Luda");
        list.add("Illya");
        System.out.println(convertToString(list));
    }
}
