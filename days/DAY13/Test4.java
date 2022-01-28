import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.lang.*;
public class Test4
{
 public static void main(String[] args)   
  {
      String regex="^foo.*";
      Pattern p=Pattern.compile(regex);
      try
       {
           FileReader fr=new FileReader("C:\\Users\\LENOVO\\Desktop\\pravi\\foo.txt");
           BufferedReader br=new BufferedReader(fr);
           String line;
           while((line=br.readLine())!=null)
             {
                 Matcher m=p.matcher(line);
                 if(m.find())
                  {
                      System.out.println(line);
                  }
             }
       }
       catch(Exception e)
        {
         System.out.println(e); 
         }    
      }
}
OUTPUT:
C:\Users\LENOVO\Desktop\pravi>java Test4
fooadd
fooa
foobn
foob
foomnb