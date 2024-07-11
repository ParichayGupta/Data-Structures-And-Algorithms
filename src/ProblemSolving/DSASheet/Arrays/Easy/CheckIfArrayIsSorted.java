package ProblemSolving.DSASheet.Arrays.Easy;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        /*
         *
         *
         *  Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
         * There may be duplicates in the original array.
         * Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
         * Example 1:
         * Input: nums = [3,4,5,1,2]
         * Output: true
         * Explanation: [1,2,3,4,5] is the original sorted array.
         * You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
         *
         * Example 2:
         * Input: nums = [2,1,3,4]
         * Output: false
         * Explanation: There is no sorted array once rotated that can make nums.
         *
         * Example 3:
         * Input: nums = [1,2,3]
         * Output: true
         *
         * Explanation: [1,2,3] is the original sorted array. You can rotate the array
         * by x = 0 positions (i.e. no rotation) to make nums.
        * */
        int[] arr = new int[]{3,4,5,1,2};
        System.out.println(check(arr));
        arr = new int[]{2,1,3,4};
        System.out.println(check(arr));
        arr = new int[]{1,2,3};
        System.out.println(check(arr));
        arr = new int[]{111,2,34,66,77,77,88};
        System.out.println(check(arr));
    }

    private static boolean check(int[] arr) {
        int count = 0;
        if(arr[0] < arr[arr.length - 1]){
            count++;
        }

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}
