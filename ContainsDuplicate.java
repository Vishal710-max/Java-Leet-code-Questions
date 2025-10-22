// 4. Contains Duplicate (LeetCode 217) 
// Problem: Check if an array contains duplicates. 
// Solution: 
import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {  

Set<Integer> set = new HashSet<>(); 
for (int num : nums) 
if (!set.add(num)) return true; 
return false;
    }
}   