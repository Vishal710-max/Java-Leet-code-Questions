// 6. Maximum Subarray (LeetCode 53) 
// Problem: Find the contiguous subarray with the largest sum. 
// Java Solution

import java.util.*;
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
int max = nums[0], curr = nums[0]; 
for (int i = 1; i < nums.length; i++) { 
curr = Math.max(nums[i], curr + nums[i]); 
max = Math.max(max, curr); 
} 
return max; 
    }
    
    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums)); // Output: 6
    }
}
