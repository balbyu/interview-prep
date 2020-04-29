package DataStructures;

import java.util.EmptyStackException;

/**
 * Custom implementation of the humble Stack.
 *
 * LIFO (last-in first-out)
 */
public class Stack {

    /**
     * Constructs a StackNode with passed param T as it's data.
     * @param <T>
     */
    private static class StackNode<T> {
        private T data;
        private StackNode<T> top;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }

        /**
         * Removes the top item from the stack.
         * @return updated stack
         */
        public T pop(){
            if(top == null) throw new EmptyStackException();
            T item = top.data;
            top = top.next;
            return item;
        }

        /**
         * Adds an item to the top of the stack.
         * @param item - The Item to add to the top of the stack
         */
        public void push(T item){
            StackNode<T> t = new StackNode<>(item);
            t.next = top;
            top = t;
        }

        /**
         * Returns the top of the stack.
         * @return Top of stack T
         */
        public T peek(){
            if(top == null) throw new EmptyStackException();
            return top.data;
        }

        /**
         * Returns true if and only if the stack is empty.
         * @return true if stack is empty, false if stack is not empty
         */
        public boolean isEmpty(){
            return top == null;
        }


    }





}
