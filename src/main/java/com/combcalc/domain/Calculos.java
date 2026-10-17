package com.combcalc.domain;

import java.util.ArrayList;

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

    public static int calcularQuantidadeLetrasUnicas(String palavra){
        int tamanho = 0;
        ArrayList<Character> letras = new ArrayList<>();
        for(int cont = 0; cont < (palavra.length()-1); cont++){
            if(!letras.isEmpty()){
                boolean verify = true;
                for(int cont2 = 0; cont2 < letras.size(); cont2++){
                    if(palavra.toLowerCase().charAt(cont) == letras.get(cont2)){
                        verify = false;
                    }
                }
                if(verify){
                    tamanho++;
                    letras.add(palavra.toLowerCase().charAt(cont));
                }
            } else{
                tamanho++;
                letras.add(palavra.toLowerCase().charAt(cont));
            }
        }
        return tamanho;
    }

    public static int calcularCombinacao(int n, int p){
        return calcularFatorial(n)/calcularFatorial(p) * calcularFatorial(n-p);
    }

    public static int calcularArranjo(int n, int p){
        return Calculos.calcularFatorial(n)/Calculos.calcularFatorial(n-p);
    }
}
