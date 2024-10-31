//--------------> NEXT GREATER ELEMENT <-----------------

import java.util.*;
public class Main {
    //function for find next greater element
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] nge = new int[nums2.length];

        Stack<Integer> s = new Stack <>();
        for(int i = nums2.length - 1; i >= 0; i--){
            while(!s.isEmpty() && nums2[i] >= s.peek()){
                s.pop();
            }
            if(!s.isEmpty()){
                nge[i] = s.peek();
            }
            else{
                nge[i] = -1;
            }
            s.push(nums2[i]);
        }
        HashMap<Integer, Integer> ngeMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            ngeMap.put(nums2[i], nge[i]);
        }

        // Step 3: Find next greater elements for elements in nums1 using the hashmap
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = ngeMap.get(nums1[i]);
        }

        return ans;

    }
    public static void main(String[] args) {
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        nextGreaterElement(nums1,nums2);

    }
}
