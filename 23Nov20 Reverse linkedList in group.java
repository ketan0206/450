/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/
// 1 2 3 4 5 6 7 8 9 
// 3 2 1 6 5 4 9 8 7
class GfG
{
    
    public static Node reverse(Node node, int k) {
        Node prev = null;
        Node curr = node;
        Node next;
        int i = 0;
        while (curr!=null && i<k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        if (curr!=null) {
            node.next = reverse(curr, k);
        }
        return prev;
    }
}

