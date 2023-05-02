public class AddDigits_258 {
    public int addDigits(int num) {
        int result = 0;

        while (num != 0){
            int temp = num % 10;
            result = result + temp;
            num = num/10;

            if(num == 0 && result > 9){
                num = result;
                result = 0;
            }
        }

        System.out.println(result);

        return result;
    }
}
