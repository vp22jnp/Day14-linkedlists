package com.day14;

public class CreateSimpleLinkedList <T>{
    class Node <T>{
        T data;
        Node<T> next;
        public Node(T data){
            this.data = data;
        }
    }
    Node<T> head;
    Node<T> tail;
    public void push(T data) {
        Node<T> newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void show(){
        if(head == null){
            System.out.println("Linked list is Empty");
        }
        else{
            Node<T> temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        CreateSimpleLinkedList<Integer> list1 = new CreateSimpleLinkedList();
        list1.push(70);
        list1.push(30);
        list1.push(56);
        list1.show();

    }
}