 class Solution {
    public int maximumPoints(int arr[][]) {
        // code here
        int m=arr.length;
        int n=arr[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i]=arr[0][i];
            
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int max=0;
                for(int k=0;k<n;k++){
                    if(j!=k){
                    max=Math.max(max,dp[i-1][k]);
                    }
                    
                }
                dp[i][j]=max+arr[i][j];
                
            }
        }
        int max=0;
        for(int  j=0;j<n;j++){
            max=Math.max(max,dp[m-1][j]);
        }
        return max;

}
}