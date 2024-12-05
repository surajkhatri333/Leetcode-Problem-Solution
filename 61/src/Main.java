
import java.util.List;
import java.util.LinkedList;
public class Main {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
        //leetcode function ( Two approaches are given to solve this prorblem you can use any of them)
        // FIRST APPROACH
        public static ListNode rotateRight(ListNode head, int k) {
            int rotation = 0;
            List<ListNode> list = new LinkedList<>();
            ListNode temp = head;
            while (temp != null) {
                list.add(temp);
                temp = temp.next;
            }

            while (rotation != k) {
                list.addFirst(list.removeLast());
                rotation += 1;
            }
            head = list.get(0);
            temp = head;
            for (int i = 0; i < list.size(); i++) {
                temp.next = list.get(i);
                temp = temp.next;
                if (i == list.size() - 1) {
                    temp.next = null;
                }
            }

            return head;
        }

        // SECOND APPROACH
//    public static ListNode rotateRight(ListNode head, int k) {
//        int size = 0;
//        ListNode temp = head;
//        while(temp != null){
//            size++;
//            temp = temp.next;
//        }
//        temp = head;
//        ListNode newhead = new ListNode();
//        int count = 0;
//        while(count != size){
//            count++;
//            if(count == size - k){
//                newhead = temp.next;
//                temp.next = null;
//                temp = newhead;
//                count++;
//            }
//            if(temp.next == null){
//                break;
//            }
//            temp = temp.next;
//        }
//        temp.next = head;
//        return newhead;
//
//
//    }
        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            ListNode temp = head;
            System.out.println("linkedlist before rotation");
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }

            ListNode newhead = rotateRight(head, 2);

            System.out.println();
            System.out.println("linkedlist after rotation");
            while (newhead != null) {
                System.out.print(newhead.val + " -> ");
                newhead = newhead.next;
            }
        }

}