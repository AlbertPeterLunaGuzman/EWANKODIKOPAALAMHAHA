/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodetest;

/**
 *
 * @author STAR
 */
public class NodeTest {

    /**
     * @param args the command line arguments
     */

	public static void main(String[] args){
            //Step 1: Create a binary tree (NOT a BST) using the following data: 55, 23, 11, 75, 50, 15, 25, 60, 63, 69. 
                BinaryTree tree = balancedBinaryTree();
                
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
                tree.delete(50);
                tree.delete(60);
                tree.delete(75);

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
                tree.addNode(5);
                tree.addNode(10);
                tree.addNode(20);
                
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
                int value = 63;
                System.out.println(value + " Found at level " + tree.nodeSearcher(value));
        
            //Step 18: Print the sum of the nodes in the binary tree.
                System.out.println("Sum of Nodes: " + tree.getNodeSum());
        }

    public static BinaryTree balancedBinaryTree(){
                    BinaryTree tree = new BinaryTree();
                
                    tree.root = new Node(55); 
                    
                    tree.root.left = new Node(23);
                    tree.root.right = new Node(75);
                    
                    tree.root.left.left = new Node(11);
                    tree.root.left.right = new Node(60);
                    tree.root.left.left.right = new Node(15);
                    tree.root.left.right.right = new Node(25);
                    
                    tree.root.right.left = new Node(50);
                    tree.root.right.right = new Node(69);
                    
                    tree.root.right.right.left = new Node(63);
        return tree;
    } 
        
        
//    public static BinaryTree fullBinaryTree(){
//    //            55
//    //          /    \
//    //        23     11
//    //       / \    /  \
//    //      75  50  15  25
//    //     /   /
//    //    60   63
//    //   /  
//    //  69
//
//        BinaryTree tree = new BinaryTree();
//            tree.root = new Node(55);
//            
//            tree.root.left = new Node(23);
//            tree.root.right = new Node(75);
//            
//            //Left Nodes
//            tree.root.left.left = new Node( 11);
//            tree.root.left.left.left = new Node(15);
//            tree.root.left.left.right = new Node(25);
//            
//            tree.root.left.right = new Node(50);
//            tree.root.left.right.left = new Node(63);
//            tree.root.left.right.right = new Node(69);
//            
//            //Right Nodes
//            tree.root.right.left = new Node(60);
//            
//        return tree;
//    } 
//        
    
