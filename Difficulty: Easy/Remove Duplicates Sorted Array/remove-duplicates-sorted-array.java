class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        TreeSet<Integer> hs = new TreeSet<>();
        for(int i : arr){
            hs.add(i);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : hs){
            al.add(i);
        }
        return al;
    }
}
