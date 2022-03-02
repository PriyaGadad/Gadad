package Basic_java;

public class Bill 
{
public void M2()
{
	
	int a=90;
	int b=60;
	int c=35;
	int d=60;
	int e=60;
	int sum=a+b+c+d+e;
	
	System.out.println("Mizveg tahle curry="+a);
	System.out.println("st rice="+b);
	System.out.println("curd="+c);
	System.out.println("pulka="+d);
	System.out.println("soup="+e);
	System.out.println("Total="+sum);
}
public void M3()
{
	String p=("priya");
	System.out.println("Have a nice day visit again");
}
static
{
	System.out.println("MADRAS KITCHEN");
	System.out.println("date 27/10/2014 13:06N0:0000014");
	
}

public static void main(String[]args)
{
	Bill m=new Bill();
	m.M2();
	m.M3();
}
}
