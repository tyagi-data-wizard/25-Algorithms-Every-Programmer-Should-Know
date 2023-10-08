/*Write a Java function to detect whether a cycle exists in the linked list.
If a cycle is found, return true; otherwise, return false. Additionally, if a cycle is detected, modify your function to find the start of the cycle.*/

Code:

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class CycleDetection {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected
                return true;
            }
        }

        return false;
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected
                break;
            }
        }

        // No cycle found
        if (fast == null || fast.next == null) {
            return null;
        }

        // Find the start of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;  // Create a cycle

        System.out.println("Cycle exists: " + hasCycle(head));
        ListNode cycleStart = detectCycle(head);
        System.out.println("Start of the cycle: " + (cycleStart != null ? cycleStart.val : "No cycle"));
    }
}
