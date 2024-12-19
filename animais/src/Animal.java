public class Animal
{
    private String nome, cor, ambiente;
    private double comprimento, velocidade;
    private int numPatas;

    public Animal(String nome, String cor, String ambiente, double comprimento, double velocidade, int numPatas)
    {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.numPatas = numPatas;
    }

    @Override
    public String toString()
    {
        return "Animal [nome=" + nome + ", cor=" + cor + ", ambiente=" + ambiente + ", comprimento=" + comprimento
                + ", velocidade=" + velocidade + ", numPatas=" + numPatas + "]";
    }
}
