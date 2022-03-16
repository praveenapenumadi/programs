import java.util.*;
public class second
{  
  public static int getSecondLargest(int[] a, int total){  
  int temp;  
  for (int i = 0; i < total; i++)   
  {  
   for (int j = i + 1; j < total; j++)   
    {  
     if (a[i] > a[j])   
      {  
       temp = a[i];  
       a[i] = a[j];  
       a[j] = temp;  
      }  
     }  
    }  
  return a[total-2];  
}  
public static void main(String args[])
{  
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
   arr[i]=sc.nextInt();
   } 
  System.out.println("Second Largest: "+getSecondLargest(arr,n));   
 }
}
