package ProblemSolving.GoldmanSachs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumAverageMarks {
    public static void main(String[] args) {
        /*
        * Given a 2D array of Student and their marks, find the maximum average marks of students.
        * if average is in decimal, consider the nearest integer.
        * */

        List<List<String>> students = List.of(
                List.of("jerry", "65"),
                List.of("bob", "91"),
                List.of("jerry", "23"),
                List.of("Eric", "21"),
                List.of("bob", "69"),
                List.of("bob", "69"));
        System.out.println(maxAverageMarks(students));
    }

    public static int maxAverageMarks(List<List<String>> students) {
        Map<String, Integer> studentMarks = new HashMap<>();
        Map<String, Integer> studentCount = new HashMap<>();

        for(List<String> student : students) {
            String name = student.get(0);
            int marks = Integer.parseInt(student.get(1));

            studentMarks.put(name, studentMarks.getOrDefault(name, 0) + marks);
            studentCount.put(name, studentCount.getOrDefault(name, 0) + 1);
        }

        int maxAverage = 0;
        for(Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            String name = entry.getKey();
            int marks = entry.getValue();
            int count = studentCount.get(name);

            int average = marks / count;
            maxAverage = Math.max(maxAverage, average);
        }
        return maxAverage;
    }
}
