public class SelectionSort{
    public static void main(String [] args){
        int [] a = {20,35,-15,7,55,1,-22};
        sort(a);
        
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    static void sort(int [] a){
        for(int i = 0; i< a.length - 1; i++){
            int minIdx = i;
            for(int j = i +1; j < a.length; j++){
                if(a[j] < a[minIdx]){
                    minIdx = j;
                }
            }
            
            int temp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = temp;    
        }
    }
                               
                             
}