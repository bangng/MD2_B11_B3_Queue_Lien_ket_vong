class Solution {
    static class Node{
        int data;
        Node link;
    }
  static class Queue{
        Node front, rear;
    }
    static void enQueue(Queue a, int value){
        Node temp = new Node();
        temp.data = value;
        if (a.front == null){
            a.front =temp;
        }else {
            a.rear.link = temp;
        }
        a.rear = temp;
        a.rear.link = a.front;
    }

    static  int deQueue(Queue a){
        if (a.front == null){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (a.front == a.rear){
            value = a.front.data;
            a.front = null;
            a.rear = null;
        }
        else {
            Node temp = a.front;
            value = temp.data;
            a.front = a.front.link;
            a.rear.link = a.front;
        }
        return value;
    }
    static void  displayQueue(Queue a){
        Node temp = a.front;
        System.out.println("Element in Circular Queue are: ");
        while (temp.link !=a.front){
            System.out.printf("%d", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
