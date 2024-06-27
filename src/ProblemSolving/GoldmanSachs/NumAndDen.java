package ProblemSolving.GoldmanSachs;

import java.util.HashMap;

public class NumAndDen {
    public static void main(String[] args) {
        NumAndDen obj = new NumAndDen();
        System.out.println(obj.fractionToDecimal(500, 99));
    }
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        // "+" or "-"
        res.append(((numerator > 0) ^ (denominator > 0)) ? "-" : "");
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // integral part
        res.append(num / den);
        num %= den;
        if (num == 0) {
            return res.toString();
        }

        // fractional part
        res.append(".");
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        map.put(num, res.length());
        while (num != 0) {
            num *= 10;
            res.append(num / den);
            num %= den;
            if (map.containsKey(num)) {
                int index = map.get(num);
                res.insert(index, "(");
                res.append(")");
                break;
            } else {
                map.put(num, res.length());
            }
        }
        return res.toString();
    }
}
/**
The NumAndDen class contains a method fractionToDecimal that converts a fraction to a decimal string representation. If the fractional part is repeating, it encloses the repeating part in parentheses.  Here's a breakdown of the fractionToDecimal method:
It first checks if the numerator is 0. If it is, it returns "0" because any number divided by 0 is 0.
It then initializes a StringBuilder to build the result string.
It checks if the result should be negative. If the numerator and denominator have different signs, it appends a "-" to the result string.
It converts the numerator and denominator to absolute values to avoid overflow and to simplify further calculations.
It calculates the integral part of the result by dividing the numerator by the denominator and appends it to the result string.
If there is no remainder (i.e., the numerator is divisible by the denominator), it returns the result string.
If there is a remainder, it appends a "." to the result string to start the fractional part.
It creates a HashMap to store the remainder and the length of the result string. This is used to detect if the fractional part starts repeating.
It enters a loop that continues until the remainder is 0. In each iteration:
    It multiplies the remainder by 10 to calculate the next digit of the fractional part.
    It appends the result of the division of the remainder by the denominator to the result string.
    It updates the remainder to be the remainder of the division.
    If the remainder is already in the HashMap, it means the fractional part started repeating. It inserts a "(" at the index where the repeating part started and appends a ")" to the result string, then breaks the loop.
    If the remainder is not in the HashMap, it adds the remainder and the current length of the result string to the HashMap.
Finally, it returns the result string.


*/