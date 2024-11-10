//---------------->148  Sort List <------------------
import java.util.*;
public class Main {

      public static class ListNode {
          int val;
          ListNode next;

          ListNode() {
          }

          ListNode(int val) {
              this.val = val;
          }

          ;

          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next;
          }
      }


    public static ListNode sortList(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> al = new ArrayList<>();
        while(head != null){
            al.add(head.val);
            head = head.next;
        }

        Collections.sort(al);
        ListNode newhead = new ListNode(al.get(0));
        ListNode temp = newhead;
        for(int i = 1; i < al.size();i++){
            temp.next = new ListNode(al.get(i));
            temp = temp.next;
        }

        return newhead;
    }
    public static void main(String[] args) {
        System.out.println(" ");
    }
}