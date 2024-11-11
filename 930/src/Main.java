public class Main {
    public static int numSubarraysWithSum(int[] nums, int goal) {

        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums.length - 1; i++){
            sum = 0;
            int k = i;
            for(int j = i; j < nums.length; j++){
                sum += nums[k];
                k++;
                if(sum == goal){
                    count++;
                }
            }
        }
        if( nums[nums.length - 1] == goal) count++;

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println("The number of subarray with sum equals to goal is : " +numSubarraysWithSum(nums,goal));
    }
}