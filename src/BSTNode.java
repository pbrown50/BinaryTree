/**
 * The Node for an Integer Binary Tree
 *
 * @author: Nandhini Namasivayam
 * @version: 03/22/22
 */

public class BSTNode {
    private BSTNode left;
    private BSTNode right;
    private int val;
    private boolean visited;

    public BSTNode(int val) {
        this.left = null;
        this.right = null;
        this.val = val;
        this.visited = false;
    }

    /** Getters and Setters **/
    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public String toString() {
        return Integer.toString(this.val);
    }

    public boolean equals(BSTNode other) {
        return this.val == other.val;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited() {
        this.visited = true;
    }
}
