package ProblemSolving.MockWithMohan;

import java.util.Arrays;
import java.util.List;

public class SquareAndSortElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-4,-3,-1,2,5,6);
        System.out.println(squareAndSort(list).toString());
    }
    private static List<Integer> squareAndSort(List<Integer> list){
        int[] arr = new int[list.size()];
        int l = 0, r = list.size() - 1;
        int i = list.size() - 1;
        while(l <= r){
            int left = list.get(l) * list.get(l);
            int right = list.get(r) * list.get(r);
            if(left > right){
                arr[i] = left;
                l++;
            }else{
                arr[i] = right;
                r--;
            }
            i--;
        }
        return Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
    }
}
