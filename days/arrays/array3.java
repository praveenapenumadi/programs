public class array3 {
    static void common(int array[],int num)
   {
       
       for(int i=0;i<array.length;i++)
       {
           for(int j=i+1;j<array.length;j++)
           {
               if(array[i]+array[j]==num)
               {
                   System.out.println(array[i]+"+"+array[j]+"="+num);
                  System.out.println();
               }
           }
       }
   } 
   public static void main(String args[])
   {
       
       common(new int[]{1,9,4,6},10);
   }
}
