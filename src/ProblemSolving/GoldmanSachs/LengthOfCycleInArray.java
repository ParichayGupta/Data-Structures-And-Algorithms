package ProblemSolving.GoldmanSachs;

import java.util.HashSet;

public class LengthOfCycleInArray {

    /*
    * 1.Length of cycle in an Array: Given an array, and the starting Index. Find the length of cycle exist in the array. Each element in array is the next index you can go. If there is no cycle return -1.

        for example: arr[] = {1,2,0} statingIndex = 0;
        Explanation:
        we start from index 0, check the element at that index i.e. 1, So we will go to 1st Index.
        then check element at 1st index, i.e. 2, So we will go to 2nd index.
        then check the element at 2nd Index, i.e. 0, So we will go to 0th index.
        and here we found a cycle. So we have to return the elements in the cycle i.e. 3 (1,2,0);

        Answer for above example: 3.
    * */

    public static void main(String[] args) {
        int[] arr = {1,2,0};
        int startingIndex = 0;
        System.out.println(lengthOfCycleInArray(arr, startingIndex));
        System.out.println(lengthOfCycle(arr, startingIndex));
    }

    private static int lengthOfCycleInArray(int[] arr, int startingIndex){
        int slow = startingIndex;
        int fast = startingIndex;
        int length = 0;
        while (fast < arr.length && arr[fast] < arr.length) {
            slow = arr[slow];
            fast = arr[arr[fast]];
            if (slow == fast) {
                int temp = slow;
                length++;
                slow = arr[slow];
                while (temp != slow) {
                    slow = arr[slow];
                    length++;
                }
                return length;
            }
        }
        return -1;
    }

    private static int lengthOfCycle(int[] arr, int startingIndex){
        HashSet<Integer> set = new HashSet<>();
        int i = startingIndex;
        int count = 0;
        while(!set.contains(arr[i])){
            count++;
            set.add(arr[i]);

            if(arr[i] < 0 || arr[i] >= arr.length){
                return -1;
            }else{
                i = arr[i];
            }
        }
        return count == 0 ? -1 : count;
    }
}
