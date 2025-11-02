package reader;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		int resultantNumbers[] = new int[2];
		Map<Integer, Integer> remainderIndex = new HashMap<Integer, Integer>();
		Integer indexOfSecond = null;
		for (int i = 0; i < nums.length; i++) {

			indexOfSecond = remainderIndex.get(target - nums[i]);
			remainderIndex.put(nums[i], i);
			if (indexOfSecond != null && indexOfSecond != i) {
				return new int[] { nums[indexOfSecond], nums[i] };
			}
		}
		return resultantNumbers;
	}
}