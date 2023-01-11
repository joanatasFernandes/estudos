package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
    void testeAcessos() {

        Ana sogra = new Ana();
      /*  System.out.println(sogra.segredo);
        System.out.println(sogra.facoDentroDeCasa);
        System.out.println(sogra.formadeFalar);*/
        System.out.println(sogra.todosSabem); // so tem acesso quem está visivel dentro da classe.
    }
}

