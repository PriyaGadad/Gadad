package Basic_java;

public class Constructor 
{
 public Constructor()
 {
	 System.out.println("Hi");
 }
 
 public Constructor(String b)
 {
	 System.out.println(b);
 }
 
 public static void main(String[]args)
 {
	 Constructor a=new Constructor();
	 Constructor b=new Constructor("sai");
 }
}
