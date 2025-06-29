// User function Template for Java

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
     ArrayList<Integer> ans = new ArrayList<>();
     HashMap<Integer,Integer> hm = new HashMap<>();
     for(int num : a){
         hm.put(num,hm.getOrDefault(num,0)+1);
     }
     for(int num : b){
         if(hm.containsKey(num) && hm.get(num)>0){
             ans.add(num);
             hm.put(num,hm.get(num)-1);
         }
     }
     Collections.sort(ans);
     return ans;
    }
}