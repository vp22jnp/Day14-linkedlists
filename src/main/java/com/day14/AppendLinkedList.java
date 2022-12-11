package com.day14;

public class AppendLinkedList<T> {
    class Node {
       int  data;
        Node next;
        public Node( int data){
            this.data = data;
        }
    }
    Node head;
    Node tail;
    public void push(int data) {
        Node newNode = new Node( data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void add( int data) {
        Node newNode = new Node(data);
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
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    public void append( int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public static void main(String[] args) {
        AppendLinkedList<Integer> list = new AppendLinkedList();
        //UC3 - Create Linkedlist by appending 30 and 70 to 56
        System.out.println("By using append() Linked list is: ");
        LinkedList<Integer>list3 = new LinkedList<>();
        list.append(56);
        list.append(30);
        list.append(70);
        list.show();
    }
}

