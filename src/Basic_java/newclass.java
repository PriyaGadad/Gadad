package Basic_java;

public class newclass 
{
	
public void M3()
{
	int date=25;
	int month=22;
	int year=22;
	int birthdate=date+month+year;
	System.out.println("pinki="+date);
	System.out.println("monky="+month);
	System.out.println("donky="+year);
	System.out.println("date of birth="+birthdate);
	
}
public static void main(String[]args)
{
	newclass n=new newclass();
	n.M3();
}

}
