package ProblemSolving.GoldmanSachs.RainWaterTrapping;

public class RainWaterTrapping_Prefix {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};;
        long startTime = System.currentTimeMillis();
        System.out.println("Maximum water that can be accumulated: "+maxWater(arr));
        long endTime = System.currentTimeMillis();
    }

    private static int maxWater(int[] arr){
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int ans = 0;

        leftMax[0] = arr[0];
        rightMax[0] = arr[arr.length - 1];

        for(int i = 1; i < arr.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(leftMax[i]+" ");
        }
        System.out.println();

        for(int i = arr.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(rightMax[i]+" ");
        }

        for(int i = 0; i < n; i++){
            ans += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        return ans;
    }
}
