class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];
        int a,b;
        for(a=1;a<n;a++){
            b = n-a;
            if(!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")){
                result[0] =a;result[1]=b;
                return result;
            }
        }
        result[0]=-1;result[1]=-1;
        return result;

    }
}