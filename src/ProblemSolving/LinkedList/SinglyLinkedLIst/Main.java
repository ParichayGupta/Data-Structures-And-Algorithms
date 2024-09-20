package ProblemSolving.LinkedList.SinglyLinkedLIst;

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
        list.add(list.head, 9);

        list.printList(list.head);
    }
}
