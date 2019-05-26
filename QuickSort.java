/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author junaed_abed
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int array[] = { 3, 5 , 10, 23, 25, 8, 7, 9, 50, 47};
        
        quickSort(array, 0, array.length);
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void quickSort(int[] a, int start, int end){
        
        if(end - start < 2){
            return;
        }
        
        int pivotIndex = partition(a, start, end); //returns the index of the pivot after sorting
        
        quickSort(a, start, pivotIndex);
        quickSort(a, pivotIndex+1, end);
    }
    
    
    @SuppressWarnings("empty-statement")
    public static int partition(int[] a, int start, int end){
        //first elem is as pivot
        int pivot = a[start];
        int i = start;
        int j = end;
        
        while(i < j){
            
            while(i < j && a[--j] >= pivot ); //searching elem from right to left until it's lesser than the pivot
            if(i < j){
              a[i] = a[j]; //if lesser, putting the elem to the left side from the right  
            }
            
            while(i < j && a[++i] <= pivot); //searching elem from left to right until it's greater than the pivot
            if(i < j){
                a[j] = a[i];//if greater, putting the elem to the rigth side from the left
            }
        }
        
        
        a[j] = pivot; //putting the pivot into the correct postition
        return j;
        
    }
    
}
