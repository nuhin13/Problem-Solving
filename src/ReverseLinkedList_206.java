import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList_206 {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        List<Integer> items = new ArrayList<>();

        while (head !=null){
            items.add(head.val);
            head = head.next;
        }

        for (Integer item : items) {
            head = new ListNode(item, head);
        }

        return head;

        /*
        ListNode prev = null;
        ListNode curr = head;

        while (curr !=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;*/
    }
}
