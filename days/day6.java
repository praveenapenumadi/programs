    DAY6
  
PROGRAM  1

import java.util.*;
class day55
 {
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int row=sc.nextInt();
  for(int i=1;i<=row;i++)
    {
     for(int j=1;j<=i;j++)
      {
        if(j==i || j==1 || i==row)
           System.out.print(" "+j);
         else
           System.out.print(" ");
       }
      System.out.println();
     }
  }
}
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\praveena>java day55
5
 1
 1 2
 1  3
 1   4
 1 2 3 4 5

      PROGRAM 2

import java.util.*;
public class pattern6
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
             
       
	for(int i=n;i>0;i--)
               {
	     if(i==1 || i==n)
                       for(int j=1;j<=i;j++)
                         {
                               System.out.print(j);
                        }
                   else
	    {
                       for(int j=1;j<=i;j++)         
                       {  
                          	if(j==1 || j==i)
                              	System.out.print(j);
                              else
                                            System.out.print(" ");
                        }
                    }
                     System.out.println();   
               }             
    }
}
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\praveena>java pattern6
Enter N :
5
12345
1  4
1 3
12
1
 program

import java.util.*;
class day62
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i>=1;i--)
     {
      for(int j=1;j<=i;j++)
       { 
       System.out.print(" "+j);
       }
       System.out.println(  );
     }
   }
 }
output:
C:\Users\praveena srividhya\OneDrive\Desktop\pravi\praveena>java day62
5
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1

   program
import java.util.*;
class day62
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
     {
      for(int j=1;j<=i;j++)
       { 
       System.out.print(" "+j);
       }
       System.out.println(  );
     }
   }
 }
output:
C:\Users\praveena srividhya\OneDrive\Desktop\pravi\praveena>java day62
5
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5