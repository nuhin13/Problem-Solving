import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] num = {1,1,2,3,2,3,5,6,6,7,9,9,8,7,3};
        int[] hori = {10,15,20,40,5};
        int[] ver = {1,3};

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
        //System.out.println(new InterleavingString_97().isInterleave("aa", "ab", "aaba"));

        //System.out.println(new Linked_List_Cycle_141().hasCycle(nodeSet()));
        //System.out.println(new ReverseWordsInAString_151().reverseWords("a good   example"));


        String[] a = {"abc", "d", "defg", "c"};
        String[] b = {"abcddefg"};
        String bb = "codeleet";

        //System.out.println(new CheckIfTwoStringArraysAreEquivalent_1662().arrayStringsAreEqual(a, b));
        //System.out.println(new DetermineifStringHalvesAreAlike_1704().halvesAreAlike("textbok"));
        //System.out.println(new RemoveAllAdjacentDuplicatesInString_1047().removeDuplicates("azxxzy"));
        //System.out.println(new Determine_if_Two_Strings_Are_Close_1657().closeStrings("abbbzcf", "babzzcz"));
        //System.out.println(new Determine_if_Two_Strings_Are_Close_1657().closeStrings("abbzzca", "babzzcz"));
        //System.out.println(new UniqueNumberOfOccurrences_1207().uniqueOccurrences(arr));
        //System.out.println(new SortCharactersByFrequency_451().frequencySort("dsfsdfsdfsduuuuuuu"));
        //System.out.println(new MinimumAverageDifference_2256().minimumAverageDifference(arr));

        //System.out.println(Arrays.toString(new Sort_the_People_2418().sortPeople(a, arr)));
        //System.out.println(new ShuffleString_1528().restoreString(bb, arr));
        //System.out.println(Arrays.toString(new DailyTemperatures_739().dailyTemperatures(arr)));

       /* List<Integer> rooms1 = List.(4);
        List<Integer> rooms2 = List.of(3);
        List<Integer> rooms3 = List.of();
        List<Integer> rooms4 = List.of(2,5,7);
        List<Integer> rooms10 = List.of(1);
        List<Integer> rooms5 = List.of();
        List<Integer> rooms6 = List.of(8,9);
        List<Integer> rooms7 = List.of();
        List<Integer> rooms8 = List.of();
        List<Integer> rooms9 = List.of(6);
        List<List<Integer>> rooms = List.of(rooms1, rooms2, rooms3, rooms4, rooms10, rooms5, rooms6, rooms7, rooms8, rooms9);
        */
        //System.out.println(new KeysAndRooms_841().canVisitAllRooms(rooms));
        //System.out.println(new HappyNumber_202().isHappy(2));

        int[][] boxType = {{1}};
        String[] strs = {"zyx","wvu","tsr"};

        //System.out.println(new SpiralMatrix_54().spiralOrder(boxType));
        //System.out.println(new LongestCommonPrefix_14().longestCommonPrefix(strs));
        //System.out.println(new MultiplyStrings_43().multiply("9", "99"));
        //new Candy_135().candy(num);

        //new LongestConsecutiveSequence_128().longestConsecutive_1(num);


        //new MergeTwoSortedLists_21().mergeTwoLists(generateLinkList_1(), generateLinkList_2());
        //new CountItemsMatchingARule_1773().countMatches(stringMatch, "stringMatch", "silver");

        int[] arr = {2,2,3,3,2,4,4,4,4,4,4,4,4,4,4};

        new MinimumRoundstoCompleteAllTasks_2244().minimumRounds(arr);
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
        //System.out.println(new MultiplyStrings_43().multiply("9", "99"));
        //System.out.println(new WordPattern_290().wordPattern("abba", "dog dog dog dog"));
        //System.out.println(new FizzBuzz_412().fizzBuzz(15));
        //System.out.println(new PowerofThree_326().isPowerOfThree(9));
        //System.out.println(new DetectCapital_520().detectCapitalUse("LEC"));
        //System.out.println(new DeleteColumnstoMakeSorted_944().minDeletionSize(strs));
    }

    public static ListNode nodeSet() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        return node1;
    }

}
