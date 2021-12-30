import java.util.*;
 class exception2
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int n=sc.nextInt();
    try
    {
     System.out.println(str.charAt(n));
    }
   catch(StringIndexOutOfBoundsException e)
    {
     System.out.println(e);
    }
  }
} 
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\programs>java exception2
praveena
4
e

C:\Users\praveena srividhya\OneDrive\Desktop\programs>javac exception2.java

C:\Users\praveena srividhya\OneDrive\Desktop\programs>java exception2
praveena
9
java.lang.StringIndexOutOfBoundsException: String index out of range: 9