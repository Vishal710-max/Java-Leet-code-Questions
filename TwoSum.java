// 1. Two Sum (LeetCode 1) 
// Problem: Find two numbers in the array that add up to a specific target. 
// Java Solution: 

import java.util.HashMap; 
import java.util.Map;

public class TwoSum { 
    public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<>(); 
    int[] name = {2, 7, 11, 15};
    int target = 9;
    for (int i = 0; i < name.length; i++) { 
        int diff = target - name[i]; 
        if (map.containsKey(diff)) {
            int[] result = {map.get(diff), i};
            System.out.println(java.util.Arrays.toString(result));
            return;
        }
        map.put(name[i], i); 
    }
}
}