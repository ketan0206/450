// https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1


class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        int h = height(node);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = h ; i >= 0; i--) {
            add(node, list, i);
        }
        return list;
    }
    
    private void add(Node node, ArrayList<Integer> list, int h) {
        if (node==null) return;
        if (h==0) list.add(node.data);
        add(node.left, list, h-1);
        add(node.right, list, h-1);
    }
    
    private int height(Node node) {
        if (node==null) return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
} 