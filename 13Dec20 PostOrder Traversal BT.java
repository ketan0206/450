// https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //traverse(root, list);
        Stack<TreeNode> s1 = new Stack<>(); 
        Stack<TreeNode> s2 = new Stack<>(); 
  
        if (root == null) 
            return list; 
  
        // push root to first stack 
        s1.push(root); 
  
        // Run while first stack is not empty 
        while (!s1.isEmpty()) { 
            // Pop an item from s1 and push it to s2 
            TreeNode temp = s1.pop(); 
            s2.push(temp); 
  
            // Push left and right children of 
            // removed item to s1 
            if (temp.left != null) 
                s1.push(temp.left); 
            if (temp.right != null) 
                s1.push(temp.right); 
        } 
  
        // Print all elements of second stack 
        while (!s2.isEmpty()) { 
            TreeNode temp = s2.pop(); 
            list.add(temp.val);
        } 
        return list;
    }
    
    /*private void traverse(TreeNode root, List<Integer> list) {
        if (root==null) return;
        traverse(root.left, list);
        traverse(root.right, list);
        list.add(root.val);
    }*/
}