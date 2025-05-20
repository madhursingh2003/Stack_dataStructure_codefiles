//java program to reverse a stack

package Stack_dataStructure;
import java.util.Stack;

public class ReverseStack {
//    recursive function to reverse a stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(top,s);
    }
//    recursive method to push an element at the bottom of the stack
    public static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("before reversing..."+st);
        reverseStack(st);
        System.out.println("after reversing..."+st);
    }
}
