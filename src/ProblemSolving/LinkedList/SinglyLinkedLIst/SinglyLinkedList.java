package ProblemSolving.LinkedList.SinglyLinkedLIst;

import java.util.List;

public class SinglyLinkedList<T> {
    ListNode<T> head;
    // Method to add element at the end of the linked list
    public ListNode<T> add(ListNode<T> head, T nodeValue) {
        ListNode<T> newNode = new ListNode<>(nodeValue);
        // When there is no head
        if(head == null){
            this.head = newNode;
        }else{
            // iterating to the end of the linked list and appending new element at the end
            ListNode<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public void printList(ListNode<T> head){
        ListNode<T> current = head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}
