// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1



//function Template for Java

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class ReverseLL
{
    // This function should reverse linked list and return
    // head of the modified linked list.
    
    
   /* Below solution by ketan using stacks.
    Node reverseList(Node head)
    {
        Stack<Node> stack = new Stack<>();
        Node temp = head;
        while(temp!=null) {
            stack.push(temp);
            temp = temp.next;
        }
        
        head = stack.pop();
        Node revTemp = head;
        while(!stack.isEmpty()) {
            revTemp.next = stack.pop();
            revTemp = revTemp.next;
        }
        revTemp.next=null;
        
        return head;
    }*/
    
    /* Below solution by ketan using iteration.
    Node reverseList(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr!=null) {
            if (curr.next!=null) {
                next = curr.next;
            }
            next = curr.next;
            curr.next = prev;
            prev = curr;
            head = curr;
            curr = next;
        }
        return head;
    }*/
    
    // Below solution by ketan using recursion..
    Node reverseList(Node head)
    {
        if (head==null || head.next==null) return head;
        Node temp = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
    /*
    Node reverseList(Node head)
    {
        if (head==null) return null;
        return rec(head, null);
    }
    
    Node rec(Node curr, Node prev) {
        if (curr.next==null) {
            curr.next=prev;
            return curr;
        }
        Node curr1 = curr.next; 
        curr.next = prev;
        return rec(curr1, curr);
    }*/

    
}
