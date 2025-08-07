package com.vianavitor.algorithms;

import com.vianavitor.algorithms.search.BinarySearch;
import com.vianavitor.algorithms.search.SimpleSearch;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            values.add(i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        BinarySearch binarySearch = new BinarySearch(values);
        System.out.println("Binary Search: " + binarySearch.execute(x));

        SimpleSearch simpleSearch = new SimpleSearch(values);
        System.out.println("Simple Search: " + simpleSearch.execute(x));
    }
}