class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length;
        long sum =((long)(n+1)*(n+2))/2;
        long t=0;
        for(int i=0;i<n;i++){
            t += arr[i];
        }
        return (int)(sum-t);
    }
}