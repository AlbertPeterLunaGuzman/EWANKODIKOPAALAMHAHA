/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodetest;
import java.util.*;
/**
 *
 * @author guzmanal
 */
public class Node {
    String data;

	Node left, right;
	public Node(String item) {
		data = item;
		left = right = null;
	}
}

// A Java program to introduce Binary Tree
class BinaryTree {
	
    // Root of Binary Tree
	Node root;
	
    // Constructors
	BinaryTree(String key) { 
            root = new Node(key); 
        }
        
	BinaryTree() { 
            root = null; 
        }
        
    // Check for Full Binary Tree
        
        public boolean isBinaryTreeFull(){
            return isFullBinaryTreeChecker(root);
        }
        
        private boolean isFullBinaryTreeChecker(Node node) {

    // Checking tree emptiness
        if (node == null)
          return true;

    // Checking the ren
        if (node.left == null && node.right == null)
          return true;

        if ((node.left != null) && (node.right != null))
          return (isFullBinaryTreeChecker(node.left) && isFullBinaryTreeChecker(node.right));

        return false;
        }
    
    // Count the number of nodes
        public int countNodes(){
            return countNumNodes(root);
        }
        
        private int countNumNodes(Node root) {
            if (root == null)
                return (0);
            return (1 + countNumNodes(root.left) + countNumNodes(root.right));
        }

    // Check for complete binary tree
        
        public boolean isComplete() {
            int nodeCount = countNodes();
            return completeChecker(root, 0, nodeCount);
        }
        
        private boolean completeChecker(Node root, int index, int numberNodes) {

        // Check if the tree is empty
            if (root == null)
                return true;

            if (index >= numberNodes)
                return false;

            return (completeChecker(root.left, 2 * index + 1, numberNodes)
                && completeChecker(root.right, 2 * index + 2, numberNodes));
        }

        
//CRUD OPERATIONS
        
    // Add a node to the tree
        void addNode(String value) {
            Node newNode = new Node(value);
            if (this.root == null) {
                this.root = newNode;
            } else {
                Node currentNode = this.root;
                while (true) {
                    if (value.compareToIgnoreCase(currentNode.data) < 0) {
                        if (currentNode.left == null) {
                            currentNode.left = newNode;
                            break;
                        } else {
                            currentNode = currentNode.left;
                        }
                    } else {
                        if (currentNode.right == null) {
                            currentNode.right = newNode;
                            break;
                        } else {
                            currentNode = currentNode.right;
                        }
                    }
                }
            }
        }

        // Remove a node from the tree
        boolean removeNode(String value) {
            Node currentNode = this.root;
            Node parentNode = null;
            boolean isLeft = false;

            // Find the node to remove
            while (currentNode != null && currentNode.data != value) {
                parentNode = currentNode;
                if (value.compareToIgnoreCase(currentNode.data) < 0) {
                    currentNode = currentNode.left;
                    isLeft = true;
                } else {
                    currentNode = currentNode.right;
                    isLeft = false;
                }
            }

            // If the node is not found
            if (currentNode == null) {
                return false;
            }

            // Case 1: Node has no ren
            if (currentNode.left == null && currentNode.right == null) {
                if (currentNode == this.root) {
                    this.root = null;
                } else if (isLeft) {
                    parentNode.left = null;
                } else {
                    parentNode.right = null;
                }
            }
            // Case 2: Node has one 
            else if (currentNode.left == null) {
                if (currentNode == this.root) {
                    this.root = currentNode.right ;
                } else if (isLeft) {
                    parentNode.left = currentNode.right;
                } else {
                    parentNode.right = currentNode.right;
                }
            } else if (currentNode.right  == null) {
                if (currentNode == this.root) {
                    this.root = currentNode.left;
                } else if (isLeft) {
                    parentNode.left = currentNode.left;
                } else {
                    parentNode.right = currentNode.left;
                }
            }
            // Case 3: Node has two ren
            else {
                Node replacementNode = getReplacementNode(currentNode);
                if (currentNode == this.root) {
                    this.root = replacementNode;
                } else if (isLeft) {
                    parentNode.left = replacementNode;
                } else {
                    parentNode.right = replacementNode;
                }
                replacementNode.left = currentNode.left;
            }

            return true;
        }

        // Helper method to find the replacement node for a node with two ren
        private Node getReplacementNode(Node replacedNode) {
            Node replacementNode = replacedNode.right;
            Node parent = replacedNode;
            while (replacementNode.left != null) {
                parent = replacementNode;
                replacementNode = replacementNode.left;
            }
            if (replacementNode != replacedNode.right) {
                parent.left = replacementNode.right;
                replacementNode.right = replacedNode.right;
            }
            return replacementNode;
        }

        // Implement DFS algorithm using recursion
        void DFS(Node node) {
            if (node != null) {
                System.out.print(node.data + " ");
                DFS(node.left);
                DFS(node.right);
            }
        }

