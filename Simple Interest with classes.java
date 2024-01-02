public class Main
{
	public static void main(String[] args)
	{
	    Bank cus1=new Bank("Sri","normal");
	    Bank cus2=new Bank("Sachin","senior");
	    
	    double interest = cus1.roi(1000, 2);
	    double interest2 = cus2.roi(1000, 2);
        System.out.println("Interest for cus1: " + interest);
        System.out.println("Interest for cus2: " + interest2);
	}
}

class Bank
{
    String name;
    String type;
    float ist;
    Bank(String name,String type)
    {
        this.name=name;
        this.type=type;
        if(type.equals("normal"))
            this.ist=7.5f;
        else 
            this.ist=6.0f;
    }
    double roi(long prin,int yrs)
    {
        double si=prin*yrs*ist/100;
        return si;
    }
}


//java program get 3 inputs side 1 2 3 of triangle or angle of all 
//equi or isoclese or scalar
//else acute obtuse or print not valid inputs
