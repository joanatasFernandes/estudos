package oo.heranca;

public class Heroi extends Jogador {
    boolean attack(Jogador oponente) {

        boolean attack1 = super.attack(oponente);
        boolean attack2 = super.attack(oponente);
        boolean attack3 = super.attack(oponente);

        return attack1 || attack2 || attack3;
    }
}
