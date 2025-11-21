class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxSoFar = -1;                // for the last element result is -1
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxSoFar;            // replace current with max seen to its right
            if (current > maxSoFar) {
                maxSoFar = current;       // update max for the next iteration (leftwards)
            }
        }
        return arr;
    }
}