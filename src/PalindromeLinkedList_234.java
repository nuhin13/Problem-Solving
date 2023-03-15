import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList_234 {

    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;

        List<Integer> items = new ArrayList<>();

        while (head !=null){
            items.add(head.val);
            head = head.next;
        }

        for (int i = 0, j = items.size() - 1; i <= items.size() / 2; i++, j--) {
            if(!items.get(i).equals(items.get(j)))
                return false;
        }

        return true;
    }
}
