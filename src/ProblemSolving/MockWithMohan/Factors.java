package ProblemSolving.MockWithMohan;

import java.util.ArrayList;
import java.util.List;

public class Factors {

    public static void main(String[] args) {
        System.out.println(factors(100));
    }

    private static List<Integer> factors(int n){
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i <= n/i; i++){
            if(n % i == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
