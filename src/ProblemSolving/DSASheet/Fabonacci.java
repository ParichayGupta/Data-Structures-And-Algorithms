package ProblemSolving.DSASheet;

public class Fabonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fabonacci(n));
    }

    private static int fabonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fabonacci(n - 1) + fabonacci(n - 2);
    }
}
