class Solution {
    static int sumOfDigits(int n) {
        // code here
        int s=0;
        while(n>0){
            int rem = n%10;
            s += rem;
            n = n/10;
        }
        return s;
    }
}
