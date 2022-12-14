package com.company;

import java.util.Comparator;

public class SortByArrival implements Comparator<Process> {
    @Override
    public int compare(Process o1, Process o2) {
        return o1.getArrivalTime()-o2.getArrivalTime();
    }
}
