// https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }
    
    private void traverse (TreeNode root, List<Integer> list) {
        if (root==null) return;
        list.add(root.val);
        traverse(root.left, list);
        traverse(root.right, list);
    }
}