// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int n1=0;
        int n2=1;
        int arr[] = new int[n];
        if(n==1) return new int[] {0};
        if(n==2) return new int[] {0,1};
        int len=n-2;
        arr[0]=n1;
        arr[1]=n2;
        int i=2;
        while(len-->0){
            int nw=n1+n2;
            n1=n2;
            n2=nw;
            arr[i++]=nw;
        }
        return arr;
    }
}