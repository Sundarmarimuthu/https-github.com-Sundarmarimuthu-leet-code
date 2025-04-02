class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pas=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>li=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i) li.add(1);
                else{
                    int sum=pas.get(i-1).get(j)+pas.get(i-1).get(j-1);
                    li.add(sum);
                }
            }
            pas.add(li);
        }
        return pas;
        
    }
}