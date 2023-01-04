public class InterleavingString_97 {

    public boolean isInterleaveDp(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length())
            return false;
        if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty())
            return true;

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
                } else {
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public boolean isInterleave(String s1, String s2, String s3) {

        if(s1.length() + s2.length() != s3.length())
            return false;
        if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty())
            return true;

        int s1Position = 0;
        int s2Position = 0;

        boolean s1Enable = true;
        boolean s2Enable = true;

        for (int i = 0; i < s3.length(); i++) {
            System.out.println(s1Enable + " " + s2Enable + " "+ s1Position + " " + s2Position);

            if (s1Enable) {
                if ((s1Position <= s1.length() - 1) && (s3.charAt(i) == s1.charAt(s1Position)) ) {
                    s1Position++;
                    s2Enable = false;
                } else if ((s2Position <= s2.length() - 1) && (s3.charAt(i) == s2.charAt(s2Position))) {
                    System.out.println(s3.charAt(i) + " " + s2Position);
                    s1Enable = false;
                    s2Enable = true;
                    s2Position++;
                } else {
                    return false;
                }
            } else {
                if ((s2Position <= s2.length() - 1) && (s3.charAt(i) == s2.charAt(s2Position))) {
                    s2Position++;
                } else if ((s1Position <= s1.length() - 1) && (s3.charAt(i) == s1.charAt(s1Position))) {
                    s1Enable = true;
                    s2Enable = false;
                    s1Position++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
