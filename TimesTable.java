/*	
	Author: Tesfa Greaves
	Date: 11/05/2018
	Desc: This program displays a TimesTable
*/

public class TimesTable
{
	public static void createTimesTable(int n, int m)
	{
		for (int multiplier = 1; multiplier <= n; multiplier++)
		{
			for (int multiplicand = 1; multiplicand <= m; multiplicand++)
			{
				System.out.print(multiplier*multiplicand+"\t");
			}
		System.out.println("");
		}
	}
	public static void main(String[] args)
	{
		createTimesTable(10,5);
		/*	Expected output:
			1	2	3	4	5
			2	4	6	8	10
			3	6	9	12	15
			4	8	12	16	20
			5	10	15	20	25
			6	12	18	24	30
			7	14	21	28	35
			8	16	24	32	40
			9	18	27	36	45
			10	20	30	40	50
		*/
	}
}