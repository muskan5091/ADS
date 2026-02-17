// public class Kdane {
//     public static void main(String[] args){
//         int[] arr={2,4,6,-5,8,9,10};
//         int currentSum=arr[0]; //2
//         int maxSum=arr[0]; //2
//         for(int i=1;i<arr.length;i++){
//             currentSum=Math.max(arr[i], currentSum+arr[i]);//(arr[i=1]=4, currentSum+arr[i]=6) => 6 ayega)
//             maxSum=Math.max(maxSum, currentSum); //(maxSum=2, currentSum=6) => 6 ayega
//         }
//         System.out.println("maxSum Subarray sum is : " + maxSum);
//     }
// }


// circular array me maximum subarray sum nikalna hai
public class Kdane {
    public static void main(String[] args){
        int[] arr={8,-1,3,4};
        int totalSum=0;
        int maxSum=arr[0];
         int currentMax=arr[0];
         int minSum=arr[0];
        int currentMin=arr[0];
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
            if(i>0)
            {
                currentMax=Math.max(arr[i], currentMax+arr[i]);  //(compare btw -1 and 7)
                maxSum=Math.max(maxSum, currentMax); //(compare btw 8 and 7 )
                
                currentMin=Math.min(arr[i], currentMin+arr[i]); //(compare btw -1 and 7)
                minSum=Math.min(minSum, currentMin); //(compare btw 8 and 7 )
            }
        }
        int circularSum=totalSum-minSum; //pura total sum and total min sum jo ayega uske minus krna
        System.out.println("Max circular subarray sum is : " + Math.max(maxSum, circularSum));
    }
}










