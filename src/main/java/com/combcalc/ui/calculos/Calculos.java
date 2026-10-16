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
}
