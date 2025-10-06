class Solution {
    public int findComplement(int num) {
        String binString = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(char i : binString.toCharArray()){
            if(i=='0'){
                sb.append("1");
            }
            else{
                sb.append("0");
            }
        }
        String result = sb.toString();
        return Integer.parseInt(result,2);
    }
}