class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> harish = new HashSet();
        for(int i=0;i<nums.length;i++)
        {
           if(harish.contains(nums[i])){
            return true;
           }
           harish.add(nums[i]);

        }
        return false;             
            
    }
}