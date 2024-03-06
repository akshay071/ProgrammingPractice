package org.leetcode;


class ListNode {
    // Data stored in the node
    public int data;
    // Pointer to the next node in the list
    public ListNode next;

    // Constructor with both data
    // and next node as parameters
//    public ListNode(int data, ListNode next) {
//        this.data = data;
//        this.next = next;
//    }

    // Constructor with only data as
    // a parameter, sets next to null
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCycle {

    // Function to detect a loop in a linked list
    // using the Tortoise and Hare Algorithm
    public static boolean detectCycle(ListNode head) {
        // Initialize two pointers, slow and fast,
        // to the head of the linked list
        ListNode slow = head;
        ListNode fast = head;

        // Step 2: Traverse the linked list
        // with the slow and fast pointers
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;
            // Move fast two steps
            fast = fast.next.next;

            // Check if slow and fast pointers meet
            if (slow == fast) {
                return true;  // Loop detected
            }
        }

        // If fast reaches the end of the
        // list, there is no loop
        return false;
    }


    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        // Check if there is a loop
        // in the linked list
        if (detectCycle(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

        // No need to explicitly free memory
        // in Java; the garbage collector handles it
    }
}
