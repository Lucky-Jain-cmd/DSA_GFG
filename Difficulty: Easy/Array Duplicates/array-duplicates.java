class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
         Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

 
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        return result;
    
    }
}