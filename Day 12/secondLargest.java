class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return -1;

        int max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                s_max = max;
                max = num;
            } else if (num < max && num > s_max) {
                s_max = num;
            }
        }

        return (s_max == Integer.MIN_VALUE) ? -1 : s_max;
    }
}
