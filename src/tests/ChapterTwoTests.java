package tests;

import examples.Ch02_LinkedLists.LinkedList;
import org.junit.Before;
import org.junit.Test;

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

}
