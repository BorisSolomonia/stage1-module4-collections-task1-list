package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> oddEvenLinkList = new LinkedList<>();
        for (Integer k: sourceList) {
            if (k%2 == 0){
                oddEvenLinkList.addLast(k);
            }else {
                oddEvenLinkList.addFirst(k);
            }
        }
        return oddEvenLinkList;
    }
}
