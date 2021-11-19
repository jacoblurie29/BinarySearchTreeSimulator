/**
 * The following class defines a binary search tree of nodes (Node.java) that contains multiple operations
 *
 * @author Jacob Lurie
 * @version 1.2
 * @since 2021-11-19
 */
public class BinarySearchTree {


    /**
     * The following recursive method inserts a key into the tree
     * @param root the root node of the binary search tree
     * @param key the key that is to be inserted into the binary search tree
     * @return the node at which the key was inserted to
     */
    public Node insert(Node root, int key) {

        /*
            Conditional statements evaluates if key already exists
            If not, performs inorder traversal to find insertion point, then inserts
         */
        if(root.getKey() == key) {
            throw new IllegalArgumentException("Key already exists.");
        } else if(key < root.getKey()) {
            if(root.getLeftChild() == null) {
                root.setLeftChild(new Node(key));
            } else {
                insert(root.getLeftChild(), key);
            }
        } else {
            if(root.getRightChild() == null) {
                root.setRightChild(new Node(key));
            } else {
                insert(root.getRightChild(), key);
            }
        }

        return root;

    }

    /**
     * The following method recursively prints an inorder traversal of the binary search tree
     * @param root the root node of the binary search tree
     */
    public void inorder(Node root) {

        // Performs inorder traversal checking for null nodes and prints as it goes

        if(root.getLeftChild() != null) {
            inorder(root.getLeftChild());
        }

        System.out.println(root.getKey() + " ");

        if(root.getRightChild() != null) {
            inorder(root.getRightChild());
        }

    }

    /**
     * The following method recursively prints the sum of all the values in the binary search tree
     * @param root the root node of the binary search tree
     * @return sum of all values in the tree
     */
    public int sum(Node root) {


        // Returns sum of all values of tree if root is not null and if current node is not null
        if(root == null) {
            return 0;
        } else {
            return root.getKey() + sum(root.getRightChild()) + sum(root.getLeftChild());
        }

    }

    /**
     * The following method recursively searches for a key and returns the node of the key or returns null if it doesn't exist.
     * @param root the root node of the binary search tree
     * @param key the key that is being searched for
     * @return the node at which the key in question exists
     */
    public Node search(Node root, int key) {


        // Searches for key while performing inorder traversal
        if(root == null) {
            return null;
        } else if (root.getKey() == key) {
            return root;
        } else if (root.getKey() > key) {
            return search(root.getLeftChild(), key);
        } else  {
            return search(root.getRightChild(), key);
        }

    }

    /**
     *  The following method recursively searches for the kth smallest key and returns the node if it exists
     * @param root the root node of the binary search tree
     * @param k represents the sorted index of the key looking to be found. Method is searching for
     *          the "kth" smallest node
     * @return the node at which the "kth" smallest value exists
     */
    public Node kthSmallest(Node root, int k) {

        // Performs inorder traversal while searching for kth smallest value
        if(k == 0) {
            if(root == null) {
                throw new ArrayIndexOutOfBoundsException("k is larger than array");

            } else {
                return root;
            }
        } else {


            // By recalling the method with k-1, the tree gets smaller as k does, making it approach the value
            if (root.getLeftChild() != null) {
                return kthSmallest(root.getLeftChild(), k - 1);
            }

            if (root.getRightChild() != null) {
                return kthSmallest(root.getRightChild(), k - 1);
            }


            return null;

        }
    }

    /**
     * The following method recursively deletes a node in the binary search tree
     * @param root the root node of the binary search tree
     * @param key the key that is to be deleted from the tree
     * @return the node at which the deleted key exists at
     */
    public Node delete(Node root, int key) {



            if (root == null)
                return root;

            // Deletes node by first searching using inorder traversal, then deleting and reassigning next nodes
            if (key < root.getKey()) {
                root.setLeftChild(delete(root.getLeftChild(), key));
            } else if (key > root.getKey()) {
                root.setRightChild(delete(root.getRightChild(), key));
            } else {

                if (root.getLeftChild() == null)
                    return root.getRightChild();
                else if (root.getRightChild() == null)
                    return root.getLeftChild();


                Node smallestRightMost = root;

                while(smallestRightMost != null) {
                    if(smallestRightMost.getLeftChild() != null) {
                        smallestRightMost = smallestRightMost.getLeftChild();
                    } else {
                        break;
                    }
                }

                root.setKey(smallestRightMost.getKey());

                root.setRightChild(delete(root.getRightChild(), root.getKey()));
            }

            return root;
        }





}
