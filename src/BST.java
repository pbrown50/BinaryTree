import java.util.ArrayList;
import java.util.Stack;

/**
 * An Integer Binary Search Tree
 * @author: Your Name Here
 * @version: Date
 */

public class BST {
    private BSTNode root;

    public BSTNode getRoot() {
        return this.root;
    }

    public void setRoot(BSTNode root) {
        this.root = root;
    }
    private ArrayList<BSTNode> inOrder;
    private ArrayList<BSTNode> preOrder;
    private ArrayList<BSTNode> postOrder;


    /**
     * Sets up a binary search tree
     * with some default values
     */
    public void setupTestData() {
        this.root = new BSTNode(10);
        this.root.setLeft(new BSTNode(5));
        this.root.setRight(new BSTNode((15)));
        this.root.getLeft().setLeft(new BSTNode(3));
        this.root.getLeft().setRight(new BSTNode(9));
        inOrder = new ArrayList<BSTNode>();
        preOrder = new ArrayList<BSTNode>();
        postOrder = new ArrayList<BSTNode>();
    }

    /**
     * Prints the provided ArrayList of nodes
     * in the form node1-node2-node3
     * @param nodes ArrayList of BSTNodes
     */
    public static void printNodes(ArrayList<BSTNode> nodes) {
        for(int i=0; i<nodes.size()-1; i++) {
            System.out.print(nodes.get(i) + "-");
        }
        System.out.println(nodes.get(nodes.size()-1));
    }

    /**
     * A function that searches for a value in the tree
     * @param val integer value to search for
     * @return true if val is in the tree, false otherwise
     */
    public boolean search(int val) {
        // TODO: Complete the search function
        // Calls helper method
        return searchTree(root, val);
    }
    public boolean searchTree(BSTNode node, int val) {
        // Base case: node is equal to value
        if (node.getVal() == val) {
            return true;
        }
        // searches right side of tree recursively
        else if (node.getRight() != null){
            return searchTree(node.getRight(), val);
        }
        // searches right side of tree recursively
        else if (node.getLeft() != null){
            return searchTree(node.getLeft(), val);
        }
        // if value still has not been found, returns false
        return false;
    }

    /**
     * @return ArrayList of BSTNodes in inorder
     */
    public ArrayList<BSTNode> getInorder() {
        // TODO: Complete inorder traversal
        // Calls helper method
        inOrder(root);
        return inOrder;
    }
    // recursively traverses array, adding nodes to arraylist in their correct order
    public void inOrder(BSTNode node) {
        // if the left node is not empty
        if (node.getLeft() != null) {
            // recursive step is called to continue traversing tree to the left
            inOrder(node.getLeft());
        }
        // node is added to array
        inOrder.add(node);
        // if the right node is not empty
        if (node.getRight() != null) {
            // recursive step is called to continue traversing tree to the right
            inOrder(node.getRight());
        }
    }

    /**
     * @return ArrayList of BSTNodes in preorder
     */
    public ArrayList<BSTNode> getPreorder() {
        // TODO: Complete preorder traversal
        // Calls helper method
        preOrder(root);
        return preOrder;
    }
    // recursively traverses array, adding nodes to arraylist in their preorder
    public void preOrder(BSTNode node) {
        // node is added to array
        preOrder.add(node);
        // if the left node is not empty
        if (node.getLeft() != null) {
            // recursive step is called to continue traversing tree to the left
            preOrder(node.getLeft());
        }
        // if the right node is not empty
        if (node.getRight() != null) {
            // recursive step is called to continue traversing tree to the right
            preOrder(node.getRight());
        }
    }

    /**
     * @return ArrayList of BSTNodes in postorder
     */
    public ArrayList<BSTNode> getPostorder() {
        // TODO: Complete postorder traversal
        // Calls helper method
        postOrder(root);
        return postOrder;
    }
    // recursively traverses array, adding nodes to arraylist in their postorder
    public void postOrder(BSTNode node) {
        // if the left node is not empty
        if (node.getLeft() != null) {
            // recursive step is called to continue traversing tree to the left
            postOrder(node.getLeft());
        }
        // if the right node is not empty
        if (node.getRight() != null) {
            // recursive step is called to continue traversing tree to the right
            postOrder(node.getRight());
        }
        // node is added to array
        postOrder.add(node);
    }

    /**
     * Inserts the given integer value to the tree
     * if it does not already exist. Modifies the
     * root instance variable to be the root of the new modified tree.
     * @param val The value ot insert
     */
    public void insert(int val) {
        // TODO: Complete insert
        // Calls helper method
        insert(root, val);
    }
    // inserts value into tree, finds location using recusrion to traverse tree
    public void insert(BSTNode node, int val) {
        // if value is less than node
        if (val < node.getVal()) {
            // if the left node is empty
            if (node.getLeft() == null) {
                // creates new node with value
                node.setLeft(new BSTNode(val));
            }
            // if the left node is not empty
            else {
                // recursive step is called to continue traversing tree
                insert(node.getLeft(), val);
            }
        }
        // if value is greater than node
        if (val > node.getVal()) {
            // if the right node is empty
            if (node.getRight() == null) {
                // creates new node with value
                node.setRight(new BSTNode(val));
            }
            // if the right node is not empty
            else {
                // recursive step is called to continue traversing tree
                insert(node.getRight(), val);
            }
        }
    }

    /**
     * Determines if the current BST is
     * a valid BST.
     * @return true if valid false otherwise
     */
    public boolean isValidBST() {
        // TODO: Optional Challenge!
        return false;
    }

    public static void main(String[] args) {
        // Tree to help you test your code
        BST tree = new BST();
        tree.setupTestData();

        System.out.println("\nSearching for 15 in the tree");
        System.out.println(tree.search(15));

        System.out.println("\nSearching for 22 in the tree");
        System.out.println(tree.search(22));

        System.out.println("\nInorder traversal of binary tree is");
        ArrayList<BSTNode> sol = tree.getInorder();
        printNodes(sol);

        System.out.println("\nPreorder traversal of binary tree is");
        sol = tree.getPreorder();
        printNodes(sol);

        System.out.println("\nPostorder traversal of binary tree is");
        sol = tree.getPostorder();
        printNodes(sol);



    }
}
