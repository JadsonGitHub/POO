public class Mamifero extends Animal
{
    private String alimento;

    public Mamifero(String nome, String cor, String ambiente, double comprimento, double velocidade, int patas, String alimento)
    {
        super(nome, cor, ambiente, comprimento, velocidade, patas);
        this.alimento = alimento;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nAlimento: " + alimento;
    }
}