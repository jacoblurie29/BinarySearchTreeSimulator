/**
 * The following class represents a node to be used in a binary search tree (BinarySearchTree.java)
 *
 * @author Jacob Lurie
 * @version 1.2
 * @since 2021-11-19
 */
public class Node {

    private int key;
    private Node leftChild;
    private Node rightChild;

    /**
     * Constructor for the node class initiates the node values as null with the specific key, k
     * @param k the key for this node
     */
    public Node(int k) {

        key = k;
        leftChild = null;
        rightChild = null;

    }

    /**
     * Returns value of key for node
     * @return value of key
     */
    public int getKey() {
        return key;
    }

    /**
     * Sets value of key for node
     * @param key new value of key
     */
    public void setKey(int key) {
        this.key = key;
    }

    /**
     * Gets the left child of the node
     * @return node of left child
     */
    public Node getLeftChild() {
        return leftChild;
    }

    /**
     * Sets the left child of the node
     * @param leftChild new left child node
     */
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * Gets the right child of the node
     * @return node of right child
     */
    public Node getRightChild() {
        return rightChild;
    }

    /**
     * Sets the right child of the node
     * @param rightChild new left child node
     */
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
