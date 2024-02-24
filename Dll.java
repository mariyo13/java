package manu;

public class Dll {
    //creating node using class
    public class Node{
       private int data;
        Node lNode,rNode;

        public  Node(int data){
            this.data=data;

        }
    }
    Node head;
    int lenD;
    //methods that check weather  dll is empty are not
    public boolean isDllEmpty(){
        return head == null;
    }
    //adding elments to first of the dll
    public  void addFirst(int data){
        Node node = new Node(data);
        if(isDllEmpty()){
            head=node;
            lenD+=1;

            return;
        }
        head.lNode=node;
        node.rNode=head;
        node.lNode=null;
        head=node;
        lenD+=1;
        return;
    }
    //displaying dll elments
    public  int dllDisplay(){
        int count=0;
        Node temp =head;
        while (temp != null){
            System.out.print("-->"+temp.data);
            temp=temp.rNode;
            count+=1;
        }
        System.out.print("-->"+"null");

        return count;
    }
    //adding elments to last of the dll

    public  void  addLast(int data){
        Node node =new Node(data);
        if(head == null){
            head=node;
            lenD+=1;
            return;
        }

        Node temp= head;
        while (temp.rNode != null){
            temp=temp.rNode;

        }
        temp.rNode=node;
        node.lNode=temp;
        node.rNode=null;
        lenD+=1;
        return;
    }
    //adding elments to middle of the dll
    public  void insertMiddle( int data){
        Node node= new Node(data);
        if(head == null){
            System.out.println("we can't insert the in middle");
            return;
        }
        if (lenD == 1){
            System.out.println("we can't insert the in middle");
            return;
        }
        Node temp=head;
        Node prev=head.rNode;
        if (lenD == 2){
            temp.rNode=node;
            node.lNode=temp;
            node.rNode=prev;
            prev.lNode=node;
            return;
        }
        Node fast=head;
        Node slow =head;
        Node  prev1=head.rNode;
        while (fast != null && fast.rNode != null){
            slow=prev1;
            prev1=prev1.rNode;
            fast=fast.rNode.rNode;
        }
        slow.rNode=node;
        node.lNode=slow;
        node.rNode=prev1;
        prev1.lNode=node;
        return;

    }
    // deleting elements from  first of dll
    public  void deleteFirst(){
        if(isDllEmpty()){
            return;
        }
        head=head.rNode;
        head.lNode =null;
        return;
    }
    // deleting elements from  last of dll
    public void deleteLast(){
        Node last=head.rNode;
        Node lastPrev=head;
        while (last.rNode != null){
            lastPrev=last;
            last=last.rNode;
        }
        lastPrev.rNode=null;
        last.lNode=null;
        return;
    }



}
