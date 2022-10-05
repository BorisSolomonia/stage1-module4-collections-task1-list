package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.stream().sorted(new ListComparator());
        sourceList.stream().forEach(System.out::println);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        Integer k = Integer.valueOf(a);
        Integer z = Integer.valueOf(b);
        if(k < 0){
            k *=-1;
        }
        if (z < 0){
            z *=-1;
        }
        System.out.println("printing "+(k-z));
        return k - z;
    }
}
