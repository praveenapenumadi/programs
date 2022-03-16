import java.util.*;
public class small {
    public static void main(String args[])
    {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(23);
        ar.add(76);
        ar.add(21);
        ar.add(5);
        Integer m=ar.stream().max(Integer::compare).get();
        Integer m1=ar.stream().min(Integer::compare).get();
        System.out.println("maximum element "+m);
        System.out.println("minimum element "+m1);
        Integer[] arr=new Integer[ar.size()];
        arr=ar.toArray(arr);
        Arrays.sort(arr);
        System.out.println("first occurence :"+arr[0]);
        System.out.println("last occurence :"+arr[arr.length-1]);
    }
}
