package ProblemSolving.Heaps;

import java.util.*;

public class Main {
    /**
     * min and max Heaps in java
     * */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(44,562,678,311,200,21);
        // Returns list in sorted order
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(list);
        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll());
        }

        // Returns list in reverse sorted order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.addAll(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(maxHeap.poll());
        }
    }
}
