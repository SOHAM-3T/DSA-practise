class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--; 
            int rem = n % 26; 
            char ch = (char)('A' + rem); 
            sb.append(ch);
            n = n / 26;
        }
        sb.reverse(); 
        return sb.toString();
    }
}
