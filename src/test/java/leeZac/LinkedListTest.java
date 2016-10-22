package leeZac;

import leeZac.LinkedList;
import org.junit.Assert;
import org.junit.Test;

/*** Created by zaclee on 10/20/16. ***/

public class LinkedListTest {


    @Test
    public void addTest() {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(2);
        list.add(1);
        list.printList();
        Assert.assertEquals("head data should be 1", 1, list.head.data);
        Assert.assertEquals("2nd node should be 2", 2, list.head.next.data);
        Assert.assertEquals("3rd node should be 3", 3, list.head.next.next.data);
    }

    @Test
    public void removeTest() {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(2);
        list.add(1);
        list.remove(1);
        list.printList();
        Assert.assertEquals("2nd node should now be 3", 3, list.head.next.data);
    }

    @Test
    public void removeTest2() {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(2);
        list.add(1);
        list.remove(0);
        list.printList();
        Assert.assertEquals("2nd node should now be 3", 3, list.head.next.data);
    }

    @Test
    public void removeTest3() {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(2);
        list.add(1);
        list.remove(2);
        list.printList();
        System.out.println("size = " + list.listCount);
        Assert.assertEquals("last node should be 2", 2, list.head.next.data);
    }

    @Test
    public void containsTest() {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(2);
        list.add(1);
        list.printList();
        System.out.println("size = " + list.listCount);
        Assert.assertTrue(list.contains(2));
    }

    @Test
    public void containsTest2() {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(2);
        list.add(1);
        list.printList();
        System.out.println("size = " + list.listCount);
        Assert.assertFalse(list.contains(0));
    }

    @Test
    public void findTest1() {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(2);
        list.add(1);
        int expectedIndex = 2;
        list.printList();
        System.out.println("size = " + list.listCount);
        Assert.assertEquals("find node data value of 3", expectedIndex, list.find(3));
    }

    @Test
    public void findTest2() {
        LinkedList list = new LinkedList();
        list.add(4); list.add(3); list.add(2); list.add(1);
        int expectedIndex = 3;
        list.printList();
        System.out.println("size = " + list.listCount);
        Assert.assertEquals("find node data value of 3", expectedIndex, list.find(4));
    }

    @Test
    public void sizeTest1() {
        LinkedList list = new LinkedList();
        list.add(4); list.add(3); list.add(2); list.add(1);
        list.printList();
        System.out.println("size = " + list.listCount);
        Assert.assertEquals("size should be 4", 4, list.size());
    }

    @Test
    public void sizeTest2() {
        LinkedList list = new LinkedList();
        list.printList();
        System.out.println("size = " + list.listCount);
        Assert.assertEquals("size should be 0", 0, list.size());
    }

    @Test
    public void getTest() {
        LinkedList list = new LinkedList();
        list.add(4); list.add(3); list.add(2); list.add(1);
        list.printList();
        System.out.println("size = " + list.listCount);
        Assert.assertEquals("return the head.data",1 , list.get(0));
    }

    @Test
    public void copyTest1() {
        LinkedList list = new LinkedList();
        list.add(4); list.add(3); list.add(2); list.add(1);
        LinkedList list2 = list.copy();
        System.out.println("list 1:");
        list.printList();
        System.out.println("list 2: ");
        list2.printList();
        Assert.assertEquals("return the head.data",4 , list.get(3));
    }

    @Test
    public void sortTest1() {
        LinkedList list = new LinkedList();
        list.add(1); list.add(3); list.add(2); list.add(4);
        System.out.println("list 1:");
        list.printList();
        list.sort();
        list.printList();
        Assert.assertEquals("return the head.data",4 , list.get(3));
    }

}
