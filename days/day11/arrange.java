import java.util.*;
 class arrange
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     sc.close();
     char ch[]=new char[str.length()];
      int x=0,y=str.length()-1;
      for(int i=0;i<str.length();i++)
       {
        if(str.charAt(i)=='0')
         {
           ch[x]=str.charAt(i);
           x++;
          }
         else
          {
           ch[y]=str.charAt(i);
            y--;
           }
          }
          System.out.println(ch);
       }
  }

OUTPUT:

C:\Users\praveena srividhya\OneDrive\Desktop\programs>java arrange
01010
00011

C:\Users\praveena srividhya\OneDrive\Desktop\programs>java arrange
010100010
000000111