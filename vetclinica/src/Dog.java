
import java.time.LocalDate;

public class Dog
{
    private String dogName, race, cor;
    private char sexo;
    private LocalDate nacto;
    private double peso;
    private Vacina[] registro = new Vacina[30];

    public Dog(String nome, String race, String cor, char sexo, LocalDate nacto)
    {
        this.dogName = nome;
        this.race = race;
        this.cor = cor;
        this.sexo = sexo;
        this.nacto = nacto;
    }
    public Dog(String nome, String race, String cor, char sexo, LocalDate nascimento, int peso)
    {
        this(nome, race, cor, sexo, nascimento);
        this.peso = peso;
    }
    public boolean cadastrarVacina (Vacina v)
    {
        for (int i = 0; i < this.registro.length; i++)
        {
            if (this.registro[i] == null)
            {
                this.registro[i] = v;
                return true;
            }
        }
        return false;
    }
}