class Solution {
    public boolean isPalindrome(String s) {
        //left pointer - 0 , right pointer- n-1
        // ign invalid characters
        //compare with lower cases
        int left =0, right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
            left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
            right--;
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}
