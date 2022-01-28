//program to email verification
import java.util.*;
class Test
 {
     public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        String mail=sc.nextLine();
        if(mail.length()>=8)
        {
        String regex= "[A-Z][a-z]+@[A-Za-z]+\\.com";
        if(mail.matches(regex)) 
           System.out.println("email verification is valis...success!");
        else
           System.out.println("invalid email");
         }
        else
          System.out.println("invalid .....!");
      }
 }
OUTPUT:
C:\Users\LENOVO\Desktop\pravi>java Test
praveenapenumadi@gmail.com
invalid email
