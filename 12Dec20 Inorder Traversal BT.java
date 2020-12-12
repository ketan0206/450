// https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }
    
    private void traverse(TreeNode root, List<Integer> list) {
        if (root==null) return;
        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right, list);
    }
}