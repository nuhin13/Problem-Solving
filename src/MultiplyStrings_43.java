import java.util.Arrays;

public class MultiplyStrings_43 {

    //Incomplete
    public String multiply(String num1, String num2) {

        if (num1.length() == 1 && num2.length() == 1) {
            return String.valueOf(Integer.parseInt(String.valueOf(num2.charAt(0)))
                    * Integer.parseInt(String.valueOf(num1.charAt(0))));
        }

        int[] result = new int[num1.length() + num2.length()];
        int indicator;
        int indicatorCopy = result.length;

        for (int i = num2.length() - 1; i >= 0; i--) {
            int carry = 0;
            indicatorCopy--;
            indicator = indicatorCopy;

            for (int j = num1.length() - 1; j >= 0; j--) {
                int product = Integer.parseInt(String.valueOf(num2.charAt(i))) *
                        Integer.parseInt(String.valueOf(num1.charAt(j))) +
                        carry + result[indicator];
                System.out.println(product + " " + indicator);
                result[indicator] = product % 10;
                carry = product / 10;

                System.out.println(result[indicator] + " "  + carry);
                indicator--;
            }
        }

        System.out.println(Arrays.toString(result));
        StringBuilder resultBuilder = new StringBuilder();
        boolean flag = false;
        for (int j : result) {
            if(j!=0 && !flag)
                flag = true;

            if (flag)
                resultBuilder.append(j);
        }

        if(resultBuilder.toString().isEmpty())
            return "0";

        System.out.println(resultBuilder);
        return resultBuilder.toString();
    }
}