    public static void TESTINGINMOMUNADITOWAGKAMAKULET(){
                //binaryTreeProgram();
            //completeBinaryTreeProgram();
            
            //Step 1: Gawa ka muna ng binary tree.
                BinaryTree tree = new BinaryTree();
            
                int[] a = {55, 23, 11, 75, 50, 15, 25, 60, 63, 69};
                
            //TESTINGIN MO MUNATO
                int[] A = {4, 2, 6, 1, 3, 5, 7};
            
                for(int i = 0; i < a.length; i++){
                    tree.addNode(a[i]);
                }

//TESTINGIN MO MUNA KUNG TAMA YUNG IMPLEMENTATION MO   
//             4
//            / \
//           /   \
//          2     6
//         / \   / \
//        1   3 5   7
//In Order:    1 2 3 4 5 6 7
//Pre Order:   4 2 1 3 6 5 7 
//Post Order:  1 3 2 5 7 6 4
//Level Order: 4 2 6 1 3 5 7

//ETO YUNG ORIGINAL
//                      55
//                     /  \
//                    /    \
//                   /      \
//                  /        \
//                 /          \
//                /            \
//               23            75
//              /  \          /
//             /    \        /
//            /      \      /  
//           11      50    60
//             \    /       \
//             15  25       63
//                            \
//                            69
//In Order:       11 15 23 25 50 55 60 63 69 75
//Pre Order:      55 23 11 15 50 25 75 60 63 69
//Post Order:     15 11 25 50 23 69 63 60 75 55
//In Level Order: 55 23 75 11 50 60 15 25 63 69 
                

//REMOVE NG ELEMENTS: 50, 60, 75
//                      55
//                     /  \
//                    /    \
//                   /      \
//                  /        \
//                 /          \
//                /            \
//               23            63
//              /  \             \
//             /    \             \
//            /      \             \
//           11      25            69
//             \            
//             15          
//                            
//                            
//In Order:       11 15 23 25 55 63 69
//Pre Order:      55 23 11 15 25 63 69
//Post Order:     15 11 25 23 69 63 55
//In Level Order: 55 23 63 11 25 69 15 


//ADD NG ELEMENTS: 5, 10, 20
//                      55
//                     /  \
//                    /    \
//                   /      \
//                  /        \
//                 /          \
//                /            \
//               23            63
//              /  \             \
//             /    \             \
//            /      \             \
//           11      25            69
//          /  \            
//         /    \
//        /      \
//        5      15
//         \       \
//          \       \
//           \       \
//           10      20
//                            
//                            
//In Order:        5 10 11 15 20 23 25 55 63 69
//Pre Order:       55 23 11 5 10 15 20 25 63 69
//Post Order:      10 5 20 15 11 25 23 69 63 55
//In Level Order:  55 23 63 11 25 69 5 15 10 20 

            //Step 2: Print mo yung number of nodes.
                System.out.println("Number of Nodes: " + tree.countNodes());
                
            //Step 3: Print mo In-Order sequence.
                System.out.print("This is the in Order sequence:   ");
                    tree.printInOrder();

            //Step 4: Print mo naman sa Pre-Order sequence.
                System.out.print("\nThis is the Pre Order sequence:  ");
                    tree.printPreOrder();

            //Step 5: Tas print mo naman sa Post-Order sequence.
                System.out.print("\nThis is the Post Order sequence: ");
                    tree.printPostOrder();

            //Step 6: Print mo naman sa In Level Order sequence.
                System.out.print("\nThis is the In Level Order sequence: ");
                    tree.printLevelOrder();
                
            //Step 7: Print mo yung height.
                System.out.println("\nHeight of the tree: " + tree.getHeight());
        
            //Step 8: print mo depth
                System.out.println("Depth of the tree: " + tree.getDepth());
                
            //Step 9: Check mo kung puno.
                System.out.println("Is binary tree full: " + tree.isBinaryTreeFull());
        
            //Step 10: Check mo kung balanced.
                System.out.println("Is binary tree balanced: " + tree.isBalanced());
            
            //Step 11: Check mo if perfect.
                System.out.println("Is binary tree perfect: " + tree.isPerfect());
                
            //Step 12: Check mo if kumpleto.
                System.out.println("Is binary tree complete: " + tree.isComplete() );
            
            //Step 13: remove mo 3 data.
                tree.delete(50);
                tree.delete(60);
                tree.delete(75);

            //Step 14: uilitin mo lang 2 to 12.
                System.out.println("Number of Nodes: " + tree.countNodes());
                
                System.out.print("This is the in Order sequence:   ");
                    tree.printInOrder();

                System.out.print("\nThis is the Pre Order sequence:  ");
                    tree.printPreOrder();

                System.out.print("\nThis is the Post Order sequence: ");
                    tree.printPostOrder();

                System.out.print("\nThis is the In Level Order sequence: ");
                    tree.printLevelOrder();
                
                System.out.println("\nHeight of the tree: " + tree.getHeight());
        
                System.out.println("Depth of the tree: " + tree.getDepth());
                
                System.out.println("Is binary tree full: " + tree.isBinaryTreeFull());
        
                System.out.println("Is binary tree balanced: " + tree.isBalanced());
            
                System.out.println("Is binary tree perfect: " + tree.isPerfect());
                
                System.out.println("Is binary tree complete: " + tree.isComplete() );
            
            //Steo 15: Dag-dag ka ng elements
                tree.addNode(5);
                tree.addNode(10);
                tree.addNode(20);
                
            //Step 16: Ulitin molang ulit
                System.out.println("Number of Nodes: " + tree.countNodes());
                
                System.out.print("This is the in Order sequence:   ");
                    tree.printInOrder();

                System.out.print("\nThis is the Pre Order sequence:  ");
                    tree.printPreOrder();

                System.out.print("\nThis is the Post Order sequence: ");
                    tree.printPostOrder();

                System.out.print("\nThis is the In Level Order sequence: ");
                    tree.printLevelOrder();
                
                System.out.println("\nHeight of the tree: " + tree.getHeight());
        
                System.out.println("Depth of the tree: " + tree.getDepth());
                
                System.out.println("Is binary tree full: " + tree.isBinaryTreeFull());
        
                System.out.println("Is binary tree balanced: " + tree.isBalanced());
            
                System.out.println("Is binary tree perfect: " + tree.isPerfect());
                
                System.out.println("Is binary tree complete: " + tree.isComplete() );
            
            //Step 17: Hanapin mo kung anong level yung element 
                int value = 63;
                System.out.println(value + " Found at level " + tree.nodeSearcher(value));
        
            //Step 18: Sum ng lahat ng nodes
                System.out.println("Sum of Nodes: " + tree.getNodeSum());
    }

    
}
