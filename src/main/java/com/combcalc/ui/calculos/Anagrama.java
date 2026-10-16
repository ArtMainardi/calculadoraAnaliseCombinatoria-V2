package com.combcalc.ui.calculos;

import com.combcalc.ui.Utilidades;

public class Anagrama {
    private Utilidades utilidades;

    public Anagrama(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
        System.out.println("=== ANAGRAMA ===");
        selecionarPalavra();
    }

    private String selecionarPalavra(){
        System.out.println("Digite uma palavra: ");
        return utilidades.lerTexto();
    }
}
