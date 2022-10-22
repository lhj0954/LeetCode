package Easy;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while((end - start) > 1) {
            int mid = (start + end) / 2;
            if(nums[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if(nums[start] == target) {
            return start;
        } else if (nums[end] == target) {
            return end;
        } else if (nums[start] < target && nums[end] > target){
            return start + 1;
        } else if (nums[start] > target){
            return 0;
        } else {
            return end + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 7));
    }
}
