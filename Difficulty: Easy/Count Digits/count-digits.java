class Solution {
    public int countDigits(int n) {
        // code here
        int c = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            c++;
        }
        return c;
    }
}
