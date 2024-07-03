package ProblemSolving.DSASheet.Greedy;

import java.util.Arrays;

public class AssignCookies {

    /**
     * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
     *
     * Each child i has a greed factor g[i],
     * which is the minimum size of a cookie that the child will be content with;
     * and each cookie j has a size s[j]. If s[j] >= g[i],
     * we can assign the cookie j to the child i, and the child i will be content.
     * Your goal is to maximize the number of your content children and
     * output the maximum number.
     *
     * Example 1:
     *
     * Input: g = [1,2,3], s = [1,1]
     * Output: 1
     * Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
     * And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
     * You need to output 1.
     * Example 2:
     *
     * Input: g = [1,2], s = [1,2,3]
     * Output: 2
     * Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
     * You have 3 cookies and their sizes are big enough to gratify all of the children,
     * You need to output 2.
     *
     * */
    public static void main(String[] args) {
        int[] childGreed = new int[]{1,2,3};
        int[] cookieSize = new int[]{1,1};
        System.out.println(findSatisfiedKids(childGreed, cookieSize));
        childGreed = new int[]{1,2};
        cookieSize = new int[]{1,2,3};
        System.out.println(findSatisfiedKids(childGreed, cookieSize));

        childGreed = new int[]{3,1,5,1,3,4};
        cookieSize = new int[]{1,3,1,2,4};
        System.out.println(findSatisfiedKids(childGreed, cookieSize));
    }

    private static int findSatisfiedKids(int[] childGreed, int[] cookieSize){
        int childPointer = 0; int cookiePointer = 0;
        Arrays.sort(childGreed);
        Arrays.sort(cookieSize);

        while(childPointer < childGreed.length && cookiePointer < cookieSize.length){
            if(childGreed[childPointer] <= cookieSize[cookiePointer]){
                childPointer++;
            }
            cookiePointer++;
        }
        return childPointer;
    }
}
