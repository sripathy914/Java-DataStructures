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
    
    public void chk_loop()
    {
        Node hare,tort;
        hare=tort=null;
        if(this.head==null)
        {
            System.out.println("List is empty...");
        }
        else
        {
            while(hare!=null && hare.next.next!=null)
            {
                tort=tort.next;
                hare=hare.next.next;
                
                if(hare==tort)
                {
                    System.out.println("Loop is there...");
                    return;
                }
            }
            System.out.println("Loop is not there...");
        }    
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
        
        l.chk_loop();
    }
}





 
