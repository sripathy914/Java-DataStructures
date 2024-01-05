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
        if(this.head==null)
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
    
    public void printlist()
    {
        Node curr=this.head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    
    public void del_middle(int data)
    {
        Node prev=null;
        while(current!=null && current.data!=value)
        {
            prev=current;
            current=current.next;
        }
        if(current==null)
        {
            System.out.println("Value not found");
            return;
        }
    }
    
}

public class Main
{
    public static void main(String args[])
    {
        Linkedlist l=new Linkedlist();
        for(int i=1;i<6;i++)
        {
            l.append(i);
        }
        l.printlist();
        
        System.out.println("\nAfter deletion of element...");
        l.del_middle(3);
        l.printlist();
        
    }
}



