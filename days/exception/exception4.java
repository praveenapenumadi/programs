
 class exception4
  {
   public static void main(String[] args)
    {
     
     String str=null;
     String text;
     try
      {
      if(str.length()==0)
       {
        text="null";
        System.out.println(text);
        }
       }
       catch(Exception e)
       {
       System.out.println(e);
       }
     }
 }
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\programs>java exception4
java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null