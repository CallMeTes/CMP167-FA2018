/*	
	Author: Tesfa Greaves
	Date: 10/31/2018 (Holloween)
	Desc: Class with Input Functions
	Modified: 11/07/2018
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

	//Gets integer array from user
	public static int[] getInts(String prompt, int size)
	{
		int[] iArray = new int[size];
		System.out.println("Enter "+size+" int numbers:");
		for(int i=0; i<size; i++)
		{
			iArray[i] = getInt(prompt);
		}
		return iArray;
	}

	//Gets Double from user
	public static double getDouble(String prompt)
	{
		return Double.parseDouble(getString(prompt));
	}

	//Gets Float from user
	public static float getFloat(String prompt)
	{
		return Float.parseFloat(getString(prompt));
	}

	//ONLY FOR DEBUGGING
	public static void main(String[] args)
	{
		//Print Element in Array
		int 	n 			=	getInt ("Enter size of array: ");
		int[]	testArray	=	getInts("-> ", n);
		Output.display("Element at index 0 is "+testArray[0]);
		
		//Integer Variable, Call Your Function
		int num = getInt("Enter Int -> ");
		System.out.println("Your Int is: " +num);
		
		//Double Variable, Call Your Function
		double decimal = getDouble("Enter Double -> ");
		System.out.println("Your Double is: " +decimal);
		
		//Print Variable
		//Test the gerString Function
		String read = getString("Enter String -> ");
		System.out.println("Your String is: " +read);
		
	}
}