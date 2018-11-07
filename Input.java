/*	
	Author: Tesfa Greaves
	Date: 10/31/2018 (Holloween)
	Desc: Class with Input Functions
	Modified: 11/05/2018
*/

import java.io.*;
public class Input
{
	static InputStreamReader isr = new InputStreamReader(System.in);
	static BufferedReader keyboard = new BufferedReader(isr);

	//Gets String from user
	public static String getString(String prompt)
	{
		System.out.print(prompt);
		try
		{
			return keyboard.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Something happened with the IO");
		}
		return "";
	}

	//Gets integer from user
	public static int getInt(String prompt)
	{
		return Integer.parseInt(getString(prompt));
	}

	//Create getDouble function
	public static double getDouble(String prompt)
	{
		return Double.parseDouble(getString(prompt));
	}

	//Create getFloat function
	public static float getFloat(String prompt)
	{
		return Float.parseFloat(getString(prompt));
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