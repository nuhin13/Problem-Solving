import java.util.ArrayList;
import java.util.List;

public class SymmetricTree_101 {
    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();

    public boolean isSymmetric(TreeNode root) {
        if(root !=null){
            leftOrder(root.left);
            rightOrder(root.right);
        }

        System.out.println(left + "\n");
        System.out.println(right);

        return left.equals(right);
    }

    public void leftOrder(TreeNode root) {
        if (root != null) {
            leftOrder(root.left);
            left.add(root.val);
            leftOrder(root.right);
        }
    }

    public void rightOrder(TreeNode root) {
        if (root != null) {
            rightOrder(root.right);
            right.add(root.val);
            rightOrder(root.left);
        }
    }
}
