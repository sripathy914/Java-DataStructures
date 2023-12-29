import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value : ");
		float value=sc.nextFloat();
		
		System.out.print("Enter precision : ");
		int prec=sc.nextInt();
		
		System.out.print("Enter space : ");
		int space=sc.nextInt();
		
		System.out.print("do u want '0's (0/1): ");
		int n=sc.nextInt();
		
		if(n)
		System.out.format("%0"+space+"."+prec+"f",value);
		else
		System.out.format("%"+space+"."+prec+"f",value);
	}
}
