package ProblemSolving.GoldmanSachs;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    /**
     * Check whether two Strings are Isomorphic or not. ex- "aab" and "xyx" are isomorphic.
     * */
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        System.out.println(isIsomorphic(s1, s2));
    }

    private static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            if (m1[s1.charAt(i)] != m2[s2.charAt(i)]) {
                return false;
            }
            m1[s1.charAt(i)] = i + 1;
            m2[s2.charAt(i)] = i + 1;
        }
        return true;
    }

    public static boolean isomorphic(String s1, String s2) {
        Map<Character, Character> s1Map = new HashMap<>();
        Map<Character, Character> s2Map = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (s1Map.containsKey(c1)) {
                if (s1Map.get(c1) != c2) {
                    return false;
                }
            } else {
                s1Map.put(c1, c2);
            }
            if (s2Map.containsKey(c2)) {
                if (s2Map.get(c2) != c1) {
                    return false;
                }
            } else {
                s2Map.put(c2, c1);
            }
        }
        return true;
    }
 }
