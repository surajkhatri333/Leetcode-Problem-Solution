//------------------>2104. Sum of Subarray Ranges <-----------------

public class Main {
    public static long subArrayRanges(int[] nums) {
        long sum = 0;

        if(nums.length == 1) return 0;
        for(int i = 0; i < nums.length; i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j = i; j < nums.length; j++){
                max = Math.max(nums[j] ,max);
                min = Math.min(nums[j],min);
                sum += (long)(max-min);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(subArrayRanges(nums));
    }
}