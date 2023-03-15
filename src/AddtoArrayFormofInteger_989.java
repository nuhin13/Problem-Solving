import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger_989 {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> result = new ArrayList<>();

        int carry = 0;
        for (int i = num.length -1; i >= 0; i--) {
            int item = num[i] + k%10 + carry;
            k = k/10;

            if (item > 9)
                carry = 1;
            else
                carry = 0;

            result.add(item%10);
        }

        while (k!=0){
            int item = k%10 + carry;
            k = k/10;
            if (item > 9)
                carry = 1;
            else
                carry = 0;
            result.add(item%10);
        }

        if(carry > 0)
            result.add(carry);

        Collections.reverse(result);
        System.out.println(result);
        return result;
    }

}
