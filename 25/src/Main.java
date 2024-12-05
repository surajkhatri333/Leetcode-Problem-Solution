//-----------> 25. Reverse Nodes in k-Group <----------
import java.util.ArrayList;
public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //leetcode function
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        ListNode prevNode = head;
        int index = 0;
        while(temp != null){
            index += 1;
            if(index == k  || index % k == 0){
                for(int i = index - 1 ; i >= index - k  ; i--){
                    if(prevNode != null){
                        prevNode.val = list.get(i);
                        prevNode = prevNode.next;
                    }
                }
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode newhead = reverseKGroup(head,2);

        // print linkedlist after reversal
        while(newhead != null){
            System.out.print(newhead.val +" -> ");
            newhead = newhead.next;
        }
    }
}