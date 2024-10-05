package com.projetos;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        
       
        if (pertenceFibonacci(numero)) {
            System.out.println("o número " + numero + " Pertence à sequência de Fibonacci.");
        } else {
            System.out.println("o número " + numero + " nao pertence à sequência de Fibonacci.");
        }
        
     
        scanner.close();
    }

    public static boolean pertenceFibonacci(int num) {
        int a = 0, b = 1; 
        if (num == a || num == b) return true; 

        int c = a + b; 
        while (c <= num) {
            if (c == num) return true; 
            a = b; 
            b = c;
            c = a + b;
        }
        
        return false; 
    }
}

