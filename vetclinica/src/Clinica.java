public class Clinica
{
    public Clinica()
    {
        
    }

    public void cadastrarCachorro(Dog c){}
// Adiciona um objeto do tipo Cachorro ao registro de cachorros. Obs: Observe o limite de cadastros.
// Retorna um boolean true se foi possível adicionar e false caso não seja possível.
    public void cadastrarVacina(Vacina v){}
//Adiciona um objeto do tipo Vacina ao registro de vacinas. Obs: Observe o limite de cadastros.
// Retorna um boolean true se foi possível adicionar e false caso não seja possível.
    public void pesquisarCachorro (String name, String tutorName){}
// Realiza a pesquisa de um cachorro, a partir do seunome combinado com o nome do tutor e retorna o objeto Cachorro relacionado.
// Retorna o objeto Cachorro que possui as informações compatíveis, caso não exista, retorna null.
    public void pesquisarVacina(String name){}
// Realiza a pesquisa de uma vacina pelo nome e que não tenha sido aplicada ainda.
// Retorna o objeto Vacina que possui as informações de nome compatível e com a data de aplicação nula, caso não exista, retorna null.
    public void pesquisarTutor(String cpf){}
//Realiza a pesquisa de um tutor pelo cpf.
// Retorna objeto um objeto Pessoa que possui as informações de cpf compatível.
}