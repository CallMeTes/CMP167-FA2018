/*  Author: Tesfa Greaves
    Date: 10/29/2018
    Desc: Math functions translated to Java as methods private h(x) & public j(x,y)
*/

public class Functions
{
    //__________Calculation for f(x)
    public static int f(int x)
    {
        return 4*x*x+3*x+5;
    }
    
    //__________Calculation for g(z)
    public static int g(int z)
    {
        return 3*z*z*z+2*z*z;
    }
    
    //__________Calculation for h(x)
    private static int h(int x)
    {
        return 8*x*x-5*x;
    }

    //__________Calculation for j(x,y)
    public static int j(int x, int y)
    {
        return 3*x*x*y+2*x*y*y+2*x;
    }
    
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;

        System.out.println(f(a));
        //Expected Output: 12
        
        System.out.println(g(a));
        //Expected Output: 5
        
        System.out.println(h(a));
        //Expected Output: 3
        
        System.out.println(j(a,b));
        //Expected Output: 16
    }
}
