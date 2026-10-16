package com.combcalc.ui.calculos;

import com.combcalc.ui.Utilidades;

public class FluxoCombinacao implements FluxoCalculo {
    private final Utilidades utilidades;

    public FluxoCombinacao(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
        Integer numeroTotalDeElementos = null, numeroDeElementosParaACombinacao = null;
        System.out.println("=== COMBINAÇÃO ===");

        numeroTotalDeElementos = selecionarValor("Digite o valor de 'n' (número total de elementos do conjunto): ",
                numeroTotalDeElementos, numeroDeElementosParaACombinacao);

        numeroDeElementosParaACombinacao = selecionarValor("Digite o valor de 'p' (número de elementos escolhidos para a combinação): ",
                numeroTotalDeElementos, numeroDeElementosParaACombinacao);

        printarFormula(numeroTotalDeElementos, numeroDeElementosParaACombinacao);
        int arranjo = calcularCombinacao(numeroTotalDeElementos, numeroDeElementosParaACombinacao);
        apresentarDados(numeroTotalDeElementos, numeroDeElementosParaACombinacao, arranjo);
    }

    private void printarFormula(Integer n, Integer p){
        System.out.println("[    C(" + (n != null ? n : "n") + ", " + (p != null ? p : "p") + ") = " + (n != null ? n : "n")
                + "!/" + (p != null ? p : "p") +"!(" + (n != null ? n : "n") + " - " + (p != null ? p : "p") + ")!    ]");
    }

    private int selecionarValor(String frase, Integer n, Integer p){
        printarFormula(n, p);
        System.out.println(frase);
        int numero = utilidades.lerNumero();
        utilidades.pularLinhas();
        return numero;
    }

    private int calcularCombinacao(int n, int p){
        return Calculos.calcularFatorial(n)/Calculos.calcularFatorial(p) * Calculos.calcularFatorial(n-p);
    }

    private void apresentarDados(int n, int p, int combinacao){
        System.out.println("-> Resultado do cálculo: \n" +
                        "Valor da combinação C(" + n + ", " + p + "): " + combinacao
        );
        utilidades.confirmarParaContinuar();
        utilidades.pularLinhas();
    }
}
