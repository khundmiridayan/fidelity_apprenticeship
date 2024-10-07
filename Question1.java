import java.util.Scanner;

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage the linked list operations
class LinkedList {
    Node head;

    // Method to add elements to the linked list
    public void append(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to remove an element at a particular index
    public void removeAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the head needs to be removed
        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Find the previous node of the node to be deleted
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        // If index is out of range
        if (temp == null || temp.next == null) {
            System.out.println("No element at index " + index);
            return;
        }

        // Node temp.next is the node to be deleted
        Node next = temp.next.next;

        // Unlink the node from the linked list
        temp.next = next;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a linked list
        LinkedList llist = new LinkedList();

        // Input the number of elements for the linked list
        System.out.print("Enter the number of elements for the linked list: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Get elements from the user and add to the linked list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = sc.nextLine();
            llist.append(element);
        }

        // Print the list before deletion
        System.out.println("Linked list before deletion:");
        llist.printList();

        // Get the index from the user to remove an element
        System.out.print("Enter the index of the element to remove: ");
        int index = sc.nextInt();

        // Remove the element at the specified index
        llist.removeAtIndex(index);

        // Print the list after deletion
        System.out.println("Linked list after deletion:");
        llist.printList();
    }
}