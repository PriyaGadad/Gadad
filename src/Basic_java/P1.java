package Basic_java;

import java.net.MulticastSocket;

public class P1 
{
public P1()
{
	System.out.println("pri");
}
public P1(int m)
{
	System.out.println(m);
}
public void M1()
{
	System.out.println("M1 of P1 class");
}
static {
	System.out.println("27/2/2022");
}
{
	System.out.println("hii");
}


public static void main(String[] args) 
{
	P1 a=new P1(1);
	a.M1();
}
}
