import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // espaço para colocar variáveis//
        int option = 0, i = 0;
        double currentBalance, savingsBalance, operationValue;
        String clientName, accountCurrentNumber, savingsAccountNumber;

        // espaço de Scanner NAO MISTURAR
        Scanner inputClientName = new Scanner(System.in);
        Scanner inputAccountCurrentNumber = new Scanner(System.in);
        Scanner inputSavingsAccountNumber = new Scanner(System.in);
        Scanner inputCurrentBalance = new Scanner(System.in);
        Scanner inputSavingsBalance = new Scanner(System.in);
        Scanner inputOption = new Scanner(System.in);
        Scanner inputMenuSelector = new Scanner(System.in);
        Scanner inputOperationValue = new Scanner(System.in);

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
                    System.out.println();
                    do {
                        System.out.println("Em qual conta será feito o CRÉDITO?");
                        System.out.println("1 - Conta Poupança");
                        System.out.println("2 - Conta Corrente");
                        System.out.println("5 - VOLTAR");
                        System.out.println();
                        i = inputMenuSelector.nextInt();

                        if (i == 1) {

                            System.out.println("Quanto gostaria de CREDITAR em sua conta POUPANÇA " + savingsAccountNumber + " ?");
                            System.out.println();
                            operationValue = inputOperationValue.nextDouble();
                            savingsBalance = (savingsBalance + operationValue);
                            System.out.println("Saldo atual na conta POUPANÇA " + savingsAccountNumber + " -> " + savingsBalance);
                            System.out.println();

                        } else if (i == 2) {

                            System.out.println("Quanto gostaria de CREDITAR em sua conta CORRENTE " + accountCurrentNumber + " ?");
                            System.out.println();
                            operationValue = inputOperationValue.nextDouble();
                            currentBalance = (currentBalance + operationValue);
                            System.out.println("Saldo atual na conta CORRENTE " + accountCurrentNumber + " -> " + currentBalance);
                            System.out.println();

                        } else if (i == 5) {

                            System.out.println("Voltando para o menu anterior");
                            System.out.println();

                        } else {

                            System.out.println("Operação Inválida");
                            System.out.println();

                        }
                    } while (i != 5);
                    break;

                case 2:
                    System.out.println("Você escolheu a opção de DEBITAR");
                    System.out.println();
                    do {
                        System.out.println("Em qual conta será feito o DÉBITO?");
                        System.out.println("1 - Conta Poupança");
                        System.out.println("2 - Conta Corrente");
                        System.out.println("5 - SAIR");
                        System.out.println();
                        i = inputMenuSelector.nextInt();

                        if (i == 1) {
                            System.out.println("Qual será o valor do DÉBITO realizado na conta POUPANÇA "+ savingsAccountNumber + " ?");
                            operationValue = inputOperationValue.nextDouble();
                            if (operationValue > savingsBalance) {
                                System.out.println("SALDO INSUFICIENTE PARA SAQUE. DIGITE OUTRO VALOR");
                                System.out.println();
                            } else {
                                savingsBalance = (savingsBalance - operationValue);
                                System.out.println("Saldo atual na conta POUPANÇA " + savingsAccountNumber + " -> "+ savingsBalance);
                                System.out.println();
                            }
                        } else if (i == 2) {
                            System.out.println("Qual será o valor do DÉBITO realizado na conta CORRENTE "+ accountCurrentNumber + " ?");
                            operationValue = inputOperationValue.nextDouble();
                            currentBalance = (currentBalance - operationValue);
                            System.out.println("Saldo atual na conta CORRENTE " + accountCurrentNumber + " -> " + currentBalance);
                            System.out.println();

                        } else if (i == 5) {

                            System.out.println("Voltando para o menu anterior");
                            System.out.println();

                        } else {

                            System.out.println("Operação Inválida");
                            System.out.println();
                        }

                    } while (i != 5);
                    break;

                case 3:
                    System.out.println("Você escolheu a opção de TRANSFERIR");
                    do {
                        System.out.println("A transação sera feita entre quais contas?");
                        System.out.println("1 - Conta Poupança para Conta Corrente");
                        System.out.println("2 - Conta Corrente para Conta Poupança");
                        System.out.println("5 - SAIR");
                        System.out.println();
                        i = inputMenuSelector.nextInt();

                        if (i == 1) {

                            System.out.println("Qual será o valor transferido para a Conta Corrente "+ accountCurrentNumber + " ?");
                            operationValue = inputOperationValue.nextDouble();
                            if (operationValue > savingsBalance) {
                                System.out.println("SALDO INSUFICIENTE PARA TRANSFERENCIA. DIGITE OUTRO VALOR");
                                System.out.println();
                            } else {
                                savingsBalance = (savingsBalance - operationValue);
                                currentBalance = (currentBalance + operationValue);
                                System.out.println("Saldo atual na conta CORRENTE " + accountCurrentNumber + " -> "+ currentBalance);
                                System.out.println();
                            }
                        } else if (i == 2) {
                            System.out.println("Qual será o valor transferido para a Conta Poupança "+ savingsAccountNumber+ " ?");
                            operationValue = inputOperationValue.nextDouble();
                            currentBalance = (currentBalance - operationValue);
                            savingsBalance = (savingsBalance + operationValue);
                            System.out.println("Saldo atual na conta POUPANÇA " + savingsAccountNumber + " -> " + savingsBalance);
                            System.out.println();
                        } else if (i == 5) {

                            System.out.println("Voltando para o menu anterior");
                            System.out.println();

                        } else {

                            System.out.println("Operação Inválida");
                            System.out.println();
                        }
                    } while (i != 5);
                    break;

                case 4:
                    // consulta de saldo
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