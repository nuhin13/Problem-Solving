public class ReverseBits_190 {
    public int reverseBits(int n) {


        double sum = 0;

        String binary = String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0");

        for (int i = 31; i >= 0; i--) {

            System.out.println((Math.pow(2, 31-i)) * (binary.charAt(i) - 48));
            //System.out.println((int)(Math.pow((int) binary.charAt(i) * 2 - 96, 31-i)));

            sum = (sum + (Math.pow(2, 31-i)) * (binary.charAt(i) - 48));
        }

        System.out.println(sum);

        return (int) sum;

    }
}