        // Implement BFS algorithm using a Queue
        void BFS(Node node) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            while (!queue.isEmpty()) {
                Node currentNode = queue.remove();
                System.out.print(currentNode.data + " ");
                    if (currentNode.left != null) {
                        queue.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.add(currentNode.right);
                    }
            }
        }

    // Function to delete a node with a given key from the binary tree
        public void delete(String data) {
            root = deleteNode(root, data);
        }

    // Recursive helper function to delete a node with a given key
        private Node deleteNode(Node root, String key) {
            if (root == null)
                return root;

            // Recursively search for the node to be deleted
            if (key.compareToIgnoreCase(root.data) < 0)
                root.left = deleteNode(root.left, key);
            else if (key.compareToIgnoreCase(root.data) > 0)
                root.right = deleteNode(root.right, key);
            else {
                // Node with only one  or no 
                    if (root.left == null)
                        return root.right;
                    else if (root.right == null)
                        return root.left;

                // Node with two ren: Get the inorder successor (smallest in the right subtree)
                    root.data = minimum(root.right);

                // Delete the inorder successor
                    root.right = deleteNode(root.right, root.data);
            }
            return root;
        }


    // Function to find the minimum value in a binary tree
    public String getMinimumValue(){
        return minimum(root);
    }
    private String minimum(Node root) {
        String minValue = root.data;
            while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    // Utility function to insert a node into the binary tree
        public void insert(String key) {
            root = insertNode(root, key);
        }

    // Recursive helper function to insert a node into the binary tree
        private Node insertNode(Node root, String key) {
            if (root == null) {
                root = new Node(key);
            return root;
            }

            if (key.compareToIgnoreCase(root.data) < 0)
                root.left = insertNode(root.left, key);
            else if (key.compareToIgnoreCase(root.data) > 0)
                root.right = insertNode(root.right, key);

            return root;
        }

    // Utility function to perform an inorder traversal of the binary tree
        public void inorder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root != null) {
            traverseInOrder(root.left);
            System.out.print(root.data + " ");
            traverseInOrder(root.right);
        }
    }

    public void preOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            traversePreOrder(root.left);
            traversePreOrder(root.right);
        }
    }

    public void postOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root != null) {
            traversePostOrder(root.left);
            traversePostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    //Testingin yung node searcher kung gumagana
    public int nodeSearcher(String searchData) {
        return searchLevel(root, searchData, 1);
    }

    private int searchLevel(Node node, String searchData, int level) {
        if (node == null) {
            return -1; 
        }

        if (node.data == searchData) {
            return level; 
        }

        int leftLevel = searchLevel(node.left, searchData, level + 1);
        if (leftLevel != -1) {
            return leftLevel; 
        }

        int rightLevel = searchLevel(node.right, searchData, level + 1);
        return rightLevel; 
    }
        // Print each level of the binary tree
    void printLevel(Node node, int level) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print(node.data + " ");
        } else if (level > 1) {
            printLevel(node.left, level - 1);
            printLevel(node.right, level - 1);
        }
    }
//    
//    //Testingin yung getSum
//    public int sum(Node root) {
//        if (root == null) {
//            return 0; // Return 0 for an empty tree
//        }
//        int mgaLeftNodes = sum(root.left);
//        int mgaRightNodes = sum(root.right);
//
//        return root.data + mgaLeftNodes + mgaRightNodes;
//    }
//
//    // Update the getNodeSum method to call the modified sum method
//    public int getNodeSum() {
//        return sum(root);
//    }


    public int getHeight(){
        return height(root);
    }
        
    // Get the height of the binary tree
    private int height(Node node) {
            if (node == null) {
                return 0;
            } else {
                int leftSubtreeHeight = height(node.left);
                int rightSubtreeHeight = height(node.right);
                return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
            }
        }

    //Testingin mo if gunagamana yung getDepth
        public int getDepth(){
            return depth(root);
        }

        private int depth(Node root){
            if(root == null)
                return 0;
            else{
                int lDepth = depth(root.left);
                int rDepth = depth(root.right);

                if(lDepth > rDepth)
                    return(lDepth + 1);
                else
                    return(rDepth + 1);
            }
        }

    // Perform Level Order Traversal using Recursion
    public void levelOrderTraversal() {
        int height = height(this.root);
        for (int i = 1; i <= height; i++) {
            printLevel(this.root, i);
        }
    }

    //Test mo if gunagamana yung balance checker
    
        public boolean isBalanced(){
            return balanceChecker(root);
        }
    
        private boolean balanceChecker(Node node){
           int lh; 

           int rh;

           if (node == null)
               return true;

           lh = height(node.left);
           rh = height(node.right);

           if (Math.abs(lh - rh) <= 1 && balanceChecker(node.left)
               && balanceChecker(node.right))
               return true;

           return false;
        }
        
//CHECK MO KUNG GUMAGANA YUNG PERfect checkker
        
        public boolean isPerfect(){
            return isPerfectTree(root);
        }
        
        public boolean isPerfectTree(Node node) {
            int treeDepth = depth(node);
                return isPerfectTree(node, 1, treeDepth);
        }

        private boolean isPerfectTree(Node node, int depth, int treeDepth) {
            if (depth == treeDepth && (node.left== null && node.right == null)) {
                return true;
            }
                if ((node.left != null && node.right != null)) {
                    return isPerfectTree(node.left, 1 + depth, treeDepth) &&
                            isPerfectTree(node.right, 1 + depth, treeDepth);
                }
            return false;
        }
}
