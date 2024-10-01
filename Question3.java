import java.util.Scanner;




class LinkedLists {
     Node head;

    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position ==1){
            newNode.next = head;
            head = newNode;
        }else {
            Node temp = head;
            for(int i = 0; i < position-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
            }
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.date + " ");
            current = current.next;
        }
        System.out.println();
    }
    }

public class Question3 {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes to insert");
        int numNodes = scanner.nextInt();

        System.out.println("Enter the data for each node: ");
        Node temp= null;

        for (int i = 0; i < numNodes; i++) {
            int data = scanner.nextInt();
            if(i==0){
                list.head = new Node(data);
                 temp = list.head;

            }  else {
                Node newNode = new Node(data);
                temp.next = newNode;
                temp = newNode;
            }
        }

        System.out.println("Initial linked list: ");
        list.printList();

        System.out.println("Enter the data to insert: ");
        int data = scanner.nextInt();

        System.out.println("Enter the position to insert: ");
        int position = scanner.nextInt();
        list.insertAtPosition(data, position);
        System.out.println("Updated linked list: ");
        list.printList();
    }
}

