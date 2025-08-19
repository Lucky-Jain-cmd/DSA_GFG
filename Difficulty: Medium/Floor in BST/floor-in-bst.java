// User function Template for Java

class Solution {
    public static int floor(Node root, int key) {
        // Code here
           if(root==null){
            return -1;
        }
        if(root.data==key){
            return root.data;
        }
        if(root.data>key){
            return floor(root.left,key);
        }
        int ceil = floor(root.right, key);
        return (ceil <= key && ceil!=-1) ? ceil : root.data;
    }
}