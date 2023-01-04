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

        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.frear();
        System.out.println(ferrari);
    }
}
