package ProblemSolving.GoldmanSachs;

public class CountOccurrencesOfCharacters {
    public static void main(String args[]){
        String s = "aaaabbbbccddddkk";
        System.out.println(countOccurrencesOfCharacters(s));
    }
    private static String countOccurrencesOfCharacters(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i+1) == s.charAt(i)){
                count++;
            }else{
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1)).append(count);
        return sb.toString();
    }
}
