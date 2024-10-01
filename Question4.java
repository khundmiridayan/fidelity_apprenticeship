import java.util.Scanner;

class Node1{
    int data;
    Node1 left, right;
    public Node1(int data){
        this.data = data;
        left = right = null;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tree structure: ");
        String input = sc.nextLine();
        Node1 root = buildTree(input);

        System.out.println("Pre order traversal : ");
        preorder(root);
        System.out.println();
    }

    private static Node1 buildTree(String input){
        String[] nodes = input.split(" ");
        int[] index ={0};
        return buildTreehelper(nodes,index);
    }
    private static Node1 buildTreehelper(String[] nodes, int[] index){
        if(index[0] >= nodes.length || nodes[index[0]].equals("/")){
            index[0]++;
            return null;
        }
        Node1 root = new Node1(Integer.parseInt(nodes[index[0]]));
        index[0]++;
        root.left = buildTreehelper(nodes, index);
        root.right = buildTreehelper(nodes , index);
        return root;
    }
    private static void preorder(Node1 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    }

