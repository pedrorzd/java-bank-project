import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // espaço para colocar variáveis//
        int option = 0, i = 0;
        double currentBalance, savingsBalance;
        String clientName, accountCurrentNumber, savingsAccountNumber;

        // espaço de Scanner NAO MISTURAR
        Scanner inputClientName = new Scanner(System.in);
        Scanner inputAccountCurrentNumber = new Scanner(System.in);
        Scanner inputSavingsAccountNumber = new Scanner(System.in);
        Scanner inputCurrentBalance = new Scanner(System.in);
        Scanner inputSavingsBalance = new Scanner(System.in);
        Scanner inputOption = new Scanner(System.in);
        Scanner inputMenuSelector = new Scanner(System.in);

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
            System.out.println("Qual operação deseja realizar?");
            System.out.println();
            System.out.println("1 - Creditar");
            System.out.println("2 - Debitar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Consultar Saldo");
            System.out.println("5 - Sair");
            System.out.println();
            option = inputOption.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Você escolheu a opção de CREDITAR");
                    do {
                        System.out.println("Em qual conta será feito o CRÉDITO?");
                        System.out.println("1 - Conta Corrente");
                        System.out.println("2 - Conta Poupança");
                        System.out.println("5 - SAIR");
                        System.out.println();
                        i = inputMenuSelector.nextInt();

                        if (i == 1) {
                            // creditar conta corrente
                        } else if (i == 2) {
                            // creditar conta corrente
                        } else {
                            System.out.println("Operação Inválida");
                            System.out.println();
                        }
                    } while (i != 5);
                    break;

                case 2:
                    System.out.println("Você escolheu a opção de DEBITAR");
                    do {
                        System.out.println("Em qual conta será feito o DÉBITO?");
                        System.out.println("1 - Conta Corrente");
                        System.out.println("2 - Conta Poupança");
                        System.out.println("5 - SAIR");
                        System.out.println();
                        i = inputMenuSelector.nextInt();

                        if (i == 1) {
                            // DEBITAR conta corrente
                        } else if (i == 2) {
                            // DEBITAR conta corrente
                        } else {
                            System.out.println("Operação Inválida");
                            System.out.println();
                        }
                    } while (i != 5);
                    break;

                case 3:
                    System.out.println("Você escolheu a opção de TRANSFERIR");
                    do {
                        System.out.println("A valor será retirado de qual conta?");
                        System.out.println("1 - Conta Corrente");
                        System.out.println("2 - Conta Poupança");
                        System.out.println("5 - SAIR");
                        System.out.println();
                        i = inputMenuSelector.nextInt();

                        if (i == 1) {
                            // TRANSFERIR conta corrente
                        } else if (i == 2) {
                            // TRANSFERIR conta corrente
                        } else {
                            System.out.println("Operação Inválida");
                            System.out.println();
                        }
                    } while (i != 5);
                    break;

                case 4:
                    System.out.println("Você escolheu a opção de CONSULTAR SALDO");
                    do {
                        System.out.println("Em qual conta será feita a CONSULTA?");
                        System.out.println("1 - Conta Corrente");
                        System.out.println("2 - Conta Poupança");
                        System.out.println("5 - SAIR");
                        System.out.println();
                        i = inputMenuSelector.nextInt();

                        if (i == 1) {
                            // CONSULTAR conta corrente
                        } else if (i == 2) {
                            // CONSULTAR conta corrente
                        } else {
                            System.out.println("Operação Inválida");
                            System.out.println();
                        }
                    } while (i != 5);
                    break;

                case 5:
                    // operação encerrada pelo cliente
                    System.out.println("Você escolheu a opção de SAIR");
                    break;

                default:
                    System.out.println("Operação Inválida!");
                    System.out.println();
                    break;
            }
        } while (option != 5);

    }
}