class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int j = 0;
        int m = spaces.length;
        for(int i = 0; i < n; i++){
            if(j<m && i==spaces[j]){
                sb.append(" ");
                sb.append(s.charAt(i));
                j++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}