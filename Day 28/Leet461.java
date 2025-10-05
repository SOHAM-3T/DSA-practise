class Solution {
    public int hammingDistance(int x, int y) {
        String result = Integer.toBinaryString(x^y);
        int count = 0;
        for(char i : result.toCharArray()){
            if(i=='1'){
                count++;
            }
        }
        return count;
    }
}