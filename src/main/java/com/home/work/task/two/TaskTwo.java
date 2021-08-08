package com.home.work.task.two;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {
    public static List<String> sortList(List<String> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
    List<String> list = new ArrayList();

        list.add("Maks");
        list.add("Nik");
        list.add("Luda");
        list.add("Illya");
        System.out.println(sortList(list));
    }
}
