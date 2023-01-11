package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    /*Ana mae = new Ana();*/
    void testeAcessos() {
        /*System.out.println(mae.facoDentroDeCasa);*/
        System.out.println(formadeFalar);// acessando via herança.
        System.out.println(todosSabem);
    }
}
