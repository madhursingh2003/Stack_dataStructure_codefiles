//program to reverse a string using stack

package Stack_dataStructure;
import java.util.Stack;


public class ReverseString {
//    method to reverse a string
    public static String reverse(String s){
        Stack<Character> st=new Stack<>();
        int idx=0;
        while (idx < s.length()) {
            st.push(s.charAt(idx));
            idx++;
        }
//        initializing an empty StringBuilder
        StringBuilder sb=new StringBuilder();
//        pop character one by one
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
//        converting StringBuilder to String
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println("string before...");
        System.out.println(s);
        System.out.println("string after...");
        System.out.println(reverse(s));
    }
}
