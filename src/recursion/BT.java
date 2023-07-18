package recursion;

public class BT {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Perform in-order traversal of the binary tree
        System.out.print("In-order traversal: ");
        tree.inOrderTraversal(tree.root);
    }
    // Node class represents an individual node in the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // BinaryTree class represents the binary tree and its operations
    static class BinaryTree {
        Node root;

        // Constructor
        public BinaryTree() {
            root = null;
        }
        // Method to insert a new node in the binary tree
        void insert(int data) {
            root = insertRecursive(root, data);
        }

        // Recursive method to insert a new node in the binary tree
        Node insertRecursive(Node root, int data) {
            // If the tree is empty, create a new node and return it
            if (root == null) {
                root = new Node(data);
                return root;
            }

            // Otherwise, recur down the tree
            if (data < root.data) {
                root.left = insertRecursive(root.left, data);
            } else if (data > root.data) {
                root.right = insertRecursive(root.right, data);
            }

            return root;
        }
        // Method to perform an in-order traversal of the binary tree
        void inOrderTraversal(Node root) {
            if (root != null) {
                inOrderTraversal(root.left);
                System.out.print(root.data + " ");
                inOrderTraversal(root.right);
            }
        }
    }

}
