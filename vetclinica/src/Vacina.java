import java.time.LocalDate;

public class Vacina
{
    private final String vacName, lote;
    private final LocalDate validade;
    private LocalDate aplicacao;

    public Vacina(String nome, String lote, LocalDate validade)
    {
        this.vacName = nome;
        this.lote = lote;
        this.validade = validade;
        this.aplicacao = null;
    }
    public void vacinar () { this.aplicacao = LocalDate.now();}

    @Override
    public String toString()
    {
        return "Vacina: " + vacName + ", Lote: " + lote + ", Validade: " + validade + (aplicacao != null ? ", Aplicacao: " + aplicacao : "");
    }
}