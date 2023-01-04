package oo.heranca.desafio;

public class Ferrari extends Carro {

    @Override
    void acelerar() {
        super.acelerar();

        if (velocidadeAtual >= 0) {
            velocidadeAtual += 15;
        }
    }
}
