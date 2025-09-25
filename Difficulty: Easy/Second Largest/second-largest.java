class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int f_max=Integer.MIN_VALUE;
        int s_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>f_max){
                s_max=f_max;
                f_max=arr[i];
            }
            if(arr[i]>s_max && arr[i]!=f_max){
                s_max=arr[i];
            }
        }
        if(s_max==Integer.MIN_VALUE)
        return -1;
        return s_max;
    }
}