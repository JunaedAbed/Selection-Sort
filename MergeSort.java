/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author junaed_abed
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int  array[] = { 3, 5 , 10, 23, 25, 8, 7, 9, 50, 47};
        
        mergeSort(array, 0, array.length); //calling the method
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");//printing
        }
        System.out.println();
    }
    
    static void mergeSort(int[] a, int start, int end){
        
        //end is taken as +1 of existing number of elements
        if(end - start < 2){
            return; //when only one element exists, recursion will stop.
        }
        
        int mid = (start + end) / 2;
        
        mergeSort(a, start, mid); //for the left array. it will contain start to (mid-1) index's elements
        mergeSort(a, mid, end); //for the right array. it will contain mid to end index's elements
        
        merge(a, start, mid, end); //calling the method to merge
    }
    
    static void merge(int [] a, int start, int mid, int end){
        
        if(a[mid - 1] <= a[mid]){
            return;   /*when the right most element of the left array is less 
                      *than or equal to the left most element of the right array, 
                      *this method will stop. bcz it means. all the elements are already sorted
                      */
        }
        
        int i = start; //indicates left array
        int j = mid; //indicates right array
        int tempIndex = 0; //to trace how many elements have been merged
        
        int[] temp = new int [end - start]; //temp array to work with and then copy it to the original array
        
        while(i < mid && j < end){
            temp[tempIndex++] = a[i] <= a[j] ? a[i++] : a[j++]; //merging the elements
        }
        
        System.arraycopy(a, i, a, start + tempIndex,mid - i); /*if any elements are left over in the left array
                                                                 it will copy them to the original array. */
        
                                                    
        System.arraycopy(temp, 0, a, start, tempIndex); /*copying the temp array to the original array.
                                                         tempIndex because copying until merged index*/
    }
    
}
