    PROGRAM 

import java.util.*;
class day91
 {
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     int row=sc.nextInt();
     int coloum=sc.nextInt();
      for(int i=1;i<=row;i++)
       {
        for(int j=1;j<=coloum;j++)
         {
           if(i==1 || i==row || j==coloum || j==1)
              System.out.print("*");
            else
              System.out.print(" ");
          }
        System.out.println( );
      }
   }
}

OUTPUT:
:\Users\praveena srividhya\OneDrive\Desktop\day9>javac day62.java

C:\Users\praveena srividhya\OneDrive\Desktop\day9>java day62
3
5
*****
*   *
*****