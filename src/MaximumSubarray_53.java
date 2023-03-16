import java.util.Arrays;

public class MaximumSubarray_53 {
    public int maxSubArray(int[] s) {
        if(s.length == 1)
            return s[0];
        if(s.length == 2) {
            if((s[0] + s[1]) > s[0] && (s[0] + s[1] > s[1]))
                return s[0] + s[1];
            else return Math.max(s[0], s[1]);
        }

        int max = Integer.MIN_VALUE;
        int[][] matrix = new int[s.length][s.length];

        for (int i=0, j=0; j <= s.length - 1; j++, i++){
            matrix[i][j] = s[i];
            max = Math.max(max, matrix[i][j]);
        }
        for (int i=0, j=1; j <= s.length -1; j++, i++){
            matrix[i][j] = s[i] + s[j];
            max = Math.max(max, matrix[i][j]);
        }
        for (int i = 0, j = 2 ; j <= s.length - 1; j++){
            for (int k = i, l = j; l <= s.length - 1; k++, l++) {
                    matrix[k][l] = matrix[k][l-1] + s[l];
                    max = Math.max(max, matrix[k][l]);
                    System.out.println(k + " " + l+1 +" " + max);
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        return max;
    }
}
