class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        TreeSet<Integer> hs = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int i=0;
        for(int num : hs){
            arr[i] = num;
            i++;
        }
        return i;
    }
}