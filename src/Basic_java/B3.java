package Basic_java;

public class B3 extends B2
{
public B3()
{
	System.out.println(" B3 constructor");
		
	}
public void R3()
{
	System.out.println("B3 method");
}
public static void main(String[] args) 
{
	B3 s=new B3();
	s.R1();
	s.R3();
	s.R2();
}
}
