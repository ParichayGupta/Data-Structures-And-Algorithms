package ProblemSolving.DSASheet.Arrays.Easy;

public class SecondLargestElementWithoutSorting {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE + 1;

        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j < secondMax) {
                secondMax = j;
            }
        }
        return secondMax;
    }
}
