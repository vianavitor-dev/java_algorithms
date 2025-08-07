package com.vianavitor.algorithms.search;

import java.util.List;

public class SimpleSearch implements SearchInterface<Integer> {
    private List<Integer> values;

    public SimpleSearch(List<Integer> values) {
        this.values = values;
    }

    @Override
    public Integer execute(int x) {
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) == x) {
                return i;
            }
        }

        return null;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }
}
