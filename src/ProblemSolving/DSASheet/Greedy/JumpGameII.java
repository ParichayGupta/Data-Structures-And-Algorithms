package ProblemSolving.DSASheet.Greedy;

public class JumpGameII {

    /**
     * Given an array, you can move from the ith index to i + arr[i] index.
     * Find the minimum number of jumps to reach the last index.
     * */
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 1, 4};
        System.out.println(jump(arr)); // 2
        arr = new int[]{2, 3, 0, 1, 4};
        System.out.println(jump(arr)); // 2
        arr = new int[]{2,3,1,5,1,1,1,3};
        System.out.println(jump(arr)); // 3
    }

    private static int jump(int[] arr){
        int near = 0; int far = 0;
        int jumps = 0;
        // till the time, far is smaller is than the last index
        while(far < arr.length - 1){
            int farthest = 0;
            for(int i = near; i <= far; i++){
                farthest = Math.max(farthest, i + arr[i]);
            }
            jumps++;
            near = far + 1;
            far = farthest;
        }
        return jumps;
    }
}
