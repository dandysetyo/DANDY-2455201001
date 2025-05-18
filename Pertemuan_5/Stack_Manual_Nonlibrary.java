/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_5;

/**
 *
 * @author setyo
 */
public class Stack_Manual_Nonlibrary {
    private final int maxSize;                  
    private int top;                            
    private final int[] stackArray;             
    public Stack_Manual_Nonlibrary(int size) {
        maxSize = size;                          
        stackArray = new int[maxSize];           
        top = -1;                                
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value; 
            System.out.println(value + " pushed to stack");
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1; 
        } else {
            return stackArray[top--]; 
        }
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek");
            return -1; 
        } else {
            return stackArray[top]; 
        }
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //  Gunakan nama kelas yang sesuai
        Stack_Manual_Nonlibrary stack = new Stack_Manual_Nonlibrary(5); 

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); 
        stack.display();
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.display();
    }
}

