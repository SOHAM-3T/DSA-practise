class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0"; 
        
        boolean isNegative;
        if(num<0){
            isNegative = true;
        }
        else{
            isNegative = false;
        }
        int x = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            sb.append(x % 7);
            x /= 7;
        }
        if (isNegative){
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}
