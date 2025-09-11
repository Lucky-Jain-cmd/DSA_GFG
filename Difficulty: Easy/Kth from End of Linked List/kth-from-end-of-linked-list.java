/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node temp = head;
        int m=0;
        Node t = head;
        while(temp!=null){
            temp=temp.next;
            m++;
        }
        if(k>m) return -1;
        for(int i=1;i<=(m-k);i++){
            t=t.next;
        }
        return t.data;
    }
}