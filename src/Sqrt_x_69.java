public class Sqrt_x_69 {
    public int mySqrt(int x) {
        int previousValue = 0;

        for (int i = 1; i < 2147483647/2;) {

            int mul = i * i;
            System.out.println(mul);
            if (mul <= x) {
                previousValue = i;
                i++;
            } else break;
        }

        return previousValue;
    }
}
