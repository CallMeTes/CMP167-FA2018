/*	Author: Tesfa Greaves
	Date: 10/22/2018
	Desc: Program that greets appropiately
*/

//Imports the INPUT/OUTPUT modules from Java
import java.io.*;
public class Greetings
{
	//BufferedReader allows for the program to read input from user and as well, files
	static BufferedReader k = new BufferedReader ( new InputStreamReader(System.in));
	
	//The first method to be executed is main
	public static void main(String[] args) throws IOException
	{
		int age = getInt("Enter age: ");
		String name = getString("Enter name: ");
		String greet = selectGreet(name, age);
		displayGreet(greet);
	}

	//Input Functions
	public static int getInt(String prompt) throws IOException
	{
		System.out.print(prompt);
		return Integer.parseInt(k.readLine());
	}
	public static String getString(String prompt) throws IOException
	{
		System.out.print(prompt);
		return k.readLine();
	}

	//Calculations functions
	public static String selectGreet(String uName, int uAge)
	{
		if (uAge <= 17)
			return "Sup! "+uName;
		else
			return "Greetings Sir/Miss "+uName;
	}

	//Output Functions
	public static void displayGreet(String uGreet)
	{
		System.out.print(uGreet);
	}
}