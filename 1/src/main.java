import java.util.*;
public class main {

    public static  int sumSubarrayMins(int[] arr) {
        ArrayList<ArrayList<Integer>> listoflist = new  ArrayList<>();


        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            Stack<Integer> stack = new Stack<>();
            int min = Integer.MAX_VALUE;
            for(int j = i; j < arr.length; j++){

                    min = Math.min(min,arr[j]);
                    stack.push(min);
                    sum += min;
//                ArrayList<Integer> list = new ArrayList<>();
//                for(int k = i; k <= j; k++){
//                    list.add(arr[k]);
//                }
//                listoflist.add(list);
            }
        }
//        System.out.println(listoflist);
//        System.out.println(list);

//        int minSum = 0;
//
//        for(ArrayList<Integer> innerList : listoflist){
//            int min =  Collections.min(innerList);
//            minSum += min;
//        }
        return sum;
    }

    public static void main(String[] args){
        String sentence = "leetcode exercises sound delightful";
        String[] c = sentence.split(" ");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println(c.length);

    }
}
