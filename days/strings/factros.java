import java.util.*;
public class factors {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        System.out.println("factros of a "+num+" are :");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i +" ");
            }
        }
    }
}