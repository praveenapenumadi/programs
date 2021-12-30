import java.util.*;
import java.io.*;
class exception5
 {
  public static void main(String[] args)throws IOException
   {
    Scanner sc=new Scanner(System.in);
    File f=new File("exception.txt");
    FileInputStream s=new FileInputStream(f);
    try
     {
      System.out.println(s);
     }
    catch(Exception  e)
     {
      System.out.println(e);
     }
    }
 }
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\programs>java exception5
Exception in thread "main" java.io.FileNotFoundException: exception.txt (The system cannot find the file specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at exception5.main(exception5.java:9)
