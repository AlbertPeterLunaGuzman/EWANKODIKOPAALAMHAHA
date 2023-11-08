/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodeteststring;

/**
 *
 * @author STAR
 */
public class NodeTestString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
            //BinaryTree tree = balancedBinaryTree();
            
            BinaryTree tree = balancedBinaryTreeManual();
            
            //Step 2: Print the number of nodes in the binary tree.
                System.out.println("Number of Nodes: " + tree.countNodes());
                
            //Step 3: Print the values in-order traversal.
                System.out.print("This is the in Order sequence:       ");
                    tree.printInOrder();

            //Step 4: Print the values in pre-order traversal.
                System.out.print("\nThis is the Pre Order sequence:      ");
                    tree.printPreOrder();

            //Step 5: Print the values in post-order traversal.
                System.out.print("\nThis is the Post Order sequence:     ");
                    tree.printPostOrder();

            //Step 6: Print the values in level order traversal.
                System.out.print("\nThis is the In Level Order sequence: ");
                    tree.printLevelOrder();
                
            //Step 7: Print the height of the binary tree.
                System.out.println("\nHeight of the tree: " + tree.getHeight());
        
            //Step 8: Print the depth of the binary tree.
                System.out.println("Depth of the tree: " + tree.getDepth());
                
            //Step 9: Check if the binary tree is full.
                System.out.println("Is binary tree full: " + tree.isBinaryTreeFull());
        
            //Step 10: Check if the binary tree is balanced.
                System.out.println("Is binary tree balanced: " + tree.isBalanced());
            
            //Step 11: Check if the binary tree is perfect.
                System.out.println("Is binary tree perfect: " + tree.isPerfect());
                
            //Step 12: Check if the binary tree is complete.
                System.out.println("Is binary tree complete: " + tree.isComplete() );
            
            //Step 13: Remove 50, 60 and 75 from the binary tree.
            System.out.println("\n                  REMOVED 3 ELEMENTS. ");
                tree.delete("liwi");

            //Step 14: Repeat steps 2 to 12.
            System.out.println("\n                  REPEATING STEPS 2 TO 12.");
                System.out.println("Number of Nodes: " + tree.countNodes());
                
                System.out.print("This is the in Order sequence:       ");
                    tree.printInOrder();

                System.out.print("\nThis is the Pre Order sequence:      ");
                    tree.printPreOrder();

                System.out.print("\nThis is the Post Order sequence:     ");
                    tree.printPostOrder();

                System.out.print("\nThis is the In Level Order sequence: ");
                    tree.printLevelOrder();
                
                System.out.println("\nHeight of the tree: " + tree.getHeight());
        
                System.out.println("Depth of the tree: " + tree.getDepth());
                
                System.out.println("Is binary tree full: " + tree.isBinaryTreeFull());
        
                System.out.println("Is binary tree balanced: " + tree.isBalanced());
            
                System.out.println("Is binary tree perfect: " + tree.isPerfect());
                
                System.out.println("Is binary tree complete: " + tree.isComplete() );
            
            //Step 15: Add 5, 10 and 20 as new nodes in the binary tree.
                tree.addNode("lemon");
                tree.addNode("lime");
                tree.addNode("coconut");
                
            //Step 16: Repeat steps 2 to 12.
            System.out.println("\n                  REPEATING STEPS 2 TO 12.");
            
                System.out.println("Number of Nodes: " + tree.countNodes());
                
                System.out.print("This is the in Order sequence:       ");
                    tree.printInOrder();

                System.out.print("\nThis is the Pre Order sequence:      ");
                    tree.printPreOrder();

                System.out.print("\nThis is the Post Order sequence:     ");
                    tree.printPostOrder();

                System.out.print("\nThis is the In Level Order sequence: ");
                    tree.printLevelOrder();
                
                System.out.println("\nHeight of the tree: " + tree.getHeight());
        
                System.out.println("Depth of the tree: " + tree.getDepth());
                
                System.out.println("Is binary tree full: " + tree.isBinaryTreeFull());
        
                System.out.println("Is binary tree balanced: " + tree.isBalanced());
            
                System.out.println("Is binary tree perfect: " + tree.isPerfect());
                
                System.out.println("Is binary tree complete: " + tree.isComplete() );
            
            //Step 17: Find if a value is still available in the binary tree. If it is found, print its level. 
                String value = "Banana";
                System.out.println(value + " Found at level " + tree.nodeSearcher(value));
    }
 
    public static BinaryTree balancedBinaryTree(){
        BinaryTree tree = new BinaryTree();
        //Do a balanced binary tree positioning for these elements    
        //Elements: "apple","banana", "cherry", "orange", "kiwi", "pear", "grape", "pineapple", "mango", "strawberry"
        
            tree.root = new Node("apple");
            
            tree.root.left = new Node("banana");
            tree.root.right = new Node("cherry");
            
        return tree;
    }
    
    public static BinaryTree balancedBinaryTreeManual() {
        BinaryTree tree = new BinaryTree();

            tree.root = new Node("apple");

            tree.root.left = new Node("banana");
            tree.root.right = new Node("cherry");

            tree.root.left.left = new Node("orange");
            tree.root.left.right = new Node("kiwi");
            tree.root.right.left = new Node("pear");
            tree.root.right.right = new Node("grape");

            tree.root.left.left.left = new Node("pineapple");
            tree.root.left.left.right = new Node("mango");
            tree.root.left.right.left = new Node("strawberry");

        return tree;
    }
    
    
    
    public static BinaryTree binarySearchTree(){
        BinaryTree tree = new BinaryTree();
        
        String[] a = {"apple","banana", "cherry", "orange", "kiwi", "pear", "grape", "pineapple", "mango", "strawberry"};
        
        for(int i = 0; i < a.length; i++){
            tree.addNode(a[i]);
        }
        
        return tree;
    }
    public static BinaryTree balancedBinaryTreeV2() {
        BinaryTree tree = new BinaryTree();

        // Elements: "apple","banana", "cherry", "orange", "kiwi", "pear", "grape", "pineapple", "mango", "strawberry"
        tree.root = tree.balancedBinaryTreeHelper(new String[]{"apple", "banana", "cherry", "orange", "kiwi", "pear", "grape", "pineapple", "mango", "strawberry"}, 0, 9);

        return tree;
    }


}

                                    