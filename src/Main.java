import java.util.Stack;

class Main{
    public static void main(String[] args) {
        Stack <Integer> stack=new Stack<>();
        stack.push(70);
        stack.push(56);
        stack.push(65);
        stack.push(33);
        stack.push(32);
        stack.push(90);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}