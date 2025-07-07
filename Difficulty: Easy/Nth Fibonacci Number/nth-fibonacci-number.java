// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n==1) return 1;
        if(n==2) return 1;  
        
        int f = 1;
        int s = 1;
        int next = 0;
        for(int i=3;i<=n;i++){
              next = f+s;
            f = s;
            s = next;
        }
        return next;
    }
}