import java.util.Arrays;

public class DuplicateRemove { public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;

    int slow = 0; // Points to the last unique element
    
    for (int fast = 1; fast < nums.length; fast++) {
        if (nums[fast] != nums[slow]) { // Found a new unique element
            slow++;
            nums[slow] = nums[fast]; // Move it to the next position
        }
    }
    
    return slow + 1; // Length of unique elements
}

public static void main(String[] args) {
    int[] nums = {1, 1, 2, 2, 3, 4,5, 4, 5,6};
    System.out.println("Original array:");
    Arrays.sort(nums);
       int length = removeDuplicates(nums);
    
    System.out.println("Array after removing duplicates:");
    for (int i = 0; i < length; i++) {
        System.out.print(nums[i] + " ");
    }
}
    
}
