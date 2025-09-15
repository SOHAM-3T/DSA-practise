class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            swap(arr,i,n-i-1);
        }
    }
    
    void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}