package com.combcalc.ui.calculos;

import com.combcalc.ui.Utilidades;

import java.util.ArrayList;

public class Anagrama {
    private Utilidades utilidades;

    public Anagrama(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
        System.out.println("=== ANAGRAMA ===");
        int qtdLetrasUnicas = calcularQuantidadeLetrasUnicas(selecionarPalavra());
        int permutacao = calcularPermutacao(qtdLetrasUnicas);
    }

    private String selecionarPalavra(){
        System.out.println("Digite uma palavra: ");
        return utilidades.lerTexto();
    }

    private int calcularQuantidadeLetrasUnicas(String palavra){
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

    private int calcularPermutacao(int tamanho){
        int permutacao = tamanho;
        while((tamanho-1) != 0){
            tamanho--;
            permutacao *= tamanho;
        }
        return permutacao;
    }
}
