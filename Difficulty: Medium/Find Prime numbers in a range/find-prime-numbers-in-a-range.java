// User function Template for Java

class Solution {
     boolean isPrime(int n){
        if(n==1 || n==0){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList al = new ArrayList<>();
        for(int i=M;i<=N;i++){
            if(isPrime(i)==true){
                al.add(i);
            }
        }
    
    
    return al;
    
}}