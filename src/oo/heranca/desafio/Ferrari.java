package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {

    private boolean ligarTurbo;
    private boolean ligaAr;

    public Ferrari() {
        super(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    void acelerar() {
        super.acelerar();

        if (velocidadeAtual >= 0) {
            velocidadeAtual += 15;
        }
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligaAr = false;
    }

    @Override
    public void ligaAr() {
        ligaAr = true;
    }

    @Override
    public void desligarAr() {
        ligaAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligaAr) {
            return 35;
        } else if (ligarTurbo && ligaAr) {
            return 30;
        } else if (!ligarTurbo && !ligaAr) {
            return 20;
        } else {
            return 15;
        }
    }
}
