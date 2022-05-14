//question no 17
//Split the array and add the first part to the end of the array
//link :-  https://www.geeksforgeeks.org/split-array-add-first-part-end/







public class splitArr {


    static int[] rotateByOne(int arr[], int  n ){
        int temp=arr[0];
        for(int i= 0 ; i<n-1;i++ ){
            

            arr[i]= arr[i+1];

        }
        arr[n-1]=temp;

        return arr;
    }    
   
    static int[] split(int arr[] , int n , int  k) {
         int [] tempArray =  new int[k] ;                 

         
    for(int i=0;i<k;i++){
        
        arr = rotateByOne(arr, n);

    }
       

       return arr;

    }

    public static void main(String[] args) {
      int arr[] = {12, 10, 5, 6, 52, 36 };
      int abc[] = split(arr,arr.length,2);  



        for (int i = 0; i < abc.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
