package ProblemSolving.LinkedList.SinglyLinkedList;

public class ListNode<T> {

    ListNode<T> next;
    T value;

    public ListNode(T value){
        this.value = value;
        this.next = null;
    }

    public void setNext(ListNode<T> next){
        this.next = next;
    }

    public ListNode<T> getNext(){
        return this.next;
    }

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}
