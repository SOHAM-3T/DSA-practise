import java.util.Arrays;
class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i = a.length - 1;
        int j = 0;
        while (i >= 0 && j < b.length) {
            if (a[i] < b[j])
                i--;
            else {
                int temp = b[j];
                b[j] = a[i];
                a[i] = temp;
                i--;
                j++;
            }
        }
        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
