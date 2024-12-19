public class Mamifero extends Animal
{
    private String alimento;

    public Mamifero(String alimento, String nome, String cor, String ambiente, double comprimento, double velocidade, int numPatas)
    {
        super(nome, cor, ambiente, comprimento, velocidade, numPatas);
        this.alimento = alimento;
    }

    @Override
    public String toString()
    {
        return "Mamifero [alimento=" + alimento + ", toString()=" + super.toString() + "]";
    }


}
