class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<b.length;i++){
            if(b[i]>largest){
                largest = b[i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                     sum += a[i][j];
                }
               
            }
        }
        al.add(sum);
        al.add(largest);
        return al;
    }
}
