

/*Write a program that measures distance.*/

public class EDistance
{
	public static void main(String ar[])
	{
		if(ar.length>=2)
		{
			//Accept x- and y-coordinatesat command-prompt
			int x=Integer.parseInt(ar[0]);
			int y=Integer.parseInt(ar[1]);

			//Calculate Distance to the point (0,0)
			double d=Math.sqrt(x*x+y*y);

			//Print the distance
			System.out.println("Distance from ("+x+","+y+") to (0,0) is:= "+d);		
		}//End If

		//I will enter a else clause to have user enter information in the proper format.
		else
			
			{
				System.out.println("Enter coordinates as follows: java EDistance x y");
			}//End Else
	
	}//End Main

}//End Class