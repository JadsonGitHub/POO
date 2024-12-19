public class Peixe extends Animal
{
    private String caracteristica;

    public Peixe(String nome, String cor, String ambiente, double comprimento, double velocidade, int patas, String caracteristica)
    {
        super(nome, cor, ambiente, comprimento, velocidade, patas);
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nCaracteristicas: " + caracteristica;
    }
}