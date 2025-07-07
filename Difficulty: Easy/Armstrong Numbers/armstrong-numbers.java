// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int copy = n;
        int sum = 0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum += (rem*rem*rem);
        }
        return sum==copy?true:false;
    }
}