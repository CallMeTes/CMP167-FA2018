/*	Author: Tesfa Greaves
	Date: 10/22/2018
	Desc: Creating Functions
*/
public class FunctionTest
{
	//ABS Method
	public static int abs(int n)
	{
		if(n >= 0) return n;
		else return -n;
	}
	//MAX VALUE of two 'int' Numbers
	public static int max(int x, int y)
	{
		if(x >= y) return x;
		else return y;
	}
//Java will now look for main method to start the program
	public static void main(String[] args)
	{
		int a = -15;
		int b = abs(-7);
		int c = abs(a);
		
		System.out.println("a = "+a+", b = "+b+", c = "+c);
		//Expected output: a = -15, b = 7, c = 15
		
		System.out.println("The Max between "+a+" and "+c+" is "+max(a,c));
		//Expected output: The Max between -15 and 15 is 15
	}
}