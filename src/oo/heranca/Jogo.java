package oo.heranca;

public class Jogo {
    public static void main(String[] args) {


        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 10;

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 11;

/*        player1.andar(Direcao.NORTE);
        player1.andar(Direcao.LESTE);
        player1.andar(Direcao.NORTE);
        player1.andar(Direcao.LESTE);*/

        System.out.println("Heroi tem :" + heroi.life + " vidas");
        System.out.println("Monstro tem :" + monstro.life + " vidas");
        System.out.println("Heroi tem :" + heroi.life + " vidas");


        monstro.attack(heroi);
        heroi.attack(monstro);

        System.out.println("Heroi tem :" + heroi.life + " vidas");
        System.out.println("Monstro tem :" + monstro.life + " vidas");
    }
}
