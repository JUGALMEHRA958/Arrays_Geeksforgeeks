//question no 4
//Program to cyclically rotate an array by one

//link :- https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/







public class rightRotate {


    static int[] rotateByOne(int arr[], int  n ){
        int temp=arr[n-1];
        for(int i= n-1 ; i>0;i-- ){
            
            int tempvar = arr[n-1];
            arr[i]= arr[i-1];

        }
        arr[0]=temp;

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
      int abc[] = rotate(arr, 2,arr.length);  



        for (int i = 0; i < abc.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
