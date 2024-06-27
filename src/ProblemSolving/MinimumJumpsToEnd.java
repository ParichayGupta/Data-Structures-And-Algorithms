package ProblemSolving;

public class MinimumJumpsToEnd {
    public static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return 0; // No jumps needed for an empty array or single element
        }

        int maxReach = arr[0]; // Maximum reachable index
        int steps = arr[0]; // Steps remaining at current index
        int jumps = 1; // Initialize jumps to 1 (starting from the first element)

        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jumps; // Reached the end
            }

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            if (steps == 0) {
                if (i >= maxReach) {
                    return -1; // Cannot proceed further
                }
                steps = maxReach - i;
                jumps++;
            }
        }

        return -1; // End is not reachable
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int result = minJumps(arr);
        System.out.println("Minimum number of jumps to reach the end is " + result);
    }
}
