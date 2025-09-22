class Solution {
    public String intToRoman(int num) {
        String[] RomanCode = {"M", "CM", "D", "CD", "C", "XC", "L","XL", "X", "IX", "V", "IV","I"};
        int[] DecimalVal = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        StringBuilder roman = new StringBuilder();
        for(int i=0; i<RomanCode.length;i++){
            while(num >= DecimalVal[i]){
                num -= DecimalVal[i];
                roman.append(RomanCode[i]);
            }
        }
        return roman.toString();
    }
}