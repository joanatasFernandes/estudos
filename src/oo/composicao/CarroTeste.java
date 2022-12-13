package oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro citroem = new Carro();
        System.out.println(citroem.estaLigado());

        citroem.ligar();
        System.out.println(citroem.estaLigado());

        System.out.println(citroem.motor.giros());

        citroem.acelerar();
        citroem.acelerar();
        citroem.acelerar();
        citroem.acelerar();

        System.out.println(citroem.motor.giros());

        citroem.frear();
        citroem.frear();
        citroem.frear();
        citroem.frear();
        /* Faltou Encapsulamento;
        citroem.motor.fatorInjecao = -30;*/

        System.out.println(citroem.motor.giros());

        // Relação bidirecional
        System.out.println(citroem.motor.carro.motor.carro.motor.giros());
    }
}
