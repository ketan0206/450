// https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/

class Level_order_traversal
{
    //You are required to complete this method
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (node==null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            Node n = queue.poll();
            if (n.left!=null) {
                queue.add(n.left);
            }
            if (n.right!=null) {
                queue.add(n.right);
            }
            list.add(n.data);
        }
        return list;
    }
}
