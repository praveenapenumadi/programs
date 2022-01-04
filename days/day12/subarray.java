import java.util.*;
 class subarray
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int array[]=new int[n];
    int count=0;
  
    for(int i=0;i<n;i++)
     {
      array[i]=sc.nextInt();
     }
    for(int i=0;i<n;i++)
     {
      int sum=0;
      for(int j=i;j<n;j++)
       {
        sum=sum+array[j];
        if(sum<0)
          count++;
        }
      }
     System.out.println(count);
    }
 }
    
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\programs>java subarray
5
1 -2 4 -5 1
9

C:\Users\praveena srividhya\OneDrive\Desktop\programs>java subarray
6
1 -4 5 -6 2 1
12
   
  