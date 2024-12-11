public class Professor
{
    public String matricula, nome, cpf, adimissao, email;
    public Curso lotacao;

    public void setLotacao(Curso curso)
    {
        this.lotacao = curso;
    }

    public void imprimir()
    {
        System.out.println(lotacao);
    }
}