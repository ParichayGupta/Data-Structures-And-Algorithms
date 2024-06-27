package ProblemSolving;

import static java.util.Collections.swap;

public class StringCombinations {

    /**
     * Given a String "abcd", we need to generate all unique combinations like "dcba", bcda, cbda, cdab, dbca, dcab, bacd, bcad, bdac, bdca, cabd, cadb, cbad, cbda, dabc, dacb, dbac, dbca, acbd, acdb, adbc, adcb
     */
    public static void main(String[] args) {
        String str = "aniruddh";
        generateCombinations(str, 0, str.length() - 1);
    }

    private static void generateCombinations(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                generateCombinations(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
