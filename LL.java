package manu;

public class LL  {
    public  class Node{
          int  nums;
        private  Node next;
        public  Node (int data){
            this.nums=data;
        }
    }
    Node head,tail;
    public  void insertionFirst(int data){
        Node node = new Node(data);
        if(head == null){
            tail=head=node;
            return;
        }
    node.next=head;
        head=node;

    }
    public  int llDisplay(){
        int count =0;
        Node temp=head;
        while (temp != null){
            System.out.print("-->"+temp.nums );
            count+=1;
            temp=temp.next;
        }
        System.out.print("-->"+"null");
        return  count;
    }
    public  void addLast(int  data){
        Node node = new Node(data);
        if(head== null){
            head=tail=node;
            return;
        }
        tail.next=node;
        tail=node;
        return;
    }
    public  int  getMiddle(){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return  slow.nums;
    }
    public  void  addMiddle(int data){
        Node node  = new Node(data);
        Node slow=head;
        Node slowNext=head.next;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow=slowNext;
            slowNext=slowNext.next;

            fast=fast.next.next;
        }
        slow.next=node;
        node.next=slowNext;
        return;
    }
    public  void deleteFirst(){
        if(head == null){
            System.out.println("ll is empty ");
            return;
        }
        head=head.next;
        return;
    }
    public  int  deleteLast(){
        if(head == null){
            System.out.println("ll is empty ");
            return 0;
        }
        Node temp=head.next;
        Node pev=head;
        while(temp.next != null){
            pev=temp;
            temp=temp.next;
        }
        tail=pev;
        pev.next=null;
        return pev.nums;
    }

}
