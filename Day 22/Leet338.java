public class Leet338 {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            result[i] = noOfBits(i);
        }
        return result;
    }

    public int noOfBits(int num) {
        String a = binConv(num);
        int count = 0;
        for (char c : a.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    public String binConv(int N) {
        if (N == 0) return "0"; 
        String str = "";
        int x = N;
        while (x > 0) {
            int rem = x % 2;
            x = x / 2;
            str += rem;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
