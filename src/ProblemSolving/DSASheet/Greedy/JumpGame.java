package ProblemSolving.DSASheet.Greedy;

public class JumpGame {

    /*
    * Given an integer array, element at an index is the maximum jump length you can make from that index.
    * Determine if you are able to reach the last index.
    *
    * */

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 1, 4};
        System.out.println(canJump(arr)); // true
        arr = new int[]{3, 2, 1, 0, 4};
        System.out.println(canJump(arr)); // false
    }

    private static boolean canJump(int[] arr){
        int maxJump = 0;
        for(int i = 0; i < arr.length; i++){
            if(i > maxJump) return false;
            maxJump = Math.max(maxJump, i + arr[i]);
        }
        return true;
    }
}

/*
* Idea:
*
* - If there are no zeros in the array, we are 100% sure that we can reach till the last index.
* - if there are zeros, and we are able to cross all the zeros from any index, we can reach till the last index.
* - So, we need to check if we are able to cross all the zeros from any index.
* - We can do this by checking if the current index is greater than the maximum jump we can make.
* - If it is, we can't cross the zero, so we return false.
* - If it is not, we update the maximum jump we can make.
*
* */
