// 3. Merge Sorted Array (LeetCode 88) 
// Problem: Merge two sorted arrays into one sorted array. 
// Solution: 

// Importing necessary packages
import java.util.*;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize three pointers:
        int i = m - 1;         // Points to the last valid element in nums1
        int j = n - 1;         // Points to the last element in nums2
        int k = m + n - 1;     // Points to the last position in nums1 (where merged result goes)
        
        // Merge nums1 and nums2 starting from the end
        while (j >= 0) {
            // If nums1 has elements left and the current element in nums1 is greater than nums2
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];  // Copy the larger element from nums1
            } else {
                nums1[k--] = nums2[j--];  // Otherwise, copy from nums2
            }
        }
    }

    // Main method to test the merge function
    public static void main(String[] args) {
        // Example input
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;  // Number of initialized elements in nums1
        int[] nums2 = {2, 5, 6};
        int n = 3;  // Number of initialized elements in nums2

        // Merge nums2 into nums1
        merge(nums1, m, nums2, n);

        // Print the merged sorted array
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}
 