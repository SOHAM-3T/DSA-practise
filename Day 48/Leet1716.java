class Solution {
    public int totalMoney(int n) {
        int result = 0;
        int start = 1; 

        for (int i = 0; i < n; i++) {
            result += start + (i % 7); 
            if ((i + 1) % 7 == 0) { 
                start++;
            }
        }

        return result;
    }
}
