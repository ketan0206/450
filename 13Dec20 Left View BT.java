// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#

class Tree
{
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> list = new ArrayList<>();
      Queue<Node> q = new LinkedList<>();
      if (root==null) return list;
      q.add(root);
      while(!q.isEmpty()) {
          int n = q.size();
          
          for (int i = 1 ; i <= n; i++) {
              Node nd = q.poll();
              if (i==1) list.add(nd.data);
              if (nd.left!=null) q.add(nd.left);
              if (nd.right!=null) q.add(nd.right);
          }
      }
      return list;
    }
}