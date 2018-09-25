//TESFA GREAVES - CMP 167 - PROFESSOR YANILDA PERALTA RAMOS - M/W 1PM-2:40PM - FA2018

/*Write a program to test the sequence of statements.*/

public class Test
{
	public static void main(String ar[])
	{
	
	//Since a and b are Boolean values
	//Suppose a=true and b=false.

	boolean a=true;
	boolean b=false;

	//Execute the statements and save the result in c
	boolean c=(!(a&&b)&&(a||b))||((a&&b)||!(a||b));

	//When it is executed first
	//a&&b = false 
	//!(a&&b) = true 
	//(a||b) = true 

	//So:
	//(!(a && b) && (a || b)) = true 

	//Then:
	//!(a || b) = false

	//a&&b = false

	//So:
	//(a && b)||!(a || b) = false 

	//Combine both:
	//(!(a && b)&& (a ||b)) = true||false = true 

	//Same way when b=true and a=false

	//When both the values are true then also the statement is true and when both are false then also the statement is false,
	//hence the statement returns true for any Boolean value of a and b.

	//Print c
	System.out.println(c);
	
	}//End main
}//End class
