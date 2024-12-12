public class Pessoa
{
    private String name, cpf, tel;

    public Pessoa(String name, String cpf, String tel)
    {
            this.name = name;
            this.cpf = cpf;
            this.tel = tel;
    }

    @Override
    public String toString()
    {
        return "Pessoa [Nome =" + name + ", CPF =" + cpf + ", Tel =" + tel + "]";
    }    
}
