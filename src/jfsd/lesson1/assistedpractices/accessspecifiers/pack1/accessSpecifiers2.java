package jfsd.lesson1.assistedpractices.accessspecifiers.pack1;

//2. using private access specifiers
class priAccessSpecifier
{
	void accessPrivateMethod()
	{
		display();
	}
	
	private void display() 
	{ 
		System.out.println("You are using private access specifier"); 
	} 
} 

public class accessSpecifiers2
{
	public static void main(String[] args)
	{
		//private
		System.out.println("Private Access Specifier");
		priAccessSpecifier  obj = new priAccessSpecifier(); 
		//trying to access private method of another class 
		obj.accessPrivateMethod();

	}
}
