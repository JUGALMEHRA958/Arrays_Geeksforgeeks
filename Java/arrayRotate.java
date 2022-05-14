//question no 1
//Program for array rotation
//link :- https://www.geeksforgeeks.org/array-rotation/







public class arrayRotate {


    static int[] rotateByOne(int arr[], int  n ){
        int temp=arr[0];
        for(int i= 0 ; i<n-1;i++ ){
            

            arr[i]= arr[i+1];

        }
        arr[n-1]=temp;

        return arr;
    }    
   
    static int[] rotate(int arr[]  , int  k, int n) {
         int [] tempArray =  new int[k] ;                 

         
   
        for(int i=0;i<k;i++){
            
            arr = rotateByOne(arr, n);

        }
       

       return arr;

    }

    public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5, 6, 7};
      int abc[] = rotate(arr, 1,arr.length);  



        for (int i = 0; i < abc.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
