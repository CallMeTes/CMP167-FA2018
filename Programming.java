/*	
	Author: Tesfa Greaves
	Date: 11/05/2018
	Desc: Using all my functions
*/

public class Programming
{
	public static void main(String[] args)
	{
		int length = Input.getInt("Enter length -> ");
		int width = Input.getInt("Enter width -> ");
		int area = Calculation.rectArea(length, width);
		Output.display("The area of your rectangle is "+area+".");
	}
}