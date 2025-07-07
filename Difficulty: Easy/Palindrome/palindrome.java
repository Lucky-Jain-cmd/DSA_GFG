// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        // Code here
        int rev=0, copy = n;
        while(copy>0){
            int rem = copy%10;
            rev = rev*10 + rem;
            copy = copy/10;
        }
        return n==rev?true:false;
    }
}