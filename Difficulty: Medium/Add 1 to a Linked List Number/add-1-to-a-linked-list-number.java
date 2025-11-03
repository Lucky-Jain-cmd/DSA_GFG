/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head){
        Node front=null;
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        if(head==null) return new Node(1);
            head = reverse(head);
        Node curr =head;
        int carry =1;
        Node prev=null;
        while(curr!=null){
            int sum = curr.data+carry;
            curr.data=sum%10;
            carry=sum/10;
            prev=curr;
            curr=curr.next;
        }
        if(carry!=0){
            Node a = new Node(1);
            prev.next=a;
            a.next=null;
        }
        return reverse(head);
        
    }
}