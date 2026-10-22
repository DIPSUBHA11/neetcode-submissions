class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int ans = Integer.MIN_VALUE;
        if(nums.length ==0) return 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            } else if (nums[i]+1 == nums[i+1]) {
                count++;
            } else if (nums[i]+1 != nums[i+1]) {
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        ans = Math.max(ans, count);
        return ans;
        //nlogn+ o(n)
    }
}
//2,3,4,4,5,10,20
