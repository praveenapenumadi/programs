import java.util.*;
public class special {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>64&&str.charAt(i)<122)
            {
                str1=str1+str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
