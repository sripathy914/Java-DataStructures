import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=0;
		 for(char c: s.toCharArray()) 
         len++;
		
		for(int i=0;i<len/2;i++)
		{
		    if(s.charAt(i)==s.charAt(len-i-1))
		        flag=0;
		    else
		    {
		        flag=1;
		        break;
		    }
		}
		String pal=(flag==1)?"Not palindrome":"Is palindrome";
		System.out.println(pal);
		
	}
}
