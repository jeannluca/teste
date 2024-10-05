package com.projetos;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();
        
      
        String inverted = inverterString(input);
        
        
        System.out.println("String invertida: " + inverted);
        
        
        scanner.close();
    }

    
    public static String inverterString(String str) {
        String resultado = "";
        
        
        for (int i = str.length() - 1; i >= 0; i--) {
            resultado += str.charAt(i); 
        }
        
        return resultado; 
    }
}
