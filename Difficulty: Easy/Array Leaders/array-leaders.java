
        class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                }
            }
            if(leader){
                al.add(arr[i]);
            }
        }
        return al;
    }
}
