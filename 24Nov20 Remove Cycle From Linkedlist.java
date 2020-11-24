
/*
class Node
{
    int data;
    Node next;
}
*/

class solver
{
    public static void removeLoop(Node head){
        Node first = head;
        Node second = head;
        while(first!=null && second!=null) {
            first=first.next;
            second=second.next;
            if (second!=null) second=second.next;
            if (first==second) break;
        }
        
        if (second!=null) {
            Node temp = second.next;
            int i = 1;
            while(second!=temp) {
                i++;
                temp = temp.next;
            }
            first=head;
            second=head;
            while(i!=1) {
                second=second.next;
                i--;
            }
            Node prev=second;
            second=second.next; // first should start from null and then move to hea
                                // but since it is one step ahead making second also ahead by 1.
            while(first!=second) {
                prev=second;
                first=first.next;
                second=second.next;
            }
            if (prev!=null) prev.next=null;
        }
    }
}