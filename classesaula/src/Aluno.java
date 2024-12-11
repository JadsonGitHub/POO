public class Aluno
{
    public String matricula, nome, cpf, email;
    public Curso[] cursos;

    public void matricular(Curso curso)
    {
        //this.curso = curso;
    }

    public void imprimir()
    {
        for (Curso curso : this.cursos) System.out.println(curso);
    }
}