// https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }
    
    private void traverse(TreeNode root, List<Integer> list) {
        if (root==null) return;
        traverse(root.left, list);
        traverse(root.right, list);
        list.add(root.val);
    }
}