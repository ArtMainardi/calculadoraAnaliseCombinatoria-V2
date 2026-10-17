package com.combcalc.ui.calculos;

import com.combcalc.domain.Calculos;
import com.combcalc.ui.Utilidades;

import java.util.ArrayList;

public class FluxoAnagrama implements FluxoCalculo {
    private final Utilidades utilidades;

    public FluxoAnagrama(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
        System.out.println("=== ANAGRAMA ===");
        int qtdLetrasUnicas = Calculos.calcularQuantidadeLetrasUnicas(selecionarPalavra());
        int permutacao = Calculos.calcularPermutacao(qtdLetrasUnicas);
        apresentarDados(qtdLetrasUnicas, permutacao);
    }

    private String selecionarPalavra(){
        System.out.println("Digite uma palavra: ");
        return utilidades.lerTexto();
    }

    private void apresentarDados(int qtdLetrasUnicas, int permutacao){
        System.out.println("\n-> Resultado do cálculo: \n" +
                        "Quantidade de letras únicas: " + qtdLetrasUnicas + "\n" +
                        "Quantidade de anagramas: " + permutacao + "\n"
        );
        utilidades.confirmarParaContinuar();
        utilidades.pularLinhas();
    }
}
