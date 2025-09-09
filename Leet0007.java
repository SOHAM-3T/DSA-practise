/*
Method 1 
class Solution {
    int power(int x,int y){//x power y => x.x.x.....(y times)
        int product = 1;
        for(int i=0;i<y;i++){
            product *= x;
        }
        return product;
    }
    int length(int num){
        int count = 0;
        if(num < 0) num = -num;
        if(num == 0) return 1; 
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }

    public int reverse(int x) {
        int y;
        if(x<0){
            y = -1*x;
        }
        else{
            y = x;
        }
        int rev = 0;
        int rem;
        int n = length(x)-1;
        while(y>0){
            rem = y%10;
            rev += rem*power(10,n);
            y = y/10;
            n -= 1;
        }
        if(x<0){
            return -1*rev;
        }
        return rev;
    }

}
Conclusion : Integer overflow for large numbers
*/
//Method 2
class Solution {
    public int reverse(int x) {
        long rev = 0; 
        
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}