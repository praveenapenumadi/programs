 public class Insertion {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {12,18,19,13,17,11,16,15,14,10};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1); 
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}   
output:C:\Users\praveena srividhya\OneDrive\Desktop\day9\day8>javac Insertion.java

C:\Users\praveena srividhya\OneDrive\Desktop\day9\day8>java Insertion
Before Insertion Sort
12 18 19 13 17 11 16 15 14 10
After Insertion Sort
10 11 12 13 14 15 16 17 18 19 
 