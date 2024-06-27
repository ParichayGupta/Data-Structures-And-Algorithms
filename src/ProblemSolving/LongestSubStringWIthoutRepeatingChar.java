package ProblemSolving;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWIthoutRepeatingChar {

    public static int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, maxLen = 0;

        Set<Character> set = new HashSet<>();

        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                maxLen = Math.max(maxLen, r - l + 1);
            }else{
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
            }
            r++;
        }
        return maxLen;
}

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
