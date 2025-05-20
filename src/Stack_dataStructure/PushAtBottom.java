//program to push an element at the bottom of the stack
package Stack_dataStructure;
import java.util.Stack;
//recursive function to push the element at the bottom of the stack
public class PushAtBottom {
    public void fun(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
//        pop the top element
        int top=s.pop();
//        calling function again
        fun(data,s);
//        pushing top again in the stack
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("before inserting...");
        System.out.println(s);
        PushAtBottom obj=new PushAtBottom();
        System.out.println("after inserting at the bottom...");
        obj.fun(4,s);
        System.out.println(s);
    }
}
