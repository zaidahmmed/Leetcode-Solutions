````markdown
# Two Sum Problem in Java

This repository explains the **Two Sum problem**, provides a **Java solution**, and gives a detailed **complexity analysis**.

---

## Problem Description

Given an array of integers `nums` and an integer `target`, return **two numbers** from the array that add up to `target`.

Example:

```java
Input: nums = [2, 7, 11, 15], target = 9
Output: [2, 7]
````

---

## Java Solution Using HashMap

```java
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> remainderIndex = new HashMap<>();
        Integer indexOfSecond = null;

        for (int i = 0; i < nums.length; i++) {
            indexOfSecond = remainderIndex.get(target - nums[i]);
            remainderIndex.put(nums[i], i);
            if (indexOfSecond != null && indexOfSecond != i) {
                return new int[] { nums[indexOfSecond], nums[i] };
            }
        }

        return new int[2]; // default if no pair found
    }
}
```

---

## Step-by-Step Complexity Analysis

### 1. Time Complexity

* `remainderIndex.get()` → O(1) on average
* `remainderIndex.put()` → O(1) on average

**Total time complexity:** O(n)
where `n = nums.length`.

> HashMap operations are O(1) on average. Worst-case hash collisions can degrade performance, but practically this is O(n).

---

### 2. Space Complexity

* `HashMap<Integer, Integer> remainderIndex` stores numbers and their indices.
* Worst-case: no pair sums to target → all `n` numbers stored.

**Total space complexity:** O(n)

* `resultantNumbers` array is constant size → O(1), negligible in the overall calculation.

---

### 3. Comparison With Naive Nested Loop

#### Naive Approach (O(n²) time, O(1) space):

```java
for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) return new int[]{nums[i], nums[j]};
    }
}
```

* Checks **all possible pairs** → quadratic comparisons.
* **Space complexity:** O(1), only loop indices.

#### HashMap Approach (O(n) time, O(n) space):

* Stores numbers in a `HashMap` → finds the pair in **one pass**.
* **Time complexity:** O(n)
* **Space complexity:** O(n)

**Tradeoff:** Faster execution using extra memory (classic time-space tradeoff).

---

## Visual Example (HashMap Step-by-Step)

Array:

```
nums = [2, 7, 11, 15]
target = 9
```

| Step | nums[i] | target - nums[i] | HashMap Contents | Pair Found? |
| ---- | ------- | ---------------- | ---------------- | ----------- |
| 0    | 2       | 7                | {}               | No          |
| 1    | 7       | 2                | {2:0}            | Yes → (2,7) |

✅ Only **1 pass** through the array → O(n)
❌ Naive approach would check 6 pairs → O(n²)

---

## How to Test in Java

```java
import java.util.Arrays;

public class TestTwoSum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int target = 200;
        int inputArry[] = new int[] { 1, 4, 9, 13, 17, 21, 25, 29, 33, 37, 40, 44, 48, 51, 55, 58, 62, 65, 69, 73, 77, 81, 85,
                89, 93, 97, 100, 104, 108, 112, 116, 120, 124, 128, 132 };
        
        int[] result = sol.twoSum(inputArry, target);
        System.out.println(Arrays.toString(result) + " Result " + 
            ((result[0] + result[1]) == target));
    }
}
```

---

## Notes

* HashMap-based solution is **optimal for Two Sum** in terms of time.
* Nested loops are simpler but inefficient for large arrays.
```

---

## Comparison
| Solution             | Time Complexity | Space Complexity |
| -------------------- | --------------- | ---------------- |
| HashMap approach     | O(n)            | O(n)             |
| Nested loop approach | O(n²)           | O(1)             |


---
