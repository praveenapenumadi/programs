import java.util.*;
import java.io.*;
 class matrix
  {
   public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int[n][n];
    for(int i=0;i<n;i++)
     {
      for(int j=0;j<n;j++)
       {
       arr[i][j]=sc.nextInt();
      System.out.print(arr[i][j]);
      }
      System.out.println();
     }
    int sum1=0,sum2=0;
    for(int i=0;i<n;i++)
     {
      for(int j=0;j<n;j++)
       {
        if(i==j)
          {
          System.out.println(arr[i][j]);
          sum1=sum1+arr[i][j];
           
          }
         }
       }
        //System.out.println(sum1);
        for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++)
       {
        if(i==n-j-1)
         {
          System.out.println(arr[i][j]);
          sum2=sum2+arr[i][j];
         }
        }
      }
     
     int diff=sum1-sum2;
     System.out.println(diff);
 
   }
 }
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\programs>java matrix
3
1 2 3 4 5 6 7 8 9
123
456
789
1
5
9
3
5
7
0
