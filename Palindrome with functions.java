import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String rev_str="";
		for(int i=s.length()-1;i>=0;i--)
		    rev_str +=s.charAt(i);
		
		for(int i=0;i<s.length();i++)
		{
		    if(s.toLowerCase().equals(rev_str.toLowerCase()))
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
