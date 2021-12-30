   PROGRAM

import java.util.*;
 class day95
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int row=sc.nextInt();
     for(int i=0;i<=row;i++)
      {
       for(int j=0;j<=i;j++)
        {
        System.out.print("* ");
        }
       System.out.println(" ");
       }
     for(int i=row-1;i>=0;i--)
      {
      for(int j=0;j<=i;j++)
       {
        System.out.print("* ");
       }
      System.out.println(" ");
    }
  }
}
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\day9>javac day95.java

C:\Users\praveena srividhya\OneDrive\Desktop\day9>java day95
4
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*