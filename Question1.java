import java.util.Scanner;


class LinkedList{
    Node head;

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
public void display(){
    Node current = head;
    while(current != null){
    System.out.println(current.date);
    current = current.next;
    }
}
}


public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("enter data for node" + (i +1) + ":");
            int data = scanner.nextInt();
            list.insertAtTail(data);
        }

        System.out.println("The Linked List is: ");
        list.display();
        scanner.close();
    }
}
