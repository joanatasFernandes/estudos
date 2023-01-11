package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jonathan");
        Aluno aluno2 = new Aluno("Arthur");
        Aluno aluno3 = new Aluno("Luiza");
        Curso curso1 = new Curso("Ciencias da computação");
        Curso curso2 = new Curso("Analise e desenvolvimento");
        Curso curso3 = new Curso("Odontologia");

        curso1.adicionarAlunos(aluno1);
        curso1.adicionarAlunos(aluno2);

        curso2.adicionarAlunos(aluno1);
        curso2.adicionarAlunos(aluno3);

        curso3.adicionarAlunos(aluno1);
        curso3.adicionarAlunos(aluno2);
        curso3.adicionarAlunos(aluno3);

        for (Aluno aluno : curso3.alunos) {
            System.out.println("Estou matriculado no curso..." + curso3.nome + "...");
            System.out.println("...E o meu nome é " + aluno.nome);
            System.out.println();
        }
        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Ciencias da computação");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
