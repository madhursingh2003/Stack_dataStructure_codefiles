//implementation of Stack using LinkedList

package Stack_dataStructure;

public class Stack_LinkedList {
//    declaration of stack class
    public static class Stack{
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        Node head=null;
//        method to check if a Stack is empty or not
        public boolean isEmpty(){
            return head==null;
        }
//        method to push an element in the stack
        public void push(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }
//        method to pop an element from the stack
        public int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
//        method to peek the top element from the stack
        public int peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        System.out.println(s.peek());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
