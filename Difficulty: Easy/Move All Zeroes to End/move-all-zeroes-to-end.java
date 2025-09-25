class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                al.add(arr[i]);
            }
        }
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        for(int i=al.size();i<arr.length;i++){
            arr[i]=0;
        }
        
        
            }
}