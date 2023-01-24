import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoLinkedLists_160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> map = new HashSet<>();
        ListNode dummy = headA;

        while (dummy !=null){
            map.add(dummy);
            dummy = dummy.next;
        }

        System.out.println(map);

        while (headB != null){
            if(map.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }

        //System.out.println(map);

        return null;
    }
}
