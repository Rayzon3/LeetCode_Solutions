import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> myStack = new Stack<>();
        List<Integer> answer = new ArrayList<>();

        if (root == null)
            return answer;

        TreeNode current = root;

        while (current != null || !myStack.isEmpty()) {
            while (current != null) {
                myStack.push(current);
                current = current.left;
            }
            current = myStack.pop();
            answer.add(current.val);
            current = current.right;
        }

        return answer;

    }
}
