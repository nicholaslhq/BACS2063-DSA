/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

/**
 *
 * @author ccs
 */
public class MonsterCount<T> {
    Node head; // head of list 
  
    /* Linked list Node*/
    class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Inserts a new Node at front of the list. */
    public void aa(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
  
        /* 3. Make next of new Node as head */
        new_node.next = head; 
  
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
  
    /* Counts the no. of occurrences of a node 
    (search_for) in a linked list (head)*/
    int count(int search_for) 
    { 
        Node current = head; 
        int count = 0; 
        while (current != null) { 
            if (current.data == search_for) 
                count++; 
            current = current.next; 
        } 
        return count; 
    } 
}
