import java.util.Scanner;
//      Questão 01. O Banco X concederá um crédito especial com juros de 2% aos seus clientes
//      de acordo com o saldo médio no último ano. Fazer um programa que leia o saldo médio de
//      um cliente e calcule o valor do crédito de acordo com a tabela a seguir. Imprimir uma
//      mensagem informando o saldo médio e o valor de crédito.
//        SALDO MEDIO      |           PERCENTUAL
//      ___________________|_______________________________
//      De 0000 a 0500     |         Nenhum credito
//      De 0501 a 1000     |    30% do valor do saldo medio
//      De 1001 a 3000     |    40% do valor do saldo medio
//      De 3001 a mais     |    50% do valor do saldo medio
public class Q01
{
    public static void main(String[] args)
    {        
        int saldoMedio;
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println();
            System.out.print("Digite seu saldo medio: ");
            saldoMedio = sc.nextInt();
            System.out.println();
        }
        if (saldoMedio <= 500)
        {
            System.out.println("Saldo medio: " + saldoMedio);
            System.out.println();
            System.out.println("Valor de credito: ZERO!");
            System.out.println();
        }
        if (saldoMedio > 500 && saldoMedio <= 1000)
        {
            System.out.println("Saldo medio: " + saldoMedio);
            System.out.println();
            System.out.println("Valor de credito: " + saldoMedio*0.3);
            System.out.println();
        }
        if (saldoMedio > 1000 && saldoMedio <= 3000)
        {
            System.out.println("Saldo medio: " + saldoMedio);
            System.out.println();
            System.out.println("Valor de credito: " + saldoMedio*0.4);
            System.out.println();
        }
        if (saldoMedio > 3000)
        {
            System.out.println("Saldo medio: " + saldoMedio);
            System.out.println();
            System.out.println("Valor de credito: " + saldoMedio*0.5);
            System.out.println();
        }
    }
}