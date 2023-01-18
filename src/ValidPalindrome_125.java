public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder value = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 48 && s.charAt(i) <= 57) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                value.append(s.charAt(i));
            }
        }

        System.out.println(value);

        int i = 0;
        int j = value.length() - 1;

        while (i < j) {
            if (value.charAt(i) == value.charAt(j)) {
                i++;
                j--;
            } else
                return false;
        }

        return true;
    }
}
