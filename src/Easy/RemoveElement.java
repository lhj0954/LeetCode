package Easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                for(int j = (i + 1); j < nums.length; j++) {
                    if(nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        int index = 0;
        for(int i : nums) {
            if(i == val) {
                break;
            }
            index++;
        }

        return index;
    }
}
