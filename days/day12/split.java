import java.util.*;
 class split
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     String[] s=str.split("[ @,.!_'? ]");
      System.out.println(s.length);
     for(int i=0;i<s.length;i++)
      {
     
      System.out.println(s[i]);
      }
     }
  }
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\programs>java split
this@is,praveena.doing java_practice
6
this
is
praveena
doing
java
practice