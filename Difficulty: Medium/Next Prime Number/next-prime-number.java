// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        int ans =-1;
        if(n==0 || n==1){
            return 2;}
        for(int i=n+1;i<=n*n;i++){
          boolean isprime = true;
           for(int j=2;j<=Math.sqrt(i);j++){
               if(i%j==0){
                   isprime = false;
                   break;
               }}
               if(isprime){
                   ans = i;
                   break;
               }
        }
        return ans;
    }
}