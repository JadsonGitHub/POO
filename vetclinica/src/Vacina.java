
import java.time.LocalDate;

public class Vacina
{
    private String vacinaName, lote;
    private LocalDate vencimento, aplicacao;

    public Vacina(String nome, String lote, LocalDate vencimento)
    {
        this.vacinaName = nome;
        this.lote = lote;
        this.vencimento = vencimento;
    }

    @Override
    public String toString()
    {
        return "Vacina [Nome da Vacina =" + vacinaName + ", Lote =" + lote + ", Vencimento =" + vencimento + "]";
    }
    
}