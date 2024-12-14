import java.time.LocalDate;
import java.util.ArrayList;

public class Dog
{
    private String dogName, race, cor;
    private char sexo;
    private LocalDate nacto;
    private double peso;
    private People tutor;
    private final int MAXVAC = 30;
    private ArrayList <Vacina> vacinas;

    public Dog(String nome, String race, String cor, char sexo, LocalDate nacto)
    {        
        this(nome, race, cor, sexo, nacto, 0);
    }
    public Dog(String nome, String race, String cor, char sexo, LocalDate nacto, double peso)
    {
        this.dogName = nome;
        this.race = race;
        this.cor = cor;
        this.sexo = sexo;
        this.nacto = nacto;
        this.peso = peso;
        this.vacinas = new ArrayList <> ();
    }
    public boolean setVacina(Vacina v) 
    {
        if (vacinas.size() < MAXVAC)
        {
            v.vacinar();
            vacinas.add(v);
            return true;
        }
        return false;
    }

    public void setTutor (People tutor) { this.tutor = tutor;}

    public People getTutor () { return tutor;}

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome:\n · ").append(dogName)
          .append(", Raça: ").append(race)
          .append(", Cor: ").append(cor)
          .append(", Sexo: ").append(sexo)
          .append(", Nascimento: ").append(nacto)
          .append(", Peso: ").append(peso)
          .append("\n")
          .append("Tutor:\n · ")
          .append(tutor != null ? tutor.toString() : "Cao sem Dono")
          .append("\n")
          .append("Vacinas: ");
          //.append(vacinas != null && !vacinas.isEmpty() ? vacinas.toString() : "Nao Vacinado")
          //.append("\n");
        if (vacinas != null && !vacinas.isEmpty())
        {
            for (Vacina v : vacinas) sb.append("\n · ").append(v.toString()).append("\n");
        }
        else sb.append("\n · Nao Vacinado \n");
        return sb.toString();
    }
}