import java.util.*;
 class exception3
  {
   public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[]{3,5,7,6};
    int n=sc.nextInt();
    try
     {
      int index=arr[n];
      System.out.println(index);
     }
    catch(Exception e)
     {
      System.out.println(e);
     }
    finally
     {
     System.out.println("we reached to the final block");
     }
   }
}
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\programs>java exception3
5
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
we reached to the final block

C:\Users\praveena srividhya\OneDrive\Desktop\programs>java exception3
3
6
we reached to the final block