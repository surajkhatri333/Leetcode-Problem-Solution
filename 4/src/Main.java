//--------------> 4. Median of Two Sorted Arrays <------------
import java.util.*;
public class Main {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int  totalsum = 0;
        double result = 0;
        int k = 0;
        int merged[] = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            merged[k]= nums1[i];
            totalsum += nums1[i];
            k++;
        }
        for (int j = 0; j < nums2.length; j++) {
            merged[k] = nums2[j];
            totalsum += nums2[j];
            k++;
        }
        Arrays.sort(merged);
        if((nums1.length + nums2.length) % 2 == 1) return (double)merged[merged.length/2];
        else{
            return (double)(merged[merged.length/2] + merged[merged.length/2 - 1])/ 2;
        }


    }
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println("The median of both the sorted the array is : "+ findMedianSortedArrays(nums1,nums2));
    }
}