import java.util.*;
class Node
{
    int data;
    Node next;
    
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class Linkedlist
{
    Node head;
    public Linkedlist()
    {
        this.head=null;
    }
    
    public void append(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            this.head=newnode;
            return;
        }
        
        Node lastnode=this.head;
        while(lastnode.next!=null)
        {
            lastnode=lastnode.next;
        }
        lastnode.next=newnode;
    }
    
    public void insert_pos(int data,int pos)
    {
        Node newnode=new Node(data);
        Node current=this.head;
        int count=0;
        while(current!=null && count<pos-2)
        {
            current=current.next;
            count++;
        }
        newnode.next=current.next;
        current.next=newnode;
        
        
    }
    
    public void printlist()
    {
        Node curr=this.head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}

public class Main
{
    public static void main(String args[])
    {
        Linkedlist l=new Linkedlist();
        for(int i=1;i<6;i++)
        l.append(i);
        int n=10;
        int pos=5;
        l.insert_pos(n,pos);
        l.printlist();
    }
}


