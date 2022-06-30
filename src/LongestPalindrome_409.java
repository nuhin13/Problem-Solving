public class LongestPalindrome_409 {
    // First longest palindrome means all even number + (n - 1) odd number + 1
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        int[] count = new int[128];

        for (char item:s.toCharArray()){
            count[item]++;
        }

        int ans = 0;
        for (int i: count) {
            ans = ans + (i/2 *2);
            if(ans % 2 == 0 && i % 2 == 1){
                ans++;
            }
        }

        System.out.println(ans);
        return ans;
    }
}
