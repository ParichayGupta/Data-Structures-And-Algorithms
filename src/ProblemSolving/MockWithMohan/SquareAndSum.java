package ProblemSolving.MockWithMohan;

import java.util.List;
import java.util.stream.Collectors;

public class SquareAndSum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(squareAndSum(list));
        System.out.println(squareAndSumUsingStreams(list));
    }

    private static int squareAndSum(List<Integer> list){
        int sum = 0;
        for(int i: list){
            sum += i * i;
        }
        return sum;
    }

    private static int squareAndSumUsingStreams(List<Integer> list){
//        return list.stream().map(e -> e * e).mapToInt(Integer::intValue).sum(); // 55
//        return list.stream().map(e -> e * e).reduce(0, Integer::sum); // 55
//        return list.stream().map(e -> e * e).reduce(0, (a, b) -> a + b); // 55
//        return list.stream().map(e -> e * e).mapToInt(i -> i).sum(); // 55
        return list.stream().collect(Collectors.summingInt(e -> e * e)); // 55

    }

}
