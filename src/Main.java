public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,2,5,6,7,9,2,1,4};
        int[] hori = {10,15,20,40,5};
        int[] ver = {1,3};
        int[][] boxType = {{5,10},{2,5},{4,7},{3,9}};

        /*Testing
        /*String a = "a";
        StringBuilder ab = new StringBuilder();
        ab.append("a").append("b").append("c");
        System.out.println(ab);*/

        /*String ac = "ac";
        String bc = "ac";

        String acc = new String("ac");
        String bcc = new String("ac");

        System.out.println(ac == bc);
        System.out.println(acc.equals(bcc));*/


        ///int a = new BestTimeToBuyAndSellStock().maxProfit(num);
        ///System.out.println(a);

        ///new LongestPalindrome_409().longestPalindrome("aaacccddffgg");
        //new MinimumMovesToEqualArrayElementsII_462().minMoves2(num);
        //System.out.println(new PowerOfTwo_231().isPowerOfTwo(-2147483648));

        //new MaximumUnitsOnATruck_1710().maximumUnits(boxType, 10);

        //System.out.println(new FibonacciNumber_509().fib(40));
        //System.out.println(new ClimbingStairs_70().climbStairsTwo(45));
        //System.out.println(new MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts_1465().maxArea(5, 4, hori, ver));
        //System.out.println(new MinCostClimbingStairs_746().minCostClimbingStairs(hori));
        new Candy_135().candy(num);
    }
}
