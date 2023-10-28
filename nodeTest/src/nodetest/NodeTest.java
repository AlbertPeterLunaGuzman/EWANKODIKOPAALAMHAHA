/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodetest;

/**
 *
 * @author guzmanal
 */
public class NodeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree();
        // "apple", "banana", "cherry", "orange", "kiwi", "pear", "grape", "pineapple", "mango", "strawberry"
        
        String[] fruits = {"apple", "banana", "cherry", "orange", "kiwi", "pear", "grape", "pineapple", "mango", "strawberry"};
        
        for(int i = 0; i < fruits.length; i++){
            tree.addNode(fruits[i]);
        }
        System.out.print("In Order:   ");
            tree.inorder();
        System.out.print("\nPre Order:  ");
            tree.preOrder();
        System.out.print("\nPost Order: ");
            tree.postOrder();
        System.out.print("\nIn Order:   ");
            tree.inorder();
    }
    
}
