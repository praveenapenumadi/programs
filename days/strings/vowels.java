import java.util.*;
public class vowels
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int count=0;
    int count1=0;
    for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            count++;
        }
        else{
            count1++;
        }
    }
    System.out.println("vowels are "+count);
    System.out.println("consonents are "+count1);
  }
}