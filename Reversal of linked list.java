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
    
    public void reverse()
    {
        Node prev=null;
        Node nextnode=this.head;
        Node curr=this.head;
        
        while(curr!=null)
        {
            nextnode=nextnode.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        this.head=prev;
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
        l.printlist();
        
        System.out.println("After reversing...");
        l.reverse();
        l.printlist();
        
    }
}





//find kth element form head and i th element from tail




 
