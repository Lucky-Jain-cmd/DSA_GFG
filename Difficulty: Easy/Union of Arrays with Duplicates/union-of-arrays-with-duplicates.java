class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        TreeSet<Integer> hs = new TreeSet<>();
        for(int i: a){
            hs.add(i);
        }
         for(int i: b){
            hs.add(i);
        }
        ArrayList<Integer> al = new ArrayList<>(hs);
        return al;
    }
}