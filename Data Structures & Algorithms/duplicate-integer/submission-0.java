class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(i==j) continue;
                if(nums[i]==nums[j]) return true;
                
            }

        }
        return false;
    }
}