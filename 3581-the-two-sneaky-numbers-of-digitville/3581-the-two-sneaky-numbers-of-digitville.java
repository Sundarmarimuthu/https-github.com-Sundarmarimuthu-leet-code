class Solution {
    public int[] getSneakyNumbers(int[] nums) {
     HashMap<Integer,Integer> hm=new HashMap<>();
     int n[]=new int[2];
     for(int i:nums) hm.put(i,hm.getOrDefault(i,0)+1);
     int j=0;
     for(Map.Entry<Integer,Integer> en:hm.entrySet()){
        if(en.getValue()==2) n[j++]=en.getKey();
     }
     return n;
        
    }
}