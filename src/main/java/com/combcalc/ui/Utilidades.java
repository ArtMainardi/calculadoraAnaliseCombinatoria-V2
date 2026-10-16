package com.combcalc.ui;

import com.combcalc.exception.NumeroInvalidoException;

import java.util.Scanner;

public class Utilidades {
    private final Scanner sc;

    public Utilidades(Scanner sc){
        this.sc = sc;
    }

    public void confirmarParaContinuar(){
        System.out.print("\n" + "Pressione 'ENTER' para continuar: ");
        sc.nextLine();
        pularLinhas();
    }

    public int lerNumero(){
        return Integer.parseInt(sc.nextLine().trim());
    }

    public int lerNumeroPositivo() throws NumeroInvalidoException{
        int numero = Integer.parseInt(sc.nextLine().trim());
        if(numero < 0){
            throw new NumeroInvalidoException("o número digitado não pode ser negativo!");
        }
        return numero;
    }

    public String lerTexto(){
        return sc.nextLine().trim();
    }

    public void pularLinhas(){
        System.out.println("\n");
    }
}