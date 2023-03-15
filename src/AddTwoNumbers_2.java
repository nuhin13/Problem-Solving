public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        int carry = 0;
        while (l1 != null && l2 != null){
            int value = l1.val +l2.val + carry;
            carry = value/10;
            result = new ListNode(value%10, result);
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 == null &&  l2 != null){
            result = new ListNode(l2.val + carry, l2);
        }

        if(l2 == null &&  l1 != null){
            result = new ListNode(l1.val + carry, l1);
        }

        return result;
    }

}
