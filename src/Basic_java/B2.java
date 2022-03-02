package Basic_java;

public class B2 extends B1
{
	public B2()
	{
		System.out.println("B2 constructor");//constructor
		
	}
	public void R2()
	{
		System.out.println("B2 method");//method
	}
	public static void main(String[] args) 
	{
		B2 a=new B2();
		
		a.R2();
		a.R1();
	}
}
