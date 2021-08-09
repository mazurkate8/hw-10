package com.home.work.task.three;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskThree {
    public static String sortArray(String[] arr){
        List<String> list =  Arrays.asList(arr);

        String tmp =  list.stream()
                .map(n->n.replace(",,", ","))
                .collect(Collectors.toSet())
                .stream()
                .sorted()
                .collect(Collectors.joining(","))
                .replaceAll(" ", "");

        String[] tmpArr = tmp.split(",");

        return Arrays.stream(tmpArr)
                .map(Integer::valueOf)
                .collect(Collectors
                .toList())
                .stream()
                .sorted()
                .collect(Collectors.toList())
                .stream().map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        System.out.println(sortArray(new String[]{"1, 200, 0", "400, 5", "7, 6669"}));
    }
}
