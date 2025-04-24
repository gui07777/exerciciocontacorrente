package exercicio.pkg23.pkg04;

import java.util.Scanner;

public class Contacorrente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Informe o número da conta corrente: ");
        int contaCorrente = scanner.nextInt();

        System.out.print("Informe o número da Agência Bancária: ");
        int agencia = scanner.nextInt();

        System.out.print("Informe o seu saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("\n------- DADOS DO CLIENTE -------");
        System.out.println("Sr(a): " + nomeCliente);
        System.out.println("Número da Conta Corrente: " + contaCorrente);
        System.out.println("Número da Agência Bancária: " + agencia);
        System.out.printf("Valor do saldo atual é de: R$ %.2f\n", saldo); 

        scanner.close(); 
    }
}
