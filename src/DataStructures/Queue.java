package DataStructures;

import java.util.NoSuchElementException;

/**
 * Custom implementation of the humble Queue.
 *
 * FIFO (first-in first-out)
 */
public class Queue {

    /**
     * Constructs a Node with passed param T as it's data.
     * @param <T>
     */
    private static class Node<T>{
        private T data;
        private Node<T> next;
        private Node<T> head; // remove from the head
        private Node<T> tail; // add things here


        public Node(T data){
            this.data = data;
        }

        public void add(T item){
            Node<T> node = new Node<>(item);
            if(tail != null){
                tail.next = node;
            }

            tail = node;

            if(head == null){
                head = node;
            }
        }

        public T remove(){
            T data = head.data;
            head = head.next;
            if(head == null){
                tail = null;
            }
            return data;
        }



        public T peek(){
            if(head == null) throw new NoSuchElementException();
            return head.data;
        }

        public boolean isEmpty(){
            return head == null;
        }


    }




}
