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
    
    public void rotate(int k)
    {
        Node tail=this.head;
        int len=1;
        
        while(tail.next!=null)
        {
            tail=tail.next;
            len++;
        }
        
        if(k%len==0)
            return;
            
        int val=k%len;
        Node kth_node=this.head;
        
        int count=1;
        while(kth_node!=null)
        {
            if(count==val)
                break;
            count++;
            kth_node=kth_node.next;
        }
        
        tail.next=this.head;
        this.head=kth_node.next;
        kth_node.next=null;
        
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
        l.rotate(3);
        l.printlist();
        
    }
}





//find kth element form head and i th element from tail




 
