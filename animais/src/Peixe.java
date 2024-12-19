public class Peixe extends Animal
{
    private String caracteristica;

    public Peixe(String nome, String cor, String ambiente, double comprimento, double velocidade, int numPatas, String caracteristica)
    {
        super(nome, cor, ambiente, comprimento, velocidade, numPatas);
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString()
    {
        return "Peixe [caracteristica=" + caracteristica + ", toString()=" + super.toString() + "]";
    }
}
