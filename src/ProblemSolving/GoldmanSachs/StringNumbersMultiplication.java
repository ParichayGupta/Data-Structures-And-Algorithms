package ProblemSolving.GoldmanSachs;

public class StringNumbersMultiplication {

    /**
     * Multiply Two Large String of Numbers - Ex - "421" and "201" - Output - "84621"
     * */

    public static void main(String[] args) {
        String num1 = "421233928347298374982348238482384828383";
        String num2 = "201443256643232322342342342342342";
        System.out.println(multiply(num1, num2));
    }

    private static String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];
                result[i + j] += sum / 10;
                result[i + j + 1] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.isEmpty() && num == 0)) {
                sb.append(num);
            }
        }
        return sb.isEmpty() ? "0" : sb.toString();
    }
}
