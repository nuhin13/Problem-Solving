public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,7,10,11,17};
        int[][] boxType = {{5,10},{2,5},{4,7},{3,9}};

        ///int a = new BestTimeToBuyAndSellStock().maxProfit(num);
        ///System.out.println(a);

        ///new LongestPalindrome_409().longestPalindrome("aaacccddffgg");
        //new MinimumMovesToEqualArrayElementsII_462().minMoves2(num);
        //System.out.println(new PowerOfTwo_231().isPowerOfTwo(-2147483648));

        new MaximumUnitsOnATruck_1710().maximumUnits(boxType, 10);
    }
}
