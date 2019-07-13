package examples.Ch02_LinkedLists;

import java.util.Collection;
import java.util.Iterator;

/**
 * This class represents a custom Linked List data structure
 */

public class LinkedList {

    public LinkedListNode head;

    /**
     * Empty Constructor
     */
    public LinkedList() {

    }

    /**
     * Appends the LinkedList with a new LinkedListNode containing param
     * data.
     *
     * @param data - The data to append
     */
    public void append(int data){
        if(head == null){
            head = new LinkedListNode(data);
            return;
        }

        LinkedListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new LinkedListNode(data);
    }

    /**
     * Appends a Collection of Integers to the LinkedList.
     * @param collection - Collection of Integers
     */
    public void appendAll(Collection<Integer> collection){

        Iterator<Integer> iterator = collection.iterator();

        while (iterator.hasNext()) {
            append(iterator.next());
        }
    }

    /**
     * Prepends the LinkedList with a new LinkedListNode containing param
     * data.
     *
     * @param data - The data to prepend
     */
    public void prepend(int data){
        LinkedListNode newHead = new LinkedListNode(data);
        newHead.next = head;
        head = newHead;
    }

    /**
     * Deletes the first LinkedListNode with the matching data.
     *
     * @param data - The data to find in LinkedList
     */
    public void deleteNode(int data){
        if(head == null) return;
        if(head.data == data){
            head = head.next;
            return;
        }

        LinkedListNode current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    /**
     * Removes all duplicate values of param data.
     *
     * @param head - The node to of which to remove duplicates
     */
    public void removeDuplicates(LinkedListNode head){
        LinkedListNode current = head;
        while (current != null) {
            /* Remove all future nodes that have the same value */
            LinkedListNode runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    /**
     * This method finds and returns the kth to last element in the Linked List.
     * @param kth - Number from end of Singly Linked List
     * @return LinkedListNode at kth Element
     */
    public int findKthToLastElement(int kth){

        int length = this.length();
        int counter = 1;
        if(length == 0)return -1;

        LinkedListNode current = head;

        //Check to see how far along the list we are.
        while(current.next != null){
            if(length - (counter + 1) == kth)return current.next.data;
            current = current.next;
            counter++;
        }
        return -1;
    }

    /**
     * Recursively prints the kth to last data of a LinkedListNode in a
     * Linked List.
     * @param head - LinkedListNode head
     * @param k - kth value to find
     * @return index of kth value
     */
    public int printKthToLast(LinkedListNode head, int k){
        if(head == null) return 0;

        int index = printKthToLast(head.next, k) + 1;
        if(index == k){
            System.out.println(k + "th to the last node is " + head.data);
        }
        return index;
    }

    /**
     * Prints the LinkedList data in a horizontal array.
     */
    public void print(){

        LinkedListNode current = head;
        System.out.print("[");
        System.out.print(current.data + ", ");
        while(current.next != null){
            System.out.print(current.next.data);
            if(current.next.next != null){
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.print("]" + "\n");
    }

    /**
     * Returns the length of the LinkedList.
     * @return length of LinkedList
     */
    public int length(){
        int counter = 0;
        LinkedListNode current = head;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return  counter;
    }
}