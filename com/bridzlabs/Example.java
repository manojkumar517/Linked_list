package com.bridzlabs;

public class Example {
    public static void main(String[] args) {

        Linked_list_implimentation obj = new Linked_list_implimentation();
        obj.insertFirst(45);
        obj.insertFirst(86);
        obj.insertFirst(100);
        obj.insertLast(11);
        obj.insertAtIndex(66, 1);
        obj.insertFirst(99);

        obj.display();
        System.out.println("Removed first element "+obj.deleteFirst());
        obj.display();
        System.out.println("Removed Last element "+obj.deleteLast());
        obj.display();
        System.out.println("Deleted At index number "+obj.deleteAtIndex(2));
        obj.display();
    }
}
