package org.example;

import java.util.LinkedList;

public class StackUsingQueue {
    private LinkedList<Integer> q1;
    public StackUsingQueue(){
        q1 = new LinkedList<>();
    }

    public void push(int x){
        q1.add(x);
        int size = q1.size();
        while(size>1){
            q1.add(q1.remove());
            size--;
        }
    }

    public int pop(){
        return q1.remove();
    }

    public int top(){
        return q1.peek();
    }

    public boolean isEmpty(){
        return q1.isEmpty();
    }

    private int size() {
        return q1.size();
    }

    public static void main(String args[]){
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(5);
        System.out.println("Stack push: "+stack.top() );
        stack.push(7);
        System.out.println("Stack push: "+stack.top() );
        stack.push(9);
        System.out.println("Stack size: "+stack.size());
        System.out.println("Stack pop: "+stack.pop() );
        stack.top();
        System.out.println("Stack top: "+stack.top() );
        stack.isEmpty();
        System.out.println("Stack is Empty: "+ stack.isEmpty() );

    }


}
