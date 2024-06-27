package ProblemSolving;

import java.util.*;

public class OverlappingIntervals {
    public static void main(String[] args) {
        List<List<Integer>> intervals = new ArrayList<>();
        List<Integer> i1 = new ArrayList<>();
        i1.add(2);
        i1.add(6);
        List<Integer> i2 = new ArrayList<>();
        i2.add(1);
        i2.add(3);
        List<Integer> i3 = new ArrayList<>();
        i3.add(8);
        i3.add(10);
        List<Integer> i4 = new ArrayList<>();
        i4.add(15);
        i4.add(18);
        List<Integer> i5 = new ArrayList<>();
        i5.add(3);
        i5.add(6);
        intervals.add(i1);
        intervals.add(i2);
        intervals.add(i3);
        intervals.add(i4);
        intervals.add(i5);
        List<List<Integer>> ans = findOverLapping(intervals);

        for (List<Integer> a: ans) {
            for (int j : a) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> findOverLapping(List<List<Integer>> intervals){
        intervals.sort(Comparator.comparingInt(a -> a.get(0)));
        Set<List<Integer>> set = new TreeSet<>(Comparator.comparingInt(o -> o.get(0)));
        for(int i = 1; i < intervals.size(); i++){
           if(intervals.get(i-1).get(0) <= intervals.get(i).get(1)
                   && intervals.get(i-1).get(1) >= intervals.get(i).get(0)){
               set.add(intervals.get(i-1));
               set.add(intervals.get(i));
           }
        }

        return new ArrayList<>(set);
    }
}
