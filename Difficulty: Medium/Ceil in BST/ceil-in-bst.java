/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Tree {
    int findCeil(Node root, int key) {
        // code here
        if(root==null){
            return -1;
        }
        if(root.data==key){
            return root.data;
        }
        if(root.data<key){
            return findCeil(root.right,key);
        }
        int ceil = findCeil(root.left, key);
        return (ceil >= key && ceil!=-1) ? ceil : root.data;
    }
}