package ProblemSolving.GoldmanSachs.RainWaterTrapping;

public class BruteForceRainWaterTrapping {
    public static void main(String[] args) {
        int arr[] = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        long startTime = System.currentTimeMillis();
        System.out.println("Maximum water that can be accumulated: " + maxWater(arr));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Execution time: " + duration+ " milliseconds");
    }

    private static int maxWater(int[] arr) {
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                right = Math.max(right, arr[j]);
            }
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }

}
