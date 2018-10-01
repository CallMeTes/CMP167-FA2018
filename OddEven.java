public class OddEven
{
	public static void main(String ar[])
	{
		int a=1;
		int b=100;
		while (a<=b)
		{
			if(a%2==0)
			{
				System.out.println(a + " is Even");
			}
			else
			{
				System.out.println(a + " is Odd");
			}

		a=a+1;
		}//End While
	}//End Main
}//End Class