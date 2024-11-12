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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode l3 = new ListNode(0, null);

        int carry = 0;
        ListNode temp = l3;

        while (temp1 != null && temp2 != null) {
            int sum = temp1.val + temp2.val + carry;

            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while (temp1 != null) {
            int sum = temp1.val + carry;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            int sum = temp2.val + carry;
            if (sum > 9) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            temp2 = temp2.next;
        }
        if (carry != 0) temp.next = new ListNode(carry);
        temp = l3.next;
        return temp;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = addTwoNumbers(l1,l2);  // assign the head of new resulting linked list

        //PRINT NEW LINKED LIST
        ListNode temp = l3;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }



    }
}