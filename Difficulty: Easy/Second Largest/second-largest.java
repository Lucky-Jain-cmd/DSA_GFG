class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl = l;
                l = arr[i];
            }
            if(arr[i]<l && arr[i]>sl ){
                sl = arr[i];
            }
        }
        if(sl==Integer.MIN_VALUE){
            return -1;
        }
        return sl;
    }
}