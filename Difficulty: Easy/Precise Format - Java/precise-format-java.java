class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> ans = new ArrayList<>();
        float an = a/b;
        float anss =Math.round(an * 1000f)/1000f;
        ans.add(an);
        ans.add(anss);
        return ans;
    }
}