package com.combcalc.ui.calculos;

public class Calculos {
    public static int calcularPermutacao(int tamanho){
        int permutacao = tamanho;
        while((tamanho-1) != 0){
            tamanho--;
            permutacao *= tamanho;
        }
        return permutacao;
    }

    public static int calcularFatorial(int numero){
        int fatoriacao = 1;
        for(int cont = 1; cont <= numero; cont++){
            fatoriacao *= cont;
        }
        return fatoriacao;
    }
}
