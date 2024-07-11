package ProblemSolving.DSASheet.Arrays.Easy;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 2, 3, 4, 5 };
        System.out.println(largestElement(arr));
        arr = new int[]{9,6,4,99,223,44422,56,5,224,8765,3122,4589 };
        System.out.println(largestElement(arr));
        arr = new int[]{ 2,4,6,1,7,9};
        System.out.println(largestElement(arr));
        arr = new int[]{12,344,99,67,8121,9468,233,2332,56,7044,833,7636,33114,300,2890,22,4,};
        System.out.println(largestElement(arr));
    }

    private static int largestElement(int[] arr){
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            };
        }
        return largest;
    }
}
