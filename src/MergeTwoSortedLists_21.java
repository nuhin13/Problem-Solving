public class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1.next == null){
            if(list2.next == null){
                return list1;
            }
            return list2;
        }

        ListNode mergeList = new ListNode(0);
        ListNode curr = mergeList;
        while (list1 != null && list2 != null){
            if(list1.val > list2.val){
                curr.next = list2;
                list2 = list2.next;

            } else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }

        if (list1 != null) curr.next = list1;
        else curr.next = list2;

        while (mergeList != null){
            System.out.println(mergeList.val);
            mergeList = mergeList.next;
        }

        return mergeList;
    }
}
