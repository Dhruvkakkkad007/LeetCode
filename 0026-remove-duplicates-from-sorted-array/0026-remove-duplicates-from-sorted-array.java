class Solution {
    public int removeDuplicates(int[] nums) {
        int i,count=0;
        for( i = 0; i < nums.length ; i++){
            if(i < nums.length - 1 && nums[i] == nums[i + 1]){
                continue;
            }
            else
            {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}