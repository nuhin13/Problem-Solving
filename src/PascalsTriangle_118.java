import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(List.of(1)));
        if(numRows == 1)
            return result;

        result.add(new ArrayList<>(List.of(1, 1)));
        if(numRows == 2)
            return result;

        for (int i = 3; i <= numRows; i++) {
            List<Integer> item = new ArrayList<>();
            item.add(1);

            List<Integer> itemMap = result.get(i-2);

            for (int j = 0; j < itemMap.size() - 1; j++) {
                item.add(itemMap.get(j) + itemMap.get(j+1));
            }

            item.add(1);
            result.add(item);
        }

        System.out.println(result);
        return  result;
    }
}
