package _1_;

public class testTwoSum {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int[] arrays1 = tweSum(a, 9);
        System.out.println(arrays1[0] + "," + arrays1[1]);

    }

    public static int[] tweSum(int[] nums, int target) {
        int[] arrays1 = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    nums[0] = i;
                    nums[1] = j;
                }
            }
        }

        return arrays1;
    }
}
