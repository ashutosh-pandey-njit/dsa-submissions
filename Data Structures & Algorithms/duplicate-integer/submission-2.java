class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> val=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!val.contains(nums[i]))
            {
                val.add(nums[i]);
            }
            else{
                return true;
            }
        }
       return false;
        
    }
}