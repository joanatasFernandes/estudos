package oo.heranca;

public class Jogador {
    int life = 100;
    int x;
    int y;

    boolean attack(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.life -= 10;
            return true;

        } else if (deltaX == 1 && deltaY == 0) {
            oponente.life -= 10;

            return true;
        }
        return false;
    }


    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> y--;

            case LESTE -> x++;

            case SUL -> y++;

            case OESTE -> x--;

        }
        return true;
    }
}
