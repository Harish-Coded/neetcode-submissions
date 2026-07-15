class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ls = nums.length-1;
        int i=0;
        while(i<ls)
        {

            if (nums[i] + nums[ls] == target) 
            {
                break;
            } 
            else if(nums[i] + nums[ls] > target) ls--;
            else i++;
        }
        return new int[] {i+1,ls+1};
    }
}
