public class LinearSearch {
    public static void main(String[] args) { //java ignores everything here and starts executing from main methood.
        int[] arr = {5,12,8,20,3};
        int target = 21;
        int result = linearsearch(arr, target); //control goes to linearsearch method
        if(result != -1){ //
            System.out.println("Element found at index:" +result);
        }
        else{
            System.out.println("Element not found"); //prints message to user 
        }
    }
        static int linearsearch(int arr[], int target){
            for(int i = 0; i<arr.length;i++){
                if(arr[i] == target){
                    return i;
                }
            }
            return -1; // tells main() that element was not found
        }
        
    }
