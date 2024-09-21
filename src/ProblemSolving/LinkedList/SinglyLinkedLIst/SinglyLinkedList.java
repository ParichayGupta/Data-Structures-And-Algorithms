package ProblemSolving.LinkedList.SinglyLinkedList;

import java.util.List;

public class SinglyLinkedList<T> {
    ListNode<T> head;
    int size = 0;
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
        size++;
        return head;
    }

    public void printList(ListNode<T> head){
        ListNode<T> current = head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void remove(ListNode<T> head, T nodeValue){
        ListNode<T> current = head;
        ListNode<T> prev = null;
        while(current != null){
            if(current.value == nodeValue){
                if(prev == null){
                    this.head = current.next;
                }else{
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }

    }

    public int size(){
        return this.size;
    }
}
