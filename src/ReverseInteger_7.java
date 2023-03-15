public class ReverseInteger_7 {
    public int reverse(int x) {
        String xx = String.valueOf(x);
        StringBuilder xx1 = new StringBuilder();

        if(xx.charAt(0) == '-'){
            xx1 = new StringBuilder("-");
        }

        for (int i = xx.length() - 1 ; i >= 0 ; i--) {
            if(i == 0){
                if (xx.charAt(i) == '-')
                    break;
            }
            xx1.append(xx.charAt(i));
        }

        System.out.println(xx1);

        return Integer.parseInt(String.valueOf(xx1));
    }
}
