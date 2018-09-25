//TESFA GREAVES - CMP 167 - PROFESSOR YANILDA PERALTA RAMOS - M/W 1PM-2:40PM - FA2018

/*Write a program to print the charecters.*/

public class Test9

{
	public static void main(String ar[])
	{
		System.out.println('b');
		//Prints: b
		//Because: Java considers anything in single quotes a character variable and printed the letter ‘b’.

		System.out.println('b'+'c');
		//Prints: 197
		//Because: Java used the ASCII code of 'b' which equals 98 and 'c' which equals 99 to produce a value (or character) to print.
		//Java then used its programing power to add up these two numbers to ‘197’ exactly.
		//(American Standard Code for Information Interchange)
		//https://ascii.cl/ 

		System.out.println((char)('a'+4));
		//Prints: e
		//Because: Java knows the ASCII code for 'a' is 97 and added that value with the number 4.
		//The total would equal 101 and since with specified the char of 101 is equivalent to the ASCII ‘e’, that's whats printed.
		//(American Standard Code for Information Interchange)
		//https://ascii.cl/ 

	}//End Main

}//End Class
