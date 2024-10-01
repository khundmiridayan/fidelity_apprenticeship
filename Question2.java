import java.util.Scanner;

class LinkedList2 {
    Node head;
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.date +" ->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}


public class Question2 {
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number to be inserted: ");
            int data = scanner.nextInt();
            if(data == -1){
                break;
            }
            list.insertAtHead(data);
            list.printList();
        }
    }
}
