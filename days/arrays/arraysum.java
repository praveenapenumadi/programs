public class arraysum {
    public static void main(String args[])
    {
        int arr[] = {2,4,5,6,7,8};
        int sum=0;
        int product=1;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            product*=arr[i];

        }
        if(sum%2==0)
        {
            System.out.println("sum is :"+sum);
        }
        else
           System.out.println("product is :"+product);
    }
}
