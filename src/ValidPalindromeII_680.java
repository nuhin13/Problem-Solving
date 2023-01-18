public class ValidPalindromeII_680 {

    //Not Complete
    public boolean validPalindrome(String value) {
        int i = 0;
        int j = value.length() - 1;
        int itemDeleted = 0;

        while (i < j) {
            System.out.println(value.charAt(i) + " " + value.charAt(j));

            if ((value.charAt(i) == value.charAt(j)) && itemDeleted < 2) {
                System.out.println(itemDeleted + " ");
                i++;
                j--;
            } else {
                if (itemDeleted == 0) {
                    if(value.charAt(i+1) == value.charAt(j)) i++;
                    else j--;

                    System.out.println(itemDeleted + "  2");
                    itemDeleted = 1;
                } else {
                    System.out.println(itemDeleted + "  3");
                    return false;
                }

            }
        }

        return true;
    }
}
