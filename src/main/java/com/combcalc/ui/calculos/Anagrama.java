package com.combcalc.ui.calculos;

import com.combcalc.ui.Utilidades;

public class Anagrama {
    private Utilidades utilidades;

    public Anagrama(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
        mensagemInicial();
    }

    private String mensagemInicial(){
        System.out.println("Digite uma palavra: ");
        return utilidades.getScanner().nextLine();
    }
}
