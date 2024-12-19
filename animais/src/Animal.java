public class Animal
{
    private String nome, cor, ambiente;
    private double comprimento, velocidade;
    private int patas;

    public Animal(String nome, String cor, String ambiente, double comprimento, double velocidade, int patas)
    {
        this.cor = cor;
        this.nome = nome;
        this.patas = patas;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
        this.comprimento = comprimento;
    }

    @Override
    public String toString()
    {
        return "Animal: " + nome + ", Cor: " + cor + ", Habitat: " + ambiente + ", Tamanho: " + comprimento + ", Velocidade: " + velocidade + ", Patas: " + patas;
    }
}