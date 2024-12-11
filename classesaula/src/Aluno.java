public class Aluno
{
    public String matricula, nome, cpf, email;
    public Curso[] cursos;

    public void matricular(Curso curso)
    {
        for (int i = 0; i < this.cursos.length; i++)
        {
            if (this.cursos[i] == null)
            {
                this.cursos[i] = curso;
                break;
            }
        }
    }

    public void imprimir()
    {
        for (Curso curso : this.cursos) System.out.println(curso);
    }
}