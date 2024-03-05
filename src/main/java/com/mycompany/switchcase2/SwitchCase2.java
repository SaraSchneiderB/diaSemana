/*
Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana
(sendo 1 = domingo, 2 = segunda, assim por diante). Escrever na tela o dia da semana
correspondente, conforme exemplo.
 */
package com.mycompany.switchcase2;

import java.util.Scanner;

public class SwitchCase2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int codigo;
        
        System.out.println("""
                           Podemos agendar sua consulta para qual dia da semana?
                           
                           | 1 | Domingo 
                           | 2 | Segunda-feira 
                           | 3 | Ter\u00e7a-feira 
                           | 4 | Quarta-feira 
                           | 5 | Quinta-feira 
                           | 6 | Sexta-feira 
                           | 7 | Sábado 
                           """);

        System.out.println("Digite o código: \n");
        codigo = teclado.nextInt();

        switch (codigo) {
            case 1 -> System.out.println("Dia da Semana: Domingo!");
            case 2 -> System.out.println("Dia da Semana: Segunda-feira!");
            case 3 -> System.out.println("Dia da Semana: Terça-feira!");
            case 4 -> System.out.println("Dia da Semana: Quarta-feira!");
            case 5 -> System.out.println("Dia da Semana: Quinta-feira!");
            case 6 -> System.out.println("Dia da Semana: Sexta-feira!");
            case 7 -> System.out.println("Dia da Semana: Sábado!");
            default -> System.out.println("404 Error");
        }
        
     {
            
        }
    }
}
