/**
 * The following code is a tester class for the BinarySearchTree class and Node.java class.
 * The program inserts integers into the binary search tree and utilizes the methods to manipulate the existing tree.
 *
 * @author Jacob lurie
 * @version 1.2
 * @since 2021-11-19
 */

public class BST_Tester {

    public static void main(String[] args) {


        // The following code tests the BinarySearchTree Class, all keys inserted are different values

        int keys[] = {4,1,2,5,8,3,7,9};

        Node root = new Node(keys[0]);

        BinarySearchTree BST = new BinarySearchTree();

        System.out.println("First we will insert all the keys and print\n" +
                "an inorder traversal after each insertion.");
        for (int i = 1; i < 8; i++) {
            BST.insert(root, keys[i]);
            BST.inorder(root);
            System.out.println("------");
        }

        System.out.println("Next we will print the sum of all values: " + BST.sum(root));


        System.out.println("Next we will search for a key and print it.");
        Node j = BST.search(root,7);
        System.out.println("FOUND ITEM: " + j.getKey());

        System.out.println("Next we will print the k'th smallest value in the tree.");
        Node k = BST.kthSmallest(root, 3);
        System.out.println("KTH SMALLEST: " + k.getKey());

        System.out.println("Next we will delete a value from the tree and print and inorder traversal.");
        Node u = BST.delete(root, 3);

        BST.inorder(root);

    }

}

