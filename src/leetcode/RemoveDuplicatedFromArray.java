package leetcode;

public class RemoveDuplicatedFromArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i + 1;
        int k = nums.length;
        while (i < nums.length - 1) {
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }

            if (j < nums.length) {
                k = i + 1;
                nums[k] = nums[j];
            } else {
                k = i + 1;
                return k;
            }
            i++;
        }
        return k + 1;
    }
}
