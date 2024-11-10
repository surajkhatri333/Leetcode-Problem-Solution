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

    //function used in leetcode to solve problem
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA.next == null && headB.next == null && headA == headB) return headA;
        while(headB != null){
            ListNode temp = headA;
            while(temp != null ){
                if(temp == headB){
                    return temp;
                }
                temp = temp.next;
            }
            headB = headB.next;
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(1);
        headA.next.next.next = new ListNode(3);

        ListNode node = headA.next;

        ListNode headB = new ListNode(3);
        headB.next = node;
        headB.next.next = new ListNode(9);
        headB.next.next.next = new ListNode(4);

        System.out.println(getIntersectionNode(headA,headB).val);
    }
}