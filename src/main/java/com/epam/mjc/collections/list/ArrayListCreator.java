package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> threeDelimeter = new ArrayList<>();
        for (String k: sourceList) {
            if ((sourceList.indexOf(k)+1)%3 == 0){
                threeDelimeter.add(k);
                threeDelimeter.add(k);
            }
        }
        return threeDelimeter;
    }
}
