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
import java.util.Stack;
public class Stack_Library {
    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack<>();

        // Push elemen ke stack
        Stack.push(20);
        System.out.println("Pushed: 20");
        Stack.push(40);
        System.out.println("Pushed: 40");
        Stack.push(60);
        System.out.println("Pushed: 60");

        // Lihat elemen paling atas
        System.out.println("Top item: " + Stack.peek());

        // Pop elemen dari stack
        System.out.println("Popped: " + Stack.pop());
        System.out.println("Popped: " + Stack.pop());
        System.out.println("Popped: " + Stack.pop());

        // Coba pop dari stack kosong
        if (Stack.isEmpty()) {
            System.out.println("Stack kosong. Tidak dapat pop.");
        } else {
            System.out.println("Popped: " + Stack.pop());
        }
    }
}
    
      