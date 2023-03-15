import java.util.ArrayList;
import java.util.List;

public class KthMissingPositiveNumber_1539 {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> missingList = new ArrayList<>();
        for (int i = 1, j = 0; i <= 1000; i++) {
            if(j < arr.length){
                if(i == arr[j]){
                    j++;
                } else
                    missingList.add(i);
            } else
                missingList.add(i);

        }

        System.out.println(missingList);

        return missingList.get(k);
    }
}
