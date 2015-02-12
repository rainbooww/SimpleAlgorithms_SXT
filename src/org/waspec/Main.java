package org.waspec;

public class Main {
    public static void main(String[] args) {
        Node  node= new Node(10);
        node.next= new Node(20);
        node.next.next= new Node (30);
        node.next.next.next= new Node (40);

        Node current=node;
        do{
            System.out.println(current.payload);
            current = current.next;
        } while (current!=null);
    }
}

class Node{
    public Node(int payload){
        this.payload=payload;
    }
    public int payload;
    public Node next;//指向下一个， 单向链表 （面试永远考单向，不会考双向
    public Node pre; //双向链表
}