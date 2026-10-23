package com.combcalc.ui.calculos;

import com.combcalc.domain.Calculos;
import com.combcalc.exception.NumeroInvalidoException;
import com.combcalc.ui.Utilidades;

public class FluxoArranjo implements FluxoCalculo {
    private final Utilidades utilidades;

    public FluxoArranjo(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
        Integer numeroTotalDeElementos = null, numeroDeElementosParaOArranjo = null;
        System.out.println("=== ARRANJO ===");
        int arranjo;

        try{
            numeroTotalDeElementos = selecionarValor("Digite o valor de 'n' (número total de elementos do conjunto): ",
                    numeroTotalDeElementos, numeroDeElementosParaOArranjo);
            numeroDeElementosParaOArranjo = selecionarValor("Digite o 'p' (número de elementos escolhidos para cada arranjo): ",
                    numeroTotalDeElementos, numeroDeElementosParaOArranjo);
            arranjo = Calculos.calcularArranjo(numeroTotalDeElementos, numeroDeElementosParaOArranjo);
        } catch (NumberFormatException | NumeroInvalidoException e){
            System.out.println("ERRO: " + e.getMessage());
            utilidades.confirmarParaContinuar();
            return;
        }

        printarFormula(numeroTotalDeElementos, numeroDeElementosParaOArranjo);
        apresentarDados(numeroTotalDeElementos, numeroDeElementosParaOArranjo, arranjo);
    }

    private void printarFormula(Integer n, Integer p){
        System.out.println("[    A(" + (n != null ? n : "n") + ", " + (p != null ? p : "p") + ") = " + (n != null ? n : "n")
                + "!/(" + (n != null ? n : "n") + " - " + (p != null ? p : "p") + ")!    ]");
    }

    private int selecionarValor(String frase, Integer n, Integer p) throws NumeroInvalidoException {
        printarFormula(n, p);
        System.out.println(frase);
        int numero = utilidades.lerNumeroPositivo();
        utilidades.pularLinhas();
        return numero;
    }

    private void apresentarDados(int n, int p, int arranjo){
        System.out.println("-> Resultado do cálculo: \n" +
                        "Valor do arranjo A(" + n + ", " + p + "): " + arranjo
        );
        utilidades.confirmarParaContinuar();
        utilidades.pularLinhas();
    }
}
