public class PowerOfTwo_231 {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        if(n == 2 || n ==1) return true;
        if(n%2 == 1) return false;

        System.out.println(n);
        return isPowerOfTwo(n/2);
        //return true;
    }
}
