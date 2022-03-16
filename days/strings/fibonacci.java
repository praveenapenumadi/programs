import java.util.*;
public class fibonacci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2+" ");
        int n3;
        sc.close();
        for(int i=0;i<=number;i++)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            n2=n3;
            n1=n2;
        }
    }
}
