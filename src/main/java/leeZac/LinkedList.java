package leeZac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*** Created by zaclee on 10/20/16. ***/

public class LinkedList {

    public Node head;
    public int listCount=0;

    LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        listCount++;
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void remove(int index) {

        if(index == 0) {
            head = head.next;
            listCount--;
        }
        else if(index == listCount-1){
            Node current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            listCount--;
        }
        else {
            Node current = head;
            for(int i =0; i<index-1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            listCount--;
        }
    }

    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while(current != null) {
            if(current.data == data) {
                return true;
            }
            current= current.next;
        }
        return false;
    }

    public int find(int data) {
        Node current = head;
        int index = 0;
        while(current != null) {
            if(current.data == data) {
                return index;
            }
            else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public int size() {
        Node current = head;
        int counter = 0;
        while(current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public int get(int index) {
        Node current = head;
        for(int i=0; i<index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public LinkedList copy() {
        LinkedList temp = new LinkedList();
        temp.listCount = this.listCount;
        for(int i = this.size()-1; i>=0; i--) {
            temp.add(this.get(i));
        }
        return temp;
    }

    public void sort() {



        
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


}
