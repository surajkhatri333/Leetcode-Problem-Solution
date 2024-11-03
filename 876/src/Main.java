//------------------>876. Middle of the Linked List <--------------

// only the problem funciton is provided <--------
public class Main {

//      public class ListNode {
//          int val;
//          ListNode next;
//          ListNode() {}
//          ListNode(int val) { this.val = val; }
//          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//
//     }

    public static ListNode middleNode(ListNode head) {
        if(head == null) return head;
        int count = 0;
        ListNode temp = head;
        int length = 0;

        while(temp != null){
            temp = temp.next;
            length++;
        }

        length = length/2;

        ListNode curr = head;
        while(count < length){
            curr = curr.next;
            count++;
        }
        return curr;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}