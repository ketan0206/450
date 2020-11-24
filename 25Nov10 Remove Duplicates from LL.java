/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    // head: head node
    Node removeDuplicates(Node root)
    {
	// Your code here
	    Node temp = root;
	    while(temp!=null && temp.next!=null) {
	        if (temp.data==temp.next.data) {
	            Node n = temp.next;
	            temp.next=temp.next.next;
	            n.next=null;
	            n=null;
	            continue;
	        }
	        temp=temp.next;
	        if (temp.next==null) break;
	    }
	    return root;
    }
}
