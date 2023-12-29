import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float fah=sc.nextFloat();
		float cel=((fah-32)*5)/9;
		System.out.format("%15.2f\n",cel);
	}
}
