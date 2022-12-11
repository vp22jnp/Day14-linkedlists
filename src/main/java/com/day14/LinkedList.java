package com.day14;


//ability to create linkedlist by adding 30 and 56 to 70;
public class LinkedList<T> {
    class Node {
       int data;
        Node next;
        public Node(int data){
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

    public void add(int data) {
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
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList();
        list1.push(70);
        list1.push(30);
        list1.push(56);
        list1.show();
        System.out.println("adding 30 and 56 to 70");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(56);
        list2.add(30);
        list2.add(70);
        list2.show();
    }
}


