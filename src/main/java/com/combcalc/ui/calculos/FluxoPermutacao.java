package com.combcalc.ui.calculos;

import com.combcalc.ui.Utilidades;

import java.util.ArrayList;

public class FluxoPermutacao implements FluxoCalculo {
    private final Utilidades utilidades;

    public FluxoPermutacao(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
        System.out.println("=== PERMUTAÇÃO ===");
        int numero = selecionarNumero();
        int permutacao = Calculos.calcularPermutacao(numero);
        apresentarDados(numero, permutacao);
    }

    private int selecionarNumero(){
        System.out.println("Digite o número do qual deseja fazer a permutação: ");
        return utilidades.lerNumero();
    }

    private void apresentarDados(int numero, int permutacao){
        System.out.println("\n-> Resultado do cálculo: \n" +
                        "Permutação do número " + numero + ": " + permutacao
        );
        utilidades.confirmarParaContinuar();
        utilidades.pularLinhas();
    }
}
