package com.vianavitor.algorithms.search;

import java.util.List;

public class BinarySearch implements SearchInterface<Integer> {
    private List<Integer> values;

    public BinarySearch(List<Integer> values) {
        this.values = values;
    }

    /**
    This function is designed to return the index of the number inside the array.
    Where this operation will apply the Binary Search algorithm.
     @param x the number to be found into the ´values´
     @return null if not found the ´x´ otherwise return the index of `x` in the list
     */
    @Override
    public Integer execute(int x) {
        int right = values.size() - 1; // max length index
        int left = 0; // min length index

        while (left <= right) {
            int middle = (left + right) / 2;
            int guess = values.get(middle);

            if (guess == x) {
                return middle;
            }
            if (guess > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return null;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    public List<Integer> getValues() {
        return values;
    }
}
