public class People
{
    private String name, cpf, tel;

    public People(String name, String cpf, String tel)
    {
            this.name = name;
            this.cpf = cpf;
            this.tel = tel;
    }

    public String getCpf() { return cpf;}

    public static void clearWindow ()
    {
        System.out.print ("\033[H\033[2J");
        System.out.flush ();
    }

    @Override
    public String toString()
    {
        return name + ", CPF: " + cpf + ", Telefone: " + tel;
    }
}