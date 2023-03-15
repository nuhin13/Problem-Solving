import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {

    List<Integer> inOrder = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null){
            inorder(root.left);
            inOrder.add(root.val);
            inorder(root.right);
        }

        return inOrder;
    }

    public void inorder(TreeNode root) {

        if (root == null) return;
        if (root.left == null) {
            inOrder.add(root.val);
            inorder(root.right);
            return;
        } else
            inorder(root.left);

        inOrder.add(root.val);

        if (root.right != null)
            inorder(root.right);
    }
}
