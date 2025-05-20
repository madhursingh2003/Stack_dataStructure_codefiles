//stack implementation using ArrayList in java

package Stack_dataStructure;
import java.util.ArrayList;

public class Stack_arrayList {
    public static class Stack{
//        creating an Arraylist object list
        ArrayList<Integer> list=new ArrayList<>();
//        method to check if an Arraylist is empty or not
        public boolean isEmpty(){
            return list.isEmpty();
        }
//        method to push an element in the list
        public void push(int value){
            list.add(value);
        }
//        method to pop the top element from the list
        public void pop(){
            if(list.isEmpty()){
                System.out.println("list is empty");
                return;
            }
            list.removeLast();
        }
//        method to retrieve the top element from the list
        public int peek(){
            if(list.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return list.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
