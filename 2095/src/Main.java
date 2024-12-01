//---------------> 2095. Delete the Middle Node of a Linked List <----------

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int size = 0;       //calculate the size of linked list
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(size == 1){
            return null;
        }
        if(size == 2){
            head.next = null;
            return head;
        }
        size = size /2;    // now size contain the middle index
        temp = head;
        for(int i= 0; i < size - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Before removing middle element linkedlist is :");
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+"-> ");
            temp = temp.next;
        }
        System.out.println();
        ListNode newroot = deleteMiddle(head);
        System.out.println("After removing middle element linkedlist is : ");
        while(newroot != null){
            System.out.print(newroot.val+"-> ");
            newroot = newroot.next;
        }
    }
}