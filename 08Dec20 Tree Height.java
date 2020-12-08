// https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1

class Solution {
    int height(Node node) {
        if (node==null) return 0;
        return Math.max(height(node.left), height(node.right))+1;
    }
}