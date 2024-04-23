import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] res = twoSum(nums, 6);
        System.out.printf("[%d,%d]", res[0], res[1]);
        System.out.println();

    }


    public static int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        if (nums == null || nums.length == 0) {
            return res;
        }

        //TODO: 使用数组+哈希表
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                res[0] = map.get(temp);
                res[1] = i;
//                return res;
            }
            map.put(nums[i], i);
        }
        return res;


        //TODO: 使用数组+双指针+查找
        // 时间复杂度O(n^2),空间复杂度O(1),暴力解法
//        int i,j;
//        for (i = 0; i <nums.length-1; i++) {
//            for (j = i+1; j < nums.length; j++) {
//                if ((nums[i] + nums[j]) == target) {
//
//                    res[0] = i;
//                    res[1] = j;
//                }
//            }
//        }
//        return res;
    }
}
