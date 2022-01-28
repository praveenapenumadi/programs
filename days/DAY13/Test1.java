import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.lang.*;
public class Test1
{
 public static void main(String[] args)   
  {
      String regex=".oo";
      Pattern p=Pattern.compile(regex);
      try
       {
           FileReader fr=new FileReader("C:\\Users\\LENOVO\\Desktop\\pravi\\test.txt");
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
:\Users\LENOVO\Desktop\pravi>java Test1
foo
moo
poo
