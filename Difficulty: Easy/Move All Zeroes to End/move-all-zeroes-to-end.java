// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                al.add(arr[i]);
            }
            int n = al.size();
            for(int i=0;i<n;i++){
                arr[i] = al.get(i);
            }
            for(int i=n;i<arr.length;i++){
                arr[i]=0;
            }
        
    }
}