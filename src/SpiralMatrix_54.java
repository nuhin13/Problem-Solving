import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SpiralMatrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> spiral = new ArrayList<>();
        boolean isLengthEven = (matrix.length % 2 == 0);

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length -1; j++) {
                map.computeIfAbsent(i, k -> new ArrayList<>()).add(matrix[i][j]);
            }
        }

        for (int[] ints : matrix) {
            map.computeIfAbsent(11, k -> new ArrayList<>()).add(ints[matrix[0].length - 1]);
        }

        spiral.addAll(map.get(0));
        spiral.addAll(map.get(11));

        for (int i = matrix.length - 1; i > 0; i--) {
            List<Integer> item = map.get(i);
            if ((i + 1) % 2 == 0) {
                Collections.reverse(item);
            }

            spiral.addAll(item);
        }

        System.out.println(map);
        System.out.println(spiral);

        return spiral;
    }
}
