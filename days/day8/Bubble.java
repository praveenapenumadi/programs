
     PROGRAM
public class Bubble
{  
    static void bubbleSort(int[] arr)
     {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(arr[j-1] > arr[j])
                          {  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
    public static void main(String[] args) {  
        int arr[] ={7,23,4,5,72,1,4,3,9,1};  
         
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

}  
}  
OUTPUT:
C:\Users\praveena srividhya\OneDrive\Desktop\day9\day8>javac Bubble.java

C:\Users\praveena srividhya\OneDrive\Desktop\day9\day8>java Bubble
Array Before Bubble Sort
7 23 4 5 72 1 4 3 9 1
Array After Bubble Sort
1 1 3 4 4 5 7 9 23 72