package com.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromLinkedList {
    public static void main(String[] args) {
        //LinkedList linkedList = null;
        RemoveDuplicateFromLinkedList.LinkedList input = new RemoveDuplicateFromLinkedList.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        //List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        RemoveDuplicateFromLinkedList.LinkedList output = new RemoveDuplicateFromLinkedList().removeDuplicatesFromLinkedList(input);
        System.out.println("REMOVE DUPLICATE LINKED LIST::" +output);
    }

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList removeDuplicatesFromLinkedList ( LinkedList linkedList){
        LinkedList currentNode = linkedList;
        while (currentNode!=null) {
            LinkedList nextDistinctNode = currentNode.next;
            while ((nextDistinctNode != null && nextDistinctNode.value == currentNode.value)) {
                nextDistinctNode = nextDistinctNode.next;
            }
            currentNode.next = nextDistinctNode;
            currentNode = nextDistinctNode;
        }
        return  linkedList;
    }

/*
data setup *************************
 */
    public static RemoveDuplicateFromLinkedList.LinkedList addMany(RemoveDuplicateFromLinkedList.LinkedList ll, List<Integer> values) {
        RemoveDuplicateFromLinkedList.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new RemoveDuplicateFromLinkedList.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(RemoveDuplicateFromLinkedList.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        RemoveDuplicateFromLinkedList.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }



}
