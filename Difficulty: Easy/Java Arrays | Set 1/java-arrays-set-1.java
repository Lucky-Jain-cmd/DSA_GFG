
class Solution {
    public String average(int arr[]) {
        // code here
        
        double sum = 0f;
        int n= arr.length;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        double avg = sum/n;
     
        
        return String.format("%.2f",avg);
    }
}

