class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < nums.length){
            sum += nums[right];
            right++;
            while(sum >= target){
                minLen = Math.min(minLen, right - left);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}