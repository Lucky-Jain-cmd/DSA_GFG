class Solution {
    public int lcm(int a, int b) {
        // code here
        int hcf = gcd(a,b);
        int ans = Math.abs(a*b)/hcf;
         
        return ans;
    }
    static int gcd(int a, int b){
            while(b!=0){
                int temp = b;
                b = a%b ;
                a = temp;
            }
            return a;
        }
}