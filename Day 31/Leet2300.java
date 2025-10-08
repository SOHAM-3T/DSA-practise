import java.util.Arrays;
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length, m = potions.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            long spell = spells[i];
            int left = 0, right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (spell * potions[mid] >= success)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            // left is now the first successful index
            result[i] = m - left;
        }
        return result;
    }
}
