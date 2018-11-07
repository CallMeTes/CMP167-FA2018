/*	Author: Tesfa Greaves
	Date: 10/31/2018 (Holloween)
	Desc: Class with Input Functions
*/

import java.io.*;
public class Input
{
	static InputStreamReader isr = new InputStreamReader(System.in);
	static BufferedReader keyboard = new BufferedReader(isr);

	//Gets integer from user
	public static int getInt(String prompt)
	{
		try
		{
			System.out.println(prompt);
			return Integer.parseInt(keyboard.readLine());
		}
		
		catch(IOException e)
		{
			System.out.println("Something went wrong");
		}
		
		catch (NumberFormatException e)
		{
			System.out.println("Your input is not a Number");
		}
		
		return -1; //Default Value
	}

	//Create getDouble function
	public static double getDouble(String prompt)
	{
		try
		{
			System.out.println(prompt);
			return Double.parseDouble(keyboard.readLine());
		}
		
		catch(IOException e)
		{
			System.out.println("Something went wrong");
		}
		
		return -1; //Default Value
	}

	//Create getString function
	public static String getString(String prompt)
	{
		try
		{
			System.out.println(prompt);
			return keyboard.readLine();
		}
		
		catch(IOException e)
		{
			System.out.println("Something went wrong");
		}
		
		return null; //Default Value
	}

	public static void main(String[] args)
	{
		int num = getInt("Enter Int -> ");
		System.out.println("Your Int is: " +num);
		//Double Variable, Call Your Function
		double decimal = getDouble("Enter Double -> ");
		System.out.println("Your Double is:" +decimal);
		//Print Variable
		//Test the gerString Function
		String read = getString("Enter String -> ");
		System.out.println("Your String is:" +read);
	}
}
