package com.nf.leetcode.hot100;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class No1 {
    public int[] twoSum(int[] nums, int target) {
//        解法1 遍历nums 放到map key 是值 value 是下标 target - key 在获取 key 两个值都在 那么返回下标 时间复杂度 O(n)

        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        for(int i = 0 , numsLenth = nums.length; i < numsLenth; i++ ){
            int i1 = target - nums[i];
            if(integerHashMap.containsKey(i1)){
                return new int[]{integerHashMap.get(i1), i};
            }else {
                integerHashMap.put(nums[i], i);
            }

        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
//        解法2 暴力解法 时间复杂度 O（n²）


        return null;
    }

    public int[] twoSum3(int[] nums, int target) {
        int indexArrayMax = 2047;
        int[] indexArrays = new int[indexArrayMax + 1];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            int index = diff & indexArrayMax;
            if (indexArrays[index] != 0) {
                return new int[] { indexArrays[index] - 1, i };
            }
            indexArrays[nums[i] & indexArrayMax] = i + 1;
        }
        throw new IllegalArgumentException("No two sum value");
    }

    public static void main(String[] args) {
        No1 no1 = new No1();
        int[] ints = no1.twoSum3(new int[]{1, 2, 4, 5}, 7);

        System.out.println(ints);
    }


}
