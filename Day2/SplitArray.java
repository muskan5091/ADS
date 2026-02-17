public class SplitArray {
    public static void main(String[] args) {
        int[] arr ={2, 4, 6, 5, 1};
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }

        if(totalSum%3!=0) //3 means kitne parts me divide krna hai like agr nhi kr shkte tou false 
        {
            System.out.println(false);
            return;
        } 
        int partSum=totalSum/3; // agr kr skte hai tou har part ka sum kya hoga 
        int currentSum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum==partSum){
                count++;
                currentSum=0;
            }   
        }
        System.out.println(count>=3);
    }
    
}
