import java.util.HashSet;

public class Linked_List_Cycle_2_142 {

    public ListNode detectCycle(ListNode head) {
        ListNode first = head;
        ListNode meet = meetNode(head);

        while (first != meet){
            first = first.next;
            meet = meet.next;
        }

        return first;
    }

    public ListNode meetNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return slow;
        }

        return null;
    }

}
