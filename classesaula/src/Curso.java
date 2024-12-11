public class Curso
{
    public String codigo, nome, descricao;
    public Professor coordenador;
    public Professor[] docentes;

    public void definirCoordenador(Professor coordenador)
    {
        this.coordenador = coordenador;
    }

    public void addDocente(Professor professor)
    {
        for (int i = 0; i < this.docentes.length; i++)
        {
            if (this.docentes[i] == null)
            {
                this.docentes[i] = professor;
                break;
            }
        }
    }

    public void imprimir()
    {
        for (Professor docente : this.docentes) System.out.println(docente);
    }
}