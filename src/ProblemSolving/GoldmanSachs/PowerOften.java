package ProblemSolving.GoldmanSachs;

public class PowerOften {

    /**
     * Given an Integer, check if it is a power of 10.
     * */

    public static void main(String[] args) {
        System.out.println(isPowerOfTen(1000));
    }

    private static boolean isPowerOfTen(int n){
        if(n == 1) return true;
        if(n % 10 != 0) return false;
        return isPowerOfTen(n/10);
    }
}
