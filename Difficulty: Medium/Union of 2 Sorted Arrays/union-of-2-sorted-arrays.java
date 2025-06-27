// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<a.length;i++){
            ts.add(a[i]);
        }
         for(int i=0;i<b.length;i++){
            ts.add(b[i]);
        }
        return new ArrayList<>(ts);
    }
}
