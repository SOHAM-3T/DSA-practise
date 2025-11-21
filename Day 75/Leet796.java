class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String temp = s + s;
        return isSubstring(temp,goal);
    }
    public boolean isSubstring(String str1,String str2){
        int m = str1.length();
        int n = str2.length();
        for(int i=0;i<m-n+1;i++){
            for(int j=0;j<n;j++){
                if(str1.charAt(i+j)!=str2.charAt(j)){
                    break;
                }
                else if(j==n-1){
                    return true;
                }
            }
        }
        return false;
    }
}