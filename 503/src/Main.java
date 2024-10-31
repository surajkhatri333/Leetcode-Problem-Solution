 //------------->Next Greater Element <------------
import java.util.*;
public class Main {

    public static int[] nextGreaterElements(int[] nums) {
        int[] nge = new int[nums.length];
        Arrays.fill(nge,-1);                    //initaize the arra with -1 value
        for(int i = 0; i < nums.length; i++){
            for(int j = i +1; j <=  nums.length + i -1; j++){
                if(nums[i] < nums[j % nums.length]){
                    nge[i] = nums[j % nums.length];
                    break;
                }
            }
        }
        return nge;
    }
    public static void main(String[] args) {
       int nums[] = {1,2,1};
       int[] nge = nextGreaterElements(nums);
       for(int i = 0; i < nge.length; i++){
           System.out.print(nge[i] +" ");
       }

    }
}