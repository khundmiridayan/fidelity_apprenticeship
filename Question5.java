import java.util.Scanner;

class LinkedLists1 {
    Node head;

    public void insertAtTail(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;

        }
    }
    public void reverseList(){
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    head = prev;
}
public void printList(){
    Node current = head;
    while (current != null) {
    System.out.print(current.date + " ");
    current = current.next;
    }
    System.out.println();
}
}

public class Question5 {
    public static void main(String[] args) {
        LinkedLists1 list = new LinkedLists1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Element" + (i +1) + ":");
            int data = scanner.nextInt();
            list.insertAtTail(data);
        }
        System.out.println("Original  list is: ");
        list.printList();

        list.reverseList();
        System.out.println("Reversed list is: ");
        list.printList();
    }
}
