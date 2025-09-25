class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int maxi=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1 ){
                count++;
                maxi=Math.max(count,maxi);
            }
            else{
                count=0;
            }
        }
         int max=0;
        int coun=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 ){
                coun++;
                max=Math.max(coun,max);
            }
            else{
                coun=0;
            }
        }
        return Math.max(maxi,max);
        
    }
}
