package com.fogliene;

import java.util.ArrayList;
import java.util.List;

public class Main20200829 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new Integer[] {4, 3, 2, 4, 1, 3, 2}));
    }

    private static Integer singleNumber(Integer[] arr) {
        List<Integer> numberList = new ArrayList<>();

        for (Integer i : arr) {
            if (numberList.contains(i)) {
                numberList.remove(i);
            } else {
                numberList.add(i);
            }
        }

        return numberList.get(0);
    }
}
