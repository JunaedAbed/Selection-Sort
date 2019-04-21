import java.util.Scanner;
public class Lab1V10Q03{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        
        System.out.println("Enter 10 numbers");
        
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        
        for(int lastUnsortedIndex = a.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(a[i] < a[i+1]){
                    swap(a, i, i+1);
                }
            }
        }
        
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        
    }
    
    public static void swap(int[] array, int i, int j){
        
        if(i == j){
            return;
        }
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}