import java.util.*;
 class prime
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int num=0;
     String primenumbers="";
      for(int i=1;i<=100;i++)
       {
       int count=0;
       for(num=i;num>=1;num--)
        {
         if(i%num==0)
          {
           count=count+1;
          }
         }
        if(count==2)
          primenumbers=primenumbers+i+" ";

         }
      System.out.println("primenumbers are :");
      System.out.println(primenumbers);
     }
 }