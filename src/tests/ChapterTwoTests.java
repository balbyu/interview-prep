package tests;

import DataStructures.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * All unit tests for Chapter Two - Linked Lists
 */
public class ChapterTwoTests {

    LinkedList list = new LinkedList();

    @Before
    public void setUp() throws Exception {
        list.append(1);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(1);
        list.append(6);
    }

    @Test
    public void testExampleOne(){

        System.out.println("Before: ");
        list.print();
        list.removeDuplicates(list.head);
        System.out.println();
        System.out.println("After: ");
        list.print();
    }

    @Test
    public void testExampleTwo(){
        //System.out.println(list.findKthToLastElement(0));
        list.printKthToLast(list.head, 1);
    }

    @Test
    public void testExampleThree(){
        System.out.println("Before: ");
        list.print();
        System.out.println();

        list.deleteMiddleNode(list.head.next.next.next); //3
        System.out.println("After: ");
        list.print();
    }

    @Test
    public void testExampleFour(){

        System.out.println("First: ");
        LinkedList first = new LinkedList();
        first.append(1);
        first.append(2);
        first.append(3);
        first.print();
        System.out.println();
        System.out.println("Second: ");
        LinkedList second = new LinkedList();
        second.append(4);
        second.append(5);
        second.append(6);
        second.append(7);
        second.print();
        System.out.println();
        System.out.println("Added: ");
        LinkedList.addLinkedLists(first, second).print();
    }

    @Test
    public void testExampleSix(){
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(1);

        assertTrue(LinkedList.isLinkedListAPalindrone(list));
    }

}
