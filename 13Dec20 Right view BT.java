// https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1

class Tree{
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        if (node==null) return list;
        q.offer(node);
        while(!q.isEmpty()) {
            int n = q.size();
            for (int i=1; i<=n;i++) {
                Node nd = q.poll();
                if (nd.left!=null) q.offer(nd.left);
                if (nd.right!=null) q.offer(nd.right);
                if (i==n) list.add(nd.data);
                
            }    
        }
        return list;
    }
}