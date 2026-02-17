// public class lps {

//     public static int[] computeLPS(String pattern) {
//         int n = pattern.length();
//         int[] lps = new int[n];

//         int len = 0;
//         int i = 1;

//         while (i < n) {
//             if (pattern.charAt(i) == pattern.charAt(len)) {
//                 len++;
//                 lps[i] = len;
//                 i++;
//             } else {
//                 if (len != 0) {
//                     len = lps[len - 1];
//                 } else {
//                     lps[i] = 0;
//                     i++;
//                 }
//             }
//         }

//         return lps;
//     }

//     public static void main(String[] args) {
//         System.out.println("Try programiz.pro");

//         String s1 = "ababaca";
//         int[] lps = computeLPS(s1);

//         for (int i = 0; i < lps.length; i++) {
//             System.out.print(lps[i] + " ");
//         }
//     }
// }



//pattern="abab"
//index=0 susbstring-a lps=0
//index=1 substring=ab lps=0
//index=2 substring=aba lps=1
//index=3 substring=aba lps=2

//lps=[0,0,1,2]

//logic - 

//two [pointer ]- len=previous ki longest prefix length
//i= current index

//algorithm - lps[0]=0
//agr len=0, i=1 - lps[0]=0
//pattern[i]==pattern[length]
//it means len++;
//lps[i]=len ;
//i++

//agr len not equal to 0;
//len=lps[len-1]
//len==0 =lps[i]=0 i++;

//pattern="ababaca"
//lps[0]=0, len=0, i=1
//lps[1]=0, len=0, i=1
// lps[2]=1 len=1, i=2
// lps[3]=2 len=2, i=3
// lps[4]=333333 len=3, i=4

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);   // start node
        ListNode curr = dummy;              // current pointer (like i)

        int carry = 0;                      // previous value (like len)

        // loop until both lists end AND no carry left
        while (l1 != null || l2 != null || carry != 0) {

            int v1 = 0;
            int v2 = 0;

            // get current values
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;   // move pointer forward
            }

            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;   // move pointer forward
            }

            int sum = v1 + v2 + carry;

            carry = sum / 10;          // update previous value
            int digit = sum % 10;      // current result digit

            curr.next = new ListNode(digit);
            curr = curr.next;          // move current pointer
        }

        return dummy.next;
    }
}


