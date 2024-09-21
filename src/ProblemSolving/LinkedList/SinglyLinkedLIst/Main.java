package ProblemSolving.LinkedList.SinglyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(list.head, 1);
        list.add(list.head, 2);
        list.add(list.head, 3);
        list.add(list.head, 4);
        list.add(list.head, 5);
        list.add(list.head, 6);
        list.add(list.head, 7);
        list.add(list.head, 8);

        list.printList(list.head);
        System.out.println("Size of the list: " + list.size());

        list.remove(list.head, 1);
        list.remove(list.head, 2);
        list.remove(list.head, 3);
        list.remove(list.head, 4);
        list.remove(list.head, 5);
        list.remove(list.head, 6);
        list.remove(list.head, 7);
        list.remove(list.head, 9);

        System.out.println("Size of the list: " + list.size());
        list.printList(list.head);
    }
}
