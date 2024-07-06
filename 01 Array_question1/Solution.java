import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        
        // calling function twoSum() returns the list of two indices that add up to the target
        int[] result = solution.twoSum(nums, target);
        
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
        
        scanner.close();
    }

    // Function to find indices of two numbers in the array that add up to the target sum
    public int[] twoSum(int[] nums, int target) {
        for (int p = 0; p < nums.length; p++) {
            int numToFind = target - nums[p];
            
            for (int q = p + 1; q < nums.length; q++) {
                if (numToFind == nums[q]) {
                    return new int[] {p, q};
                }
            }
        }
        return null;
    }
}