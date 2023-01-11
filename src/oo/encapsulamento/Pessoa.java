package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobreNome;

    public Pessoa(String nome, String sobreNome, int idade) {
        setIdade(idade);
        setNome(nome);
        setSobreNome(sobreNome);
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getNomeCompleto() {
        return getNome().concat(" " + getSobreNome());
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Ola meu nome e " + getNomeCompleto() + " e tenho " + getIdade() + " anos";
    }
}
