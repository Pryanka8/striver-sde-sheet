
// Given the head of a linked list, rotate the list to the right by k places.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class DayTwo {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode kth = head;
        ListNode last = head.next;
        while (k > 1) {
            if (last == null) {
                // k > size of list , making list cycleic , let's see
                last = head;
            }
            last = last.next;
            k--;
        }
        if (last == null)
            last = head;
        while (last.next != null) {
            kth = kth.next;
            last = last.next;
        }

        last.next = head;
        ListNode ans = kth.next;
        kth.next = null;

        return ans;
    }

    public static void main(String[] args) {
        DayTwo solution = new DayTwo();

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        int k = 2;
        ListNode rotatedHead = solution.rotateRight(head, k);

        System.out.print("Rotated list: ");
        while (rotatedHead != null) {
            System.out.print(rotatedHead.val + " ");
            rotatedHead = rotatedHead.next;
        }
    }
}