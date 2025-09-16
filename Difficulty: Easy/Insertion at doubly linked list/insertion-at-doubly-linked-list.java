/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node newNode = new Node(x);
        Node temp = head;
        while(p-->0){
            temp=temp.next;
            }
            newNode.next = temp.next;
           
            if(temp.next!=null){
                temp.next.prev = newNode;
               
            }
            
            newNode.prev = temp;
              temp.next=newNode;
            return head;
        
    }
}