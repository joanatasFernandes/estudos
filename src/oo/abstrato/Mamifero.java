package oo.abstrato;

public abstract class Mamifero extends Animal {

    public String mamar() {
        return null;
    }

    @Override
    public String mover() {
        return "Saindo do lugar";
    }
}
