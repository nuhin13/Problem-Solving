import java.util.Arrays;

public class LongestPalindromicSubstring_5 {
    public String longestPalindrome(String s) {
        if(s.length() == 1)
            return s;
        if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1))
                return s;
            else s.charAt(0);
        }

        String max = "";
        int[][] matrix = new int[s.length()][s.length()];

        for (int i=0, j=0; j <= s.length() - 1; j++, i++){
            max = String.valueOf(s.charAt(i));
            matrix[i][j] = 1;
        }
        for (int i=0, j=1; j <= s.length() -1; j++, i++){
            if(s.charAt(i) == s.charAt(j)){
                matrix[i][j] = 1;
                max = s.substring(i,j+1);
            }
        }
        for (int i = 0, j = 2 ; j <= s.length() - 1; j++){
            for (int k = i, l = j; l <= s.length() - 1; k++, l++) {
                if(s.charAt(k) == s.charAt(l) && matrix[k+1][l-1] == 1){
                    matrix[k][l] = 1;
                    max = s.substring(k,l+1);
                    System.out.println(k + " " + l+1 +" " + max);
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        return max;
    }
}
