/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    public static boolean detectLoop(Node head){
        if (head==null || head.next==null) return false;
        if (head==head.next) return true;
        Node first = head;
        Node second = head;
        while (first!=null && second!=null) {
            first = first.next;
            second = second.next;
            if (second==null) return false;
            second = second.next;
            if (first == second) return true;
        }
        return false;
        
    }
}