package ProblemSolving.MockWithMohan;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    private static char firstUniqChar(String s){

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(char c: s.toCharArray()){
            if(map.get(c) == 1){
                return c;
            }
        }
        return ' ';
    }
}
