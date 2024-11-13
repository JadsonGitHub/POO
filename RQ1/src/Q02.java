import java.util.Scanner;
//    Questão 02. Uma pesquisa de opinião realizada em Aracaju teve as seguintes perguntas:
//    Qual seu time do coração?
//    1 - Confiança
//    2 - Sergipe
//    3 - Outro.
//    Qual bairro você mora?
//    1 - Pereira Lobo
//    2 - Centro
//    3 - Outro.
//    Qual o seu salário?
//    Considerando que a entrada de dados finaliza quando for digitado 0 para o time. Elabore
//    um algoritmo que, ao final da leitura, imprima:
//    a) O número de torcedores por clube;
//    b) A média salarial dos torcedores do Confiança;
//    c) O número de pessoas moradoras do Centro, torcedores de outros clubes.
public class Q02
{
    public static void main(String[] args)
    {
        int confianca = 0, sergipe = 0, outroTime = 0, pereira = 0, centro = 0, outroBairro = 0;
        int moradoresCentro = 0;
        double mediaSalarial = 0;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println();
            System.out.println("Qual seu time do coraçao?");
            System.out.println();
            System.out.println(" 1 - Confiança");
            System.out.println(" 2 - Sergipe");
            System.out.println(" 3 - Outros");
            System.out.println(" 0 - Para parar");
            System.out.println();
            System.out.print("Opçao: ");
            int time = sc.nextInt();
            if (time == 0) break;
            switch (time)
            {
                case 1:
                    confianca++;
                    break;
                case 2:
                    sergipe++;
                    break;
                case 3:
                    outroTime++;
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.println("Qual bairro você mora?");
            System.out.println();
            System.out.println(" 1 - Pereira Lobo");
            System.out.println(" 2 - Centro");
            System.out.println(" 3 - Outros");
            System.out.println();
            System.out.print("Opçao: ");
            int bairro = sc.nextInt();
            switch (bairro)
            {
                case 1:
                    pereira++;
                    break;
                case 2:
                    centro++;
                    if (time ==3) moradoresCentro++;
                    break;
                case 3:
                    outroBairro++;
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.print("Qual o seu salário? : ");
            double salario = sc.nextDouble();
            if (time == 1) mediaSalarial += salario;
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        System.out.println();
        System.out.println("Torcedores do Confianca: " + confianca);
        System.out.println("Torcedores do Sergipe:   " + sergipe);
        System.out.println("Torcedores de Outros:    " + outroTime);
        System.out.println();
        System.out.println("Media salarial dos torcedores do confiança: " + mediaSalarial/confianca);
        System.out.println("Moradores do centro, que torcem para outros times: " + moradoresCentro);
        System.out.println();
    }
}