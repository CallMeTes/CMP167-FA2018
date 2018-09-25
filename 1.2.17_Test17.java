//TESFA GREAVES//OPTIONAL HOMEWORK 1.2.17

/*WARNING: THIS FILE WILL BE UNRUNABLE IN JAVE DUE TO THE NATURE OF ITS CONTENT*/

//1.2.17 Give the value of the variable a after the execution of each of the following sequences of statements:
//int a = 1; 
//a = a + a; 
//a = a + a;
//a = a + a;
public class Test17
{
  public static void main(String ar[])
  {
    int a=1;
    a=a+a;
    a=a+a;
    a=a+a;
    System.out.println(a);
  }
}
//ANSWER: "8"
//WHY: When evaluated "8" is printed because of the change after every statment.
//Initialization Variable: a = 1
//a = a+a = 1+1 = 2
//a = a+a = 2+2 = 4
//a = a+a = 4+4 = "8"



////1.2.17 Give the value of the variable a after the execution of each of the following sequences of statements:
//boolean a = true;
//a = !a;
//a = !a;
//a = !a;
public class Test17_1
{
  public static void main(String ar[])
  {
    boolean a=true;
    a=!a;
    a=!a;
    a=!a;
    System.out.println(a);
  }
}
//ANSWER: "false"
//WHY: When evaluated "false" is printed because the value changes after every statement.
//Boolean Statement: a = true 
//a = !a = false
//a = !a = true
//a = !a = "false"



////1.2.17 Give the value of the variable a after the execution of each of the following sequences of statements:
//int a = 2;
//a = a * a;
//a = a * a;
//a = a * a;
public class Test17_2
{
  public static void main(String ar[])
  {
  int a=2;
  a=a*a;
  a=a*a;
  a=a*a;
  System.out.println(a);
  }
}
//ANSWER: "256"
//WHY: When evaluated "256" is printed because the value changes after every statement.
//Initialization Variable: a = 2
//a = a+a = 2*2 = 4
//a = a+a = 4*4 = 16
//a = a+a = 16*16 = "256"
