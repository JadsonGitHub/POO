import java.time.LocalDate;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Clinica clinica = new Clinica();
        try (Scanner sc = new Scanner(System.in))
        {
            //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yy");
            int op;
            do {
                System.out.println("\n\t MENU");
                System.out.println("1 - Cadastrar vacina");
                System.out.println("2 - Cadastrar cachorro");
                System.out.println("3 - Aplicar uma vacina");
                System.out.println("4 - Listar vacinas");
                System.out.println("5 - Listar cachorros");
                System.out.println("6 - Encontrar um Dono");
                System.out.println("7 - Limpar Tela");
                System.out.println("8 - Sair \n");
                System.out.print(": "); 
                op = sc.nextInt();
                sc.nextLine();
                System.out.println();
                switch (op)
                {
                    case 1:
                        System.out.print("Nome da vacina: ");
                        String nomeV = sc.next();
                        System.out.print("Lote: ");
                        String lote = sc.next();
                        System.out.print("Data de vencimento (AAAA-MM-DD): ");
                        LocalDate validade = LocalDate.parse(sc.next());
                        //LocalDate validade = LocalDate.parse(sc.next(), dtf);
                        Vacina vacina = new Vacina(nomeV, lote, validade);
                        if (clinica.addVacina(vacina)) System.out.println("\nCadastrada com sucesso!");
                        else System.out.println("Limite atingido.");
                        break;
                    case 2:
                        System.out.print("Nome do Dog: ");
                        String nomeC = sc.next();
                        System.out.print("Raça: ");
                        String raca = sc.next();
                        System.out.print("Cor: ");
                        String cor = sc.next();
                        System.out.print("Sexo (M/F): ");
                        char sexo = sc.next().toLowerCase().charAt(0);
                        System.out.print("Data de nascimento (AAAA-MM-DD): ");
                        LocalDate nacto = LocalDate.parse(sc.next());
                        System.out.print("Peso: ");
                        double peso = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Nome do tutor: ");
                        String nomeT = sc.nextLine();
                        System.out.print("CPF: ");
                        String cpf = sc.next();
                        System.out.print("Telefone: ");
                        String tel = sc.next();
                        Dog cachorro = new Dog(nomeC, raca, cor, sexo, nacto, peso);
                        People tutor = new People(nomeT, cpf, tel);
                        cachorro.setTutor(tutor);
                        if (clinica.addDog(cachorro)) System.out.println("\nCadastrado com sucesso!");
                        else System.out.println("Limite de Dogs atingido");
                        break;
                    case 3:
                        System.out.print("Nome do Dog: ");
                        nomeC = sc.next();
                        System.out.print("Nome do Dono: ");
                        nomeT = sc.next();
                        cachorro = clinica.findDog(nomeC, nomeT);
                        if (cachorro != null)
                        {
                            System.out.print("Nome da vacina: ");
                            nomeV = sc.next();
                            vacina = clinica.findVacina(nomeV);
                            if (vacina != null)
                            {
                                if (cachorro.setVacinas(vacina)) System.out.println("\nVacinado com sucesso!");
                                else System.out.println("Registro Cheio");
                            }
                            else System.out.println("\nVacina nao encontrada ou já aplicada");
                        }
                        else System.out.println("\nDog nao encontrado.");
                        break;
                    case 4:
                        if(clinica.getVacinas().isEmpty()) System.out.println("Vacinas nao Cadastradas");
                        clinica.getVacinas().forEach (System.out :: println);
                        break;
                    case 5:
                        if (clinica.getDogs().isEmpty()) System.out.println("Dogs nao Cadastrados");
                        clinica.getDogs().forEach (System.out :: println);
                        break;
                    case 6:
                        System.out.print("CPF: ");
                        cpf = sc.next();
                        System.out.println();
                        tutor = clinica.findTutor(cpf);
                        if (tutor != null) System.out.println("Tutor: " + tutor);
                        else System.out.println("Dono nao encontrado");
                        break;
                    case 7: People.clearWindow();
                    break;
                    case 8: System.out.println("Programa Finalizado\n");
                    break;
                    default: System.out.println("Opçao Inválida!");
                }
            } while (op != 8);
        }
    }
}