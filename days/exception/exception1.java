import java.util.*;
 class exception1
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c;
     try
     {
      c=a/b;
      System.out.println("division of two numbers is :"+c);
     }
    catch(ArithmeticException e)
     {
     System.out.println("arithmetic exception "+e);
     }
   } 
 }
OUTPUT:
:\Users\praveena srividhya\OneDrive\Desktop\programs>java exception1
5
0
arithmetic exception java.lang.ArithmeticException: / by zero

OUTPUT2:
C:\Users\praveena srividhya\OneDrive\Desktop\programs>java exception1
10
5
division of two numbers is :2