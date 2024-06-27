package ProblemSolving.GoldmanSachs;

public class FirstHalfEqualsSecondHalf {
    /**
     *
     * Given a String, check whether the first half of the string is equal to the second half of the string.
     *
     * for ex: "abab" -> true
     *        "abba" -> false
     *        "abcabc" -> true
     *        "abc" -> false
     * */
    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(isFirstHalfEqualsSecondHalf(s));
    }

    private static boolean isFirstHalfEqualsSecondHalf(final String s) {
        int n = s.length();
        int p1 = 0;
        int p2 = n/2;
        if(n % 2 != 0) {
            p2 = p2 + 1;
        }
        while(p2 < n) {
            if(s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++;
            p2++;
        }
        return true;
    }

}
