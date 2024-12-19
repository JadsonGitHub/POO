import java.util.Scanner;
//    Questão 03. Elabore um programa que leia a idade e o estado civil (C-casado, S-solteiro,
//    V-viúvo e D-desquitado/separado) de várias pessoas. Considere que o programa termina de
//    receber entradas quando se digita a idade zero (0). Ao final, calcule e imprima:
//    a) A quantidade e pessoas casadas
//    b) A quantidade de pessoas solteiras
//    c) A média das idades das pessoas viúvas;
//    d) A porcentagem de pessoas desquitadas ou separadas, dentre todas as pessoas analisadas.
public class Q03
{
    public static void main(String[] args)
    {
        int idadeViuvo = 0, qtdCasado = 0, qtdSolteiro = 0, qtdViuvo = 0, qtdDesktd = 0, total = 0;
        
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println();
            System.out.println("Qual a sua idade? (0 - para parar)");
            System.out.print("> ");
            int age = sc.nextInt();
            if (age == 0) break;
            total++;            
            System.out.println();
            System.out.println("Qual seu estado civil?");
            System.out.println("    C - casado");
            System.out.println("    S - solteiro");
            System.out.println("    V - viúvo");
            System.out.println("    D - desquitado/separado");
            System.out.print("> ");
            String estCivil = sc.next().toLowerCase(); 
            System.out.println();
            if(estCivil.equals("c"))    qtdCasado++;
            if(estCivil.equals("s"))    qtdSolteiro++;
            if(estCivil.equals("d"))    qtdDesktd++;
            if(estCivil.equals("v"))
            {
                qtdViuvo++;
                idadeViuvo += age;
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        System.out.println();
        System.out.println(" " + qtdCasado + " pessoas casadas");
        System.out.println(" " + qtdSolteiro + " pessoas solteiras");
        if (qtdViuvo == 0) System.out.println (" Nao houveram pessoas viuvas");
        else System.out.println(" Medias da idade das pessoas viuvas: " + idadeViuvo/qtdViuvo);
        System.out.println(" " + qtdDesktd/total*100 + "% de pessoas desquitadas/separadas");
        System.out.println();
    }
}
