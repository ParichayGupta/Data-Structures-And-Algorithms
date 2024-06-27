package ProblemSolving.GoldmanSachs;

public class StringToInteger {
    /*
    *  Given a string , return it’s integer value along with error fix in code.
    *
    *   input: "24"
    *   output: 24
    *
    *   input: "-2348854"
    *   output: -2348854
    *
    *   input: "24a"
    *   output: 24
    *
    *   input: "a24"
    *   output: -1
    *
    *   input: "24 5"
    *   output: 24
    *
    *   input: -2445ane
    *   output: -2445
    * */
    public static void main(String[] args) {
        String s = "  23663 abcce";
        System.out.println(stringToInteger(s));
    }

    private static int stringToInteger(String s){
        int i = 0;
        int sign = 1;
        int result = 0;
        if(s.isEmpty()) return -1;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && s.charAt(i) - '0' > 7)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }
        return result * sign;
    }
}
