class Solution {
    public int[] replaceElements(int[] arr) {
        int N = arr.length;
        for(int l=0;l<N;l++){
            arr[l] = greatest(arr,l);
        }        
        return arr;
    }
    public int greatest(int[] arr,int i){
        int m = Integer.MIN_VALUE;
        int n = arr.length;
        for(int k=i+1;k<n;k++){
            if(arr[k]>m){
                m = arr[k];
            }
        }
        if(m!=Integer.MIN_VALUE){
            return m;
        }
        return -1;
    }
}
