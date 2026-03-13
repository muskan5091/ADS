
import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {

       /* Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();*/
        
//////////////////////////////////////////////////////////////////////////
//         Stack<Character> st=new Stack<>();
//         for(int i=0;i<s.length();i++){
//            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')

//             st.push(s.charAt(i));

//             else
//             if(st.size()> 0){
//                 char ch=st.peek();
//              if ( (ch == '(' && s.charAt(i) != ')') || (ch == '[' && s.charAt(i) != ']') || (ch == '{' && s.charAt(i) != '}') )

//                 return false;

//                 else
//                 st.pop();
//             }
//            else
//             return false;
//         }
    
 
//  return st.size() == 0;






    }
}
