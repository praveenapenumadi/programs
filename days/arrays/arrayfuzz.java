import java.util.*;

public class arrayfuzz {
    static int array1(int arr[],int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]%3)==0)
             {
                 System.out.print("Fizz");

             }
             else
             if(arr[i]%5==0)
             {
                 System.out.print("Buzz");
             }
             else
            
                 if((arr[i]%3)==0&&(arr[i]%5==0))
                 {
                    System.out.print("FizzBuzz"); 
                 }
             
             else
                 System.out.print(arr[i]);
              System.out.print(" ");
        }
        return 0;

    }
    public static void main(String args[])
    {
        array1(new int[]{1,2,3,4,5},5);
    }
}
