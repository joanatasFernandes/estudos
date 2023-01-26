package streams;

import java.util.Objects;

public class Aluno {
    final String nome;
    final double nota;

    final boolean isPresente;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean isPresente) {
        this.nome = nome;
        this.nota = nota;
        this.isPresente = isPresente;
    }

    @Override
    public String toString() {
        return nome + " Tem a nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(aluno.nota, nota) == 0 && isPresente == aluno.isPresente && nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, isPresente);
    }
}
