class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i < nums.length-1; i++) {
            int dValue = target - nums[i];
            for (int j=i+1; j < nums.length; j++) {
                if (dValue == nums[j]) {
                    if (nums[j] > nums[i]) {
                        result[0] = i;
                        result[1] = j;
                    } else {
                        result[0] = j;
                        result[1] = i;
                    }
                }
            }
        }
        return result;
    }
}

/**
 * 20240104
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int num = nums[i];
            int dValue = target - num;
            if (map.containsKey(dValue)) {
                return new int[] {map.get(dValue), i};
            }
            map.put(num, i);
        }
        return null;
    }
}