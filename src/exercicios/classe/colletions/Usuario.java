package exercicios.classe.colletions;

import java.util.Objects;

public class Usuario {

/*
    public int hasCode(){
        final  int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
*/

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }*/

    @Override
    public boolean equals(Object obj) {
        Usuario outroUsuario  = (Usuario)  obj;
        return this.nome.equals(outroUsuario.nome);
    }

    /*   @Override
    public int hashCode() {
        return Objects.hash(nome);
    }*/

    @Override
    public int hashCode() {
        return 0;
    }

    Usuario(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Meu nome é: " + this.nome + ".";
    }
    String nome;
}
