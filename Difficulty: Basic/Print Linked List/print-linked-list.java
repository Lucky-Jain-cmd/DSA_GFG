/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        helper(head,al);
        return al;
    }
    public void helper(Node head,ArrayList<Integer> al){
        if(head==null) return;
        al.add(head.data);
        helper(head.next,al);
    }
}