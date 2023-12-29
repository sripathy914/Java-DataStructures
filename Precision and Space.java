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
		
		System.out.format("%"+space+"."+prec+"f",value);
	}
} 
