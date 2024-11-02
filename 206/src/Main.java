// REVERSE SINGLY LINKED LIST

public class Main {
    public static class Node{
        int val;
        Node next;

        Node() { };
        Node(int data) {this.val = data; this.next = null;}
        Node(int data,Node next) { this.val = data; this.next = next;};
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node node = null;   // after reversing linkedlist node became the new head
        while(head != null){
            Node newNode = head.next;
            head.next = node;
            node = head;
            head = newNode;
        }

        Node temp = node;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}