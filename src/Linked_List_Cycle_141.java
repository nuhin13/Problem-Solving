import java.util.HashMap;
import java.util.HashSet;

public class Linked_List_Cycle_141 {


    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> map = new HashSet<>();

        int length = 0;
        while (head != null){
            if(map.contains(head))
                return true;
            else
                map.add(head);

            System.out.println(head.val);
            head = head.next;
            length++;

        }

        System.out.println(length);

        return true;
    }


    public boolean hasCycle_Floyed(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }

}
