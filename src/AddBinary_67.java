public class AddBinary_67 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;


        while (i >= 0 || j >= 0) {
            int sum = carry;

            System.out.println(a.charAt(i--));
            j--;
            /*if (i >= 0)
                sum = sum + a.charAt(i--) - '0';
            if (j >= 0)
                sum = sum + a.charAt(j--) - '0';*/

            carry = sum > 1 ? 1 : 0;
            result.append(sum % 2);
        }

        if(carry != 0)
            result.append(carry);

        System.out.println(result.toString());
        result.reverse();

        System.out.println(result.toString());
        return result.toString();
    }
}
