class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>map =new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int values:map.values()){
            if(values>1){
                return true;
            }
        }
        return false;

        
    }
}

