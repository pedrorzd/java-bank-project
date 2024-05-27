import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // espaço para colocar variáveis//
        int option = 0;
        double currentBalance, savingsBalance;
        String clientName, accountCurrentNumber, savingsAccountNumber;

        // espaço de Scanner NAO MISTURAR
        Scanner inputClientName = new Scanner(System.in);
        Scanner inputAccountCurrentNumber = new Scanner(System.in);
        Scanner inputSavingsAccountNumber = new Scanner(System.in);
        Scanner inputCurrentBalance = new Scanner(System.in);
        Scanner inputSavingsBalance = new Scanner(System.in);
        Scanner inputOption = new Scanner(System.in);

        System.out.println(
                "Olá bem vindo ao nosso sistema bancário, para dar início ao serviço, insira os dados necessários para fazer a verificação de sua conta bancária.");
        System.out.println();// para pular uma linha apos a impressao da mensagem de incio
        
        System.out.print("Digite o nome do cliente: ");
        clientName = inputClientName.nextLine();

        System.out.print("Digite o número de sua Conta Corrente: ");
        accountCurrentNumber = inputAccountCurrentNumber.nextLine();

        System.out.print("Qual o valor inicial da Conta Corrente " + accountCurrentNumber + " ? ");
        currentBalance = inputCurrentBalance.nextDouble();

        System.out.print("Digite o número de sua Conta Poupança: ");
        savingsAccountNumber = inputSavingsAccountNumber.nextLine();

        System.out.print("Qual o valor inicial da Conta Poupança " + savingsAccountNumber + " ? ");
        savingsBalance = inputSavingsBalance.nextDouble();

        System.out.println();

        do {
            System.out.println();
            System.out.println("1 - Creditar");
            System.out.println("2 - Debitar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Saldo");
            System.out.println("5 - Sair");
            System.out.println();
            option = inputOption.nextInt();

            if (option == 1) {
                System.out.println("Você escolheu a opção de CREDITAR");
                // colocar codigo
            } else if (option == 2) {
                System.out.println("Você escolheu a opção de DEBITAR");
                // colocar codigo
            } else if (option == 3) {
                System.out.println("Você escolheu a opção de TRANSFERIR");
                // colocar codigo
            } else if (option == 4) {
                System.out.println("Você escolheu a opção de CONSULTAR SALDO");
                // colocar codigo
            } else if (option == 5) {
                System.out.println("Você escolheu a opção de SAIR");
                // operação encerrada pelo cliente
            } else {
                System.out.println("Operação Inválida!");
            }
        } while (option != 5);
        
    }
}
