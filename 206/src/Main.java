// REVERSE SINGLY LINKED LIST


// READ THE COMMENTS -> FOR LEETCODE THE COMMENT ARE MENTION OTHER CODE IS FOR RUN THE PROGRAM IN CODE EDITOR
public class Main {
    public static class Node{
        int val;
        Node next;

        Node() { };
        Node(int data) {this.val = data; this.next = null;}
        Node(int data,Node next) { this.val = data; this.next = next;};
    }
    public static void main(String[] args){
        /* this is for code editor
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);

         */

//this is for problem
        Node node = null;   // after reversing linkedlist node became the new head
        while(head != null){
            Node newNode = head.next;
            head.next = node;
            node = head;
            head = newNode;
        }

        /* this is also for code editor

//        Node temp = node;
//        while(temp != null){
//            System.out.print(temp.val + " ");
//            temp = temp.next;
//        }

         */
    }
}