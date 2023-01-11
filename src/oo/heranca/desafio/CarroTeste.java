package oo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Civic carro = new Civic();
        Carro ferrari = new Ferrari();


        carro.acelerar();
        System.out.println(carro);

        carro.acelerar();
        System.out.println(carro);

        ferrari.acelerar();
        System.out.println(ferrari);

        carro.frear();
        System.out.println(carro);

        //
        Ferrari c2 = new Ferrari();
        c2.acelerar();
        c2.ligarTurbo();
        System.out.println(c2);
        System.out.println();
        //ferrari.frear();
        System.out.println(ferrari);
    }
}
