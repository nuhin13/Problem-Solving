import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] num = {1,1,2,3,2,3,5,6,6,7,9,9,8,7,3};
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
        //System.out.println(new WiggleSubsequence_376().wiggleMaxLength(num));
        //System.out.println(new MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts_1465().maxArea(5, 4, hori, ver));
        //System.out.println(new MinCostClimbingStairs_746().minCostClimbingStairs(hori));
        //new Candy_135().candy(num);

        //new LongestConsecutiveSequence_128().longestConsecutive_1(num);


        //new MergeTwoSortedLists_21().mergeTwoLists(generateLinkList_1(), generateLinkList_2());
        //new CountItemsMatchingARule_1773().countMatches(stringMatch, "stringMatch", "silver");
    }

    private static ListNode generateLinkList_1() {
        ListNode list = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(4);
        list.next = list2;
        list2.next = list3;
        list3.next = null;

        return  list;
    }
    private static ListNode generateLinkList_2() {
        ListNode list = new ListNode(1);
        ListNode list2 = new ListNode(4);

        list.next = list2;
        list2.next = null;
       // list3.next = null;

        return  list;
    }
}
