// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=10;i++){
            al.add(n*i);
        }
        return al;
    }
}