package oo.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();

    void testeAcessos() {
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formadeFalar);
        System.out.println(esposa.todosSabem);
    }
}
