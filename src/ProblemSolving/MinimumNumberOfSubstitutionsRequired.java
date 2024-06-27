package ProblemSolving;

public class MinimumNumberOfSubstitutionsRequired {

    /*
    *   minimum number of substitutions required to make a string such that no two characters comes together.
    *
    * for ex: abaaaba -> 1 substitution required -> abababa
    * */

    public static void main(String[] args) {
        String s = "ababaaac";
        System.out.println(minimumSubstitutions(s));
    }

    private static int minimumSubstitutions(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
