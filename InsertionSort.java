public class InsertionSort{
    public static void main(String [] args){
        int [] a = {20,35,-15,7,55,1,-22};  
        
        for(int i = 1; i < a.length; i++){
            int key = a[i];
            int j;
            for(j = 1; j > 0 && a[j - 1] > key; j--){
                a[j] = a[j - 1];
            }
            a[j] = key;
        }
            
            
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }                            
}