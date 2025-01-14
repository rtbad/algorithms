package org.example.leetcode;

class ListNode {
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

public class AddTwoNumbers {

    public static void main(String[] args) {
        System.out.println("Test");
        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(9);
//        l1.next.next = new ListNode(9);
//        l1.next.next.next = new ListNode(9);
//        l1.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next.next = new ListNode(9);
//        9,9,9,9,9,9,9
        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(9);
//        l2.next.next.next = new ListNode(9);
        var head = addTwoNumbers(l1, l2);
        printList(head);
        var head2 = reorder(head);
        printList(head2);
    }


    public static void printList(ListNode head) {
        ListNode next = head;
        while (next != null) {
            System.out.print(next.val);
            if (next.next != null) {
                System.out.print("->");
            }
            next = next.next;
        }
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(l1.val + l2.val);
        ListNode head = result;
        ListNode l1n = l1.next;
        ListNode l2n = l2.next;
        int div = 0;
        while (l1n != null || l2n != null) {
            int sum = 0;
            if (l1n == null) {
                sum = l2n.val;
            }
            if (l2n == null) {
                sum = l1n.val;
            }
            if (l2n != null && l1n != null) {
                sum = l1n.val + l2n.val;
            }

            ListNode newNode = new ListNode(sum);
            result.next = newNode;
            if(l1n != null){
                l1n = l1n.next;
            }
            if(l2n != null){
                l2n = l2n.next;
            }
            result = result.next;
        }
        return head;
    }

    public static ListNode reorder(ListNode l1) {
        int total = l1.val;
        int rest = total % 10;
        int div = total / 10;
        ListNode newList = new ListNode(rest);
        ListNode head = newList;
        if(l1.next == null&&div>0){
            newList.next = new ListNode(div);
        }
        while (l1.next != null) {
            int newVal = (l1.next.val + div);
            total = newVal;
            rest = total % 10;
            div = total / 10;
            newList.next = new ListNode(rest);
            newList = newList.next;
            l1 = l1.next;
            if(div>0)newList.next = new ListNode(div);
        }
        return head;
    }

}

