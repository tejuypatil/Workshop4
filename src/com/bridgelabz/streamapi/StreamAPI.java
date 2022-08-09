package com.bridgelabz.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(15);
        list1.add(5);
        list1.add(63);
        list1.add(67);

        list1.stream().forEach((x)-> System.out.println(x));

        List<Integer> list2 = list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> list3 =list1.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(list3);

        List<Integer> list4 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(list4);

        List<Integer>list5 =list1.stream().filter((x)-> x<=5).collect(Collectors.toList());
        list5.forEach((x)-> System.out.println(x));

        boolean anyMatching = list1.stream().filter(x -> x > 10).map(x -> x*15).anyMatch(x -> x%2==0);
        System.out.println(anyMatching);
        boolean allMatching = list1.stream().filter(x -> x % 2 != 0).map(x -> x * 15).allMatch(x -> x % 2 == 0);
        System.out.println(allMatching);
    }

}
