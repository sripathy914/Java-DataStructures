import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("x1 , x2 axes : ");
        int x1=sc.nextInt(),x2=sc.nextInt();
        System.out.println("y1 , y2 axes : ");
        int y1=sc.nextInt(),y2=sc.nextInt();
        System.out.println("Enter radius : ");
        float r=sc.nextFloat();
        axis co=new axis(x1,x2,y1,y2);
        String res=(co.dist>r*r)?"Outside circle":(co.dist<r*r)?"Inside circle":"On circle";
        System.out.println(res);
    }
}
class axis
{
    int x1,x2;
    int y1,y2;
    double dist;
    axis(int x1,int x2,int y1,int y2)
    {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        dist=(x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }
}
