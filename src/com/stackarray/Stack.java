package com.stackarray;

public class Stack {

    int[] stack = new int[5];
    int top=-1;


    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return  top==stack.length-1;
    }

   public boolean Push (int data) throws Exception {
        if(isFull()){
            throw new Exception("Stack Overflow");
        }


       top++;
       stack[top] = data;

       return true;
   }
   public int  pop () throws Exception{
             if (isEmpty()){
                 throw new Exception("Stack Underflow");
             }
             int removed = stack[top];
             top--;
        return removed;
   }
   public void print(){
//       for(int n:stack){
//           System.out.println(n+"");
//       }


       for(int i=0;i<=top;i++){
           System.out.println(stack[i]);
       }
   }

}
class  main{
    public static void main(String[] args) throws Exception{
        Stack stack = new Stack();
        stack.Push(89);
        stack.Push(10);
        stack.Push(15);
        stack.Push(76);
        stack.Push(40);

        System.out.println(stack.pop());

        System.out.println();

        stack.print();

    }
}
