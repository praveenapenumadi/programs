import java.util.*;
public class largesmall {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();

        }
        int largest=ar[0];
        int smallest=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]>largest)
            {
                largest=ar[i];
            }
            else
            {
                if(ar[i]<smallest)
                {
                    smallest=ar[i];
                }
            }
        }
        System.out.println("largest number "+largest);
        System.out.println("smallest number "+smallest);

    
    }
}
