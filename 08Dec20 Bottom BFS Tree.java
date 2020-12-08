// https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1


class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Queue<Node>> stack = new Stack<>();
        if (node==null) return list;
        queue.offer(node);
        while(!queue.isEmpty()) {
            Queue<Node> q = new LinkedList<>();
            Queue<Node> qr = new LinkedList<>();
            while(!queue.isEmpty()) {
                Node n = queue.poll();
                if (n!=null) {
                    q.offer(n);
                    qr.offer(n);
                }
            }
            stack.push(q);

            while(!qr.isEmpty()) {
                Node nd = qr.poll();
                queue.offer(nd.left);
                queue.offer(nd.right);
            }
        }
        while(!stack.isEmpty()) {
            queue = stack.pop();
            while(!queue.isEmpty()) {
                list.add(queue.poll().data);
            }
        }
        return list;
    }
}      