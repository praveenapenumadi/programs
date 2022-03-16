import javax.lang.model.util.ElementScanner14;

public class array4 {
  public static void main(String args[])
  {
      int array[]={2,4,6,4,8};
      int search=4;
      int count=0;
      for(int i=0;i<array.length;i++)
      {
          if(array[i]==search)
          {
              count+=1;
          }
      }
      if(count==0){
         System.out.println("number is not found");
      }else
         System.out.println("number isfound");
      System.out.println("no.of occurences"+count);
  }     
}
