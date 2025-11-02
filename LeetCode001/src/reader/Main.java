package reader;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.twoSum(new int[] { 3, 5, 7, 2, 4 }, 9));

		System.out.println(Arrays.toString(sol.twoSum(new int[] { 3, 2, 4 }, 6))); // 9 + 11
		int target = 6;
		int inputArry[] = new int[] { 3, 3 };
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 128;
		inputArry = new int[] { 3, 5, 9, 14, 18, 22, 25, 27, 29, 33, 36, 38, 41, 45, 47, 50, 53, 55, 58, 61, 63, 65, 68,
				70, 73, 75, 78, 80, 83, 85, 88, 90, 93, 95, 97, 99 };
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 150;
		inputArry = new int[] { 10, 12, 15, 18, 20, 24, 28, 31, 33, 35, 37, 39, 40, 42, 44, 47, 50, 53, 56, 59, 61, 63,
				65, 68, 71, 74, 77, 80, 83, 86, 89, 91, 94, 97 };
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 127;
		inputArry = new int[] { 2, 4, 6, 8, 10, 13, 15, 19, 21, 24, 26, 29, 31, 34, 36, 38, 40, 43, 46, 49, 52, 55, 57,
				60, 63, 65, 68, 71, 74, 77, 80, 82, 85, 88, 91, 94, 97 };
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 170;
		inputArry = new int[] { 1, 3, 5, 8, 10, 14, 17, 19, 22, 26, 29, 31, 34, 37, 40, 44, 48, 52, 56, 60, 63, 67, 70,
				73, 77, 80, 84, 87, 91, 94, 97, 100, 103, 106 };
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 189;
		inputArry = new int[] { 9, 11, 15, 18, 21, 25, 29, 33, 36, 40, 43, 47, 50, 54, 57, 60, 64, 68, 71, 75, 78, 82,
				85, 89, 93, 96, 100, 103, 107, 110, 113, 117, 120 };
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 177;
		inputArry = new int[] { 5, 9, 12, 16, 19, 22, 25, 29, 32, 35, 38, 42, 45, 48, 51, 55, 58, 61, 65, 68, 71, 74,
				77, 80, 84, 87, 90, 94, 97, 100, 103, 107, 110, 114, 117 };
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 200;
		inputArry = new int[] { 1, 4, 9, 13, 17, 21, 25, 29, 33, 37, 40, 44, 48, 51, 55, 58, 62, 65, 68, 73, 77, 81, 85,
				89, 93, 97, 100, 104, 108, 112, 116, 120, 124, 128, 132 };
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		inputArry = new int[]{3, 5, 9, 14, 18, 22, 25, 27, 29, 33, 36, 38, 41, 45, 47, 50, 53, 55, 58, 61, 63, 65, 68, 70, 73, 75, 78, 80, 83, 85, 88, 90, 93, 95, 97, 99};
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 150;
		inputArry = new int[]{10, 12, 15, 18, 20, 24, 28, 31, 33, 35, 37, 39, 40, 42, 44, 47, 50, 53, 56, 59, 61, 63, 65, 68, 71, 74, 77, 80, 83, 86, 89, 91, 94, 97};
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 127;
		inputArry = new int[]{2, 4, 6, 8, 10, 13, 15, 19, 21, 24, 26, 29, 31, 34, 36, 38, 40, 43, 46, 49, 52, 55, 57, 60, 63, 65, 68, 71, 74, 77, 80, 82, 85, 88, 91, 94, 97};
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 170;
		inputArry = new int[]{1, 3, 5, 8, 10, 14, 17, 19, 22, 26, 29, 31, 34, 37, 40, 44, 48, 52, 56, 60, 63, 67, 70, 73, 77, 80, 84, 87, 91, 94, 97, 100, 103, 106};
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 189;
		inputArry = new int[]{9, 11, 15, 18, 21, 25, 29, 33, 36, 40, 43, 47, 50, 54, 57, 60, 64, 68, 71, 75, 78, 82, 85, 89, 93, 96, 100, 103, 107, 110, 113, 117, 120};
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 177;
		inputArry = new int[]{5, 9, 12, 16, 19, 22, 25, 29, 32, 35, 38, 42, 45, 48, 51, 55, 58, 61, 65, 68, 71, 74, 77, 80, 84, 87, 90, 94, 97, 100, 103, 107, 110, 114, 117};
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		target = 200;
		inputArry = new int[]{1, 4, 9, 13, 17, 21, 25, 29, 33, 37, 40, 44, 48, 51, 55, 58, 62, 92, 69, 73, 77, 81, 85, 89, 93, 97, 100, 104, 108, 112, 116, 120, 124, 128, 132};
		inputArry = sol.twoSum(inputArry, target);
		System.out.println(Arrays.toString(inputArry) + "target == "+ target + " --> Result " + ((inputArry[0] + inputArry[1]) == target));

		
		/*
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {2, 4, 7, 12, 18, 25,
		 * 31, 40, 50, 60, 70}, 75))+ " --> Target = " + 75); // 25 + 50
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {5, 9, 3, 14, 7, 2,
		 * 11, 16, 19, 8, 6}, 21))); // 5 + 16
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {1, 2, 3, 4, 5, 6, 7,
		 * 8, 9, 10}, 19))); // 9 + 10 System.out.println(Arrays.toString(sol.twoSum(new
		 * int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, 130))); // 60 + 70
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {6, 13, 9, 21, 4, 18,
		 * 27, 3, 15, 24, 12}, 33))); // 9 + 24
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {5, 17, 8, 11, 23, 2,
		 * 29, 13, 7, 4, 18}, 31))); // 18 + 13
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {20, 1, 9, 14, 3, 27,
		 * 33, 5, 16, 8, 25}, 41))); // 16 + 25
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {100, 90, 80, 70, 60,
		 * 50, 40, 30, 20, 10}, 110))); // 50 + 60
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {12, 22, 32, 42, 52,
		 * 62, 72, 82, 92, 102}, 134))); // 32 + 102
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {7, 14, 28, 35, 42,
		 * 56, 63, 70, 77, 84}, 119))); // 42 + 77
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {9, 18, 27, 36, 45,
		 * 54, 63, 72, 81, 90}, 135))); // 54 + 81
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {2, 5, 8, 11, 14, 17,
		 * 20, 23, 26, 29}, 40))); // 14 + 26
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {1, 3, 5, 7, 9, 11,
		 * 13, 15, 17, 19}, 22))); // 9 + 13
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {4, 8, 12, 16, 20,
		 * 24, 28, 32, 36, 40}, 52))); // 20 + 32
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {50, 55, 60, 65, 70,
		 * 75, 80, 85, 90, 95}, 155))); // 65 + 90
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {13, 26, 39, 52, 65,
		 * 78, 91, 104, 117, 130}, 143))); // 52 + 91
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {100, 200, 300, 400,
		 * 500, 600, 700, 800, 900, 1000}, 1300))); // 500 + 800
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] {5, 10, 15, 20, 25,
		 * 30, 35, 40, 45, 50, 55, 60, 65, 70}, 95))); // 25 + 70
		 * System.out.println(Arrays.toString(sol.twoSum(new int[] { 1, 4, 8, 12, 15,
		 * 19, 23, 27, 31, 34, 38, 41, 45, 49, 52, 56, 59, 63, 67, 71, 74, 78, 81, 85,
		 * 89, 92, 96, 100, 104, 108, 112, 115, 119, 123, 126, 130, 134, 138, 141, 145,
		 * 149 }, 200))); // 74 + 126
		 * 
		 */

	}
}