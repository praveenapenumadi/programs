public class binarysort {
    static void sort(int[] arr)
    {
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<(n-i);j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
      int arr[]={34,12,45,89,9,10};
      System.out.print("before sort  ");
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println( );
      sort(arr);
      System.out.print("afetr sort  ");
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ");
      }
      System.out.println( );
    } 
}
