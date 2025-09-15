/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int c1=0,c2=0,c3=0;
        Node tem = head;
        while(tem!=null){
            if(tem.data==0) {
                c1++;
            }
            else if(tem.data==1){
                c2++;
            }
            else{
                c3++;
            }
            tem = tem.next;
        }
        Node temp = head;
        while(temp!=null){
            if(c1>0){
                temp.data=0;
                c1--;
            }
            else if(c2>0){
                temp.data=1;
                c2--;
            }
            else{
                temp.data=2;
                c3--;
            }
            temp = temp.next;
        }
        return head;
        
    }
}