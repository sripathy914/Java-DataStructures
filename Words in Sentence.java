import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine().trim();
	    int count=0;
	    for(int i=0;i<s1.length();i++)
	    {
	        if(s1.charAt(i)==' ')
	        { 
	            count++;
	            System.out.print("\n");
	        } 
	        else
	            System.out.print(s1.charAt(i));
	    }
	    System.out.println("\n"+(count+1));
	}
}


// send message 
