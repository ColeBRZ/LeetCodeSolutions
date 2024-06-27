public class Solution1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        boolean targetFound = false;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i]; // 2
            for (int j = 1; j < nums.length; j++) {
                int y = nums[j];
                if(x + y == target && i != j){
                    answer[0] = i;
                    answer[1] = j;
                    targetFound = true;
                    break;
                }
            }
            if(targetFound == true){
                break;
            }
        }
        return answer;
    }
}
