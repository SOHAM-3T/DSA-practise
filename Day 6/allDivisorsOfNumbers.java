import java.util.*;
class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> divisors = new ArrayList<>();
        int num = (int)Math.sqrt(n);
        for(int i=1;i<=num;i++){
            if(n%i==0){
                divisors.add(i);
                if(i!=n/i){
                    divisors.add(n/i);
                }
            
            }
            
        }
        Collections.sort(divisors);
        for(int i : divisors){
            System.out.print(i);
            System.out.print(' ');
        }
    }
}
