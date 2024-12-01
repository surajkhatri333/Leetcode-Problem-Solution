//------------>19. Remove Nth Node From End of List<-----------
public class Main {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //leetcode function
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //calculate size of linkedlist
        ListNode temp = head;
        int size = 0;
        while( temp != null){
            size++;
            temp = temp.next;
        }
        if (n == size) {
            return head.next;
        }
        ListNode curr = head;
        for(int i = 1; i < size - n ; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;

    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Before removing element linkedlist is :");
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+"-> ");
            temp = temp.next;
        }
        System.out.println();
        ListNode newroot = removeNthFromEnd(head,2);
        System.out.println("After removing element linkedlist is : ");
        while(newroot != null){
            System.out.print(newroot.val+"-> ");
            newroot = newroot.next;
        }
    }
}