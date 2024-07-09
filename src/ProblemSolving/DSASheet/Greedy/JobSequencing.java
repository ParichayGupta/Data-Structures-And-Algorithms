package ProblemSolving.DSASheet.Greedy;

import java.util.Arrays;
import java.util.Collections;

public class JobSequencing {
    public static void main(String[] args) {
        int[] profits = {20, 15, 10, 5, 1};
        int[] deadlines = {2, 2, 1, 3, 3};
        int maxProfit = maxProfit(profits, deadlines);
        System.out.println("Maximum profit is " + maxProfit);
        profits = new int[]{100, 19, 27, 25, 15};
        deadlines = new int[]{2,1,2,1,1};
        maxProfit = maxProfit(profits, deadlines);
        System.out.println("Maximum profit is " + maxProfit);
    }

    private static int maxProfit(int[] profits, int[] deadlines){
        int maxDeadline = Arrays.stream(deadlines).max().getAsInt();
//        Arrays.sort(profits, (a, b) -> Integer.compare(b, a));
        int n = profits.length;
        int ans = 0;
        int[] job = new int[maxDeadline];
        Arrays.fill(job, -1);
        for(int i = 0; i < n; i++){
            for(int j = deadlines[i] - 1; j >= 0; j--){
                if(job[j] == -1){
                    job[j] = i;
                    ans += profits[i];
                    break;
                }
            }
        }

        return ans;
    }
}
