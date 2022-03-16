import java.util.*;
public class reversenumber
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int remainder;
        int reverse=0;
        int num = sc.nextInt();
        sc.close();
        while(num!=0)
        {
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;


        }
        System.out.println("reverse number is :"+reverse);

    
    }
}