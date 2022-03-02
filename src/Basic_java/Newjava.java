package Basic_java;

public class Newjava 
{
	public Newjava()
	{
		System.out.println("sai");
	}
	public Newjava(int a)
	{
		System.out.println(a);
	}
	static
	{
		System.out.println("priya");
	}
	{
		System.out.println("mahesh");
	}
	
	public void M1()
	{
		System.out.println("priya");
	}
	public static void main(String[]args)
	{
		Newjava a=new Newjava();
		Newjava b=new Newjava(10);
		a.M1();
	}
}

