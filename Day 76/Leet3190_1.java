import java.util.Arrays;
class Solution {
    public int minimumOperations(int[] nums) {
        int[] arr = Arrays.stream(nums).filter(n -> n % 3 != 0).toArray();
        int count = 0;
        for (int num : arr) {
            count += Math.min(mulplus3(num), mulminus3(num));
        }
        return count;
    }

    public int mulplus3(int N) {
        int steps = 0;
        while (N % 3 != 0) {
            N++;
            steps++;
        }
        return steps;
    }

    public int mulminus3(int N) {
        int steps = 0;
        while (N % 3 != 0) {
            N--;
            steps++;
        }
        return steps;
    }
}

