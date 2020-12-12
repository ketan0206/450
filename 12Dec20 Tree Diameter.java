// https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1

class Tree {
    /* Complete the function to get diameter of a binary tree */
    int ans;
    int diameter(Node root) {
        ans=1;
        height(root);
        return ans;
    }
    
    private int height(Node root) {
        if (root==null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        ans = Math.max(ans, l+r+1);
        return Math.max(l, r)+1;
    }
}