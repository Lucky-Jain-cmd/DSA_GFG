// User function Template for Java

class Solution {
    static int isStrong(int N) {
        // code here
        int copy = N;
        int sum = 0;
        while(N>0){
            int rem = N%10;
            N = N/10;
            int fact =1;
            for(int i=1;i<=rem;i++){
                fact *= i;
            }
            sum += fact;
        }
        if(sum==copy) return 1;
        return 0;
        
    }
};