import java.util.ArrayList;

public class Clinica
{
    private ArrayList <Dog> dogs = new ArrayList <> ();
    private ArrayList <Vacina> vacinas = new ArrayList <> ();
    private final int MAXDOG = 30;
    private final int MAXVAC = 30;
    
    public Clinica()
    {
        this.dogs = new ArrayList<>();
        this.vacinas = new ArrayList<>();
    }
    public boolean addDog(Dog c)
    {
        if(dogs.size() < MAXDOG)
        {
            dogs.add(c);
            return true;
        }
        return false;
    }
    public boolean addVacina(Vacina v)
    {
        if(vacinas.size() < MAXVAC)
        {
            vacinas.add(v);
            return true;
        }
        return false;
    }
    public Dog findDog (String name, String tutorName)
    {
        for (Dog dog : dogs)
        {
            if(dog.toString().contains(name) && dog.toString().contains(tutorName))
            {
                return dog;
            }
        }
        return null;
    }
    public Vacina findVacina(String name)
    {
        for (Vacina vacina : vacinas)
        {
            if(vacina.toString().contains(name) && !vacina.toString().contains("Aplicacao"))
            {
                return vacina;
            }
        }
        return null;
    }
    public People findTutor(String cpf)
    {
        for (Dog dog : dogs)
        {
            People tutor = dog.getTutor();
            if (tutor != null && tutor.getCpf().equals(cpf)) return tutor;
        }
        return null;
    }

    public ArrayList <Dog> getDogs () { return dogs;}

    public ArrayList <Vacina> getVacinas () { return vacinas;}

}