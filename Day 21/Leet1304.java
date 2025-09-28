class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int idx = 0;
        if(n%2!=0){
            result[idx] = 0;
            idx++;
            return helper(result,idx,n);
        }
        return helper(result,idx,n);
    }
    public int[] helper(int[] res,int index,int n){
        int a = 1;
        while(index<n){
            res[index++] = a;
            res[index++] = -a;
            a++;
        }
        return res;
    }
}