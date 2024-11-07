//---------------->234. Palindrome Linked List<--------------------

import java.util.ArrayList;
public class Main {

    //PROBLEM FUNCTION
    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        ArrayList<Integer> al = new ArrayList<>();
        while(node.next != null){
            al.add(node.val);
            node = node.next;
        }
        al.add(node.val);        //add last node
        int j = al.size() - 1;
        int i= 0;
        while( i < j){
            if(al.get(j) != al.get(i)) return false;
            i++;j--;
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}