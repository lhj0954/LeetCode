package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        for(int i = 0; i < nums.length; i++) {
            boolean find = false;
            for(int j = (i + 1); j < nums.length; j++) {
                if((nums[i] + nums[j]) == target) {
                    answer[0] = i;
                    answer[1] = j;
                    find = true;
                    break;
                }
            }
            if(find) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 4, 3, 0};
        System.out.println(Arrays.toString(twoSum(arr, 0)));
    }
}
