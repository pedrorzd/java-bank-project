import java.util.Scanner;

public class javabankproject {
    public static void main(String[] args) {

        // espaco para colocar variaveis
        int option = 0, i = 0;
        double currentBalance, savingsBalance, operationValue;
        String clientName, accountCurrentNumber, savingsAccountNumber;

        // espaco de Scanner NAO MISTURAR
        Scanner inputClientName = new Scanner(System.in);
        Scanner inputAccountCurrentNumber = new Scanner(System.in);
        Scanner inputSavingsAccountNumber = new Scanner(System.in);
        Scanner inputCurrentBalance = new Scanner(System.in);
        Scanner inputSavingsBalance = new Scanner(System.in);
        Scanner inputOption = new Scanner(System.in);
        Scanner inputMenuSelector = new Scanner(System.in);
        Scanner inputOperationValue = new Scanner(System.in);

        System.out.println(
                "Ola bem vindo ao nosso sistema bancario, para dar inicio ao servico, insira os dados necessarios para fazer a verificacao de sua conta bancaria.");
        System.out.println();// para pular uma linha apos a impressao da mensagem de inicio

        System.out.print("Digite o nome do cliente: ");
        clientName = inputClientName.nextLine();

        System.out.print("Digite o numero de sua Conta Corrente: ");
        accountCurrentNumber = inputAccountCurrentNumber.nextLine();

        System.out.print("Qual o valor inicial da Conta Corrente " + accountCurrentNumber + " ? ");
        currentBalance = inputCurrentBalance.nextDouble();

        System.out.print("Digite o numero de sua Conta Poupanca: ");
        savingsAccountNumber = inputSavingsAccountNumber.nextLine();

        System.out.print("Qual o valor inicial da Conta Poupanca " + savingsAccountNumber + " ? ");
        savingsBalance = inputSavingsBalance.nextDouble();

        System.out.println();

        do {
            System.out.println("Qual operacao deseja realizar?");
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
                    System.out.println("Voce escolheu a opcao de CREDITAR");
                    System.out.println();
                    do {
                        System.out.println("Em qual conta sera feito o CREDITO?");
                        System.out.println("1 - Conta Poupanca");
                        System.out.println("2 - Conta Corrente");
                        System.out.println("5 - VOLTAR");
                        System.out.println();
                        i = inputMenuSelector.nextInt();

                        if (i == 1) {
                            System.out.println("Quanto gostaria de CREDITAR em sua conta POUPANCA " + savingsAccountNumber + " ?"
                            operationValue = inputOperationValue.nextDouble();
		System.out.println();
                            savingsBalance = (savingsBalance + operationValue);
                            System.out.println("Saldo atual na conta POUPANCA " + savingsAccountNumber + " -> " + savingsBalance);
                            System.out.println();
                        } else if (i == 2) {
                            System.out.println("Quanto gostaria de CREDITAR em sua conta CORRENTE " + accountCurrentNumber + " ?");
                            operationValue = inputOperationValue.nextDouble();
                            currentBalance = (currentBalance + operationValue);
		System.out.println();
                            System.out.println("Saldo atual na conta CORRENTE " + accountCurrentNumber + " -> " + currentBalance);
                            System.out.println();
                        } else if (i == 5) {
                            System.out.println("Voltando para o menu anterior");
                            System.out.println();
                        } else {
                            System.out.println("Operacao Invalida");
                            System.out.println();
                        }
                    } ;
                    break;

                case 2:
                    System.out.println("Voce escolheu a opcao de DEBITAR");
                    System.out.println();
                    do {
                        System.out.println("Em qual conta sera feito o DEBITO?");
                        System.out.println("1 - Conta Poupanca");
                        System.out.println("2 - Conta Corrente");
                        System.out.println("5 - VOLTAR");
                        System.out.println();
                        i = inputMenuSelector.nextInt();

                        if (i == 1) {
                            System.out.println("Qual sera o valor do DEBITO realizado na conta POUPANCA " + savingsAccountNumber + " ?");
                            operationValue = inputOperationValue.nextDouble();
		System.out.println();
                            if (operationValue > savingsBalance) {
                                System.out.println("SALDO INSUFICIENTE PARA SAQUE. DIGITE OUTRO VALOR");
                                System.out.println();
                            } else {
                                savingsBalance = (savingsBalance - operationValue);
                                System.out.println("Saldo atual na conta POUPANCA " + savingsAccountNumber + " -> " + savingsBalance);
                                System.out.println();
                            }
                        } else if (i == 2) {
                            System.out.println("Qual sera o valor do DEBITO realizado na conta CORRENTE " + accountCurrentNumber + " ?");
                            operationValue = inputOperationValue.nextDouble();
                            currentBalance = (currentBalance – operationValue);
		System.out.println();
                            System.out.println("Saldo atual na conta CORRENTE " + accountCurrentNumber + " -> " + currentBalance);
                            System.out.println();
                        } else if (i == 5) {
                            System.out.println("Voltando para o menu anterior");
                            System.out.println();
                        } else {
                            System.out.println("Operacao Invalida");
                            System.out.println();
                        }
                    } ;
                    break;

                case 3:
                    System.out.println("Voce escolheu a opcao de TRANSFERIR");
                    do {
                        System.out.println("A transacao sera feita entre quais contas?");
                        System.out.println("1 - Conta Poupanca para Conta Corrente");
                        System.out.println("2 - Conta Corrente para Conta Poupanca");
                        System.out.println("5 - VOLTAR");
                        System.out.println();
                        i = inputMenuSelector.nextInt();

                        if (i == 1) {
                            System.out.println("Qual sera o valor transferido para a Conta Corrente " + accountCurrentNumber + " ?");
                            operationValue = inputOperationValue.nextDouble();
		System.out.println();
                            if (operationValue > savingsBalance) {
                                System.out.println("SALDO INSUFICIENTE PARA TRANSFERENCIA. DIGITE OUTRO VALOR");
                                System.out.println();
                            } else {
                                savingsBalance = (savingsBalance - operationValue);
                                currentBalance = (currentBalance + operationValue);
                                System.out.println("Saldo atual na conta CORRENTE " + accountCurrentNumber + " -> " + currentBalance);
                                System.out.println();
                            }
                        } else if (i == 2) {
                            System.out.println("Qual sera o valor transferido para a Conta Poupanca " + savingsAccountNumber + " ?");
                            operationValue = inputOperationValue.nextDouble();
		System.out.println();
                            currentBalance = (currentBalance - operationValue);
                            savingsBalance = (savingsBalance + operationValue);
                            System.out.println("Saldo atual na conta POUPANCA " + savingsAccountNumber + " -> " + savingsBalance);
                            System.out.println();
                        } else if (i == 5) {
                            System.out.println("Voltando para o menu anterior");
                            System.out.println();
                        } else {
                            System.out.println("Operacao Invalida");
                            System.out.println();
                        }
                    } ;
                    break;

                case 4:
                    // Consultar saldo
                    System.out.println("Qual conta deseja consultar?");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupanca");
                    int accountChoice = inputOption.nextInt();
                    System.out.println();
                    switch (accountChoice) {
                        case 1:
                            System.out.println("Saldo atual na conta CORRENTE " + accountCurrentNumber + " -> " + currentBalance);
                            break;
                        case 2:
                            System.out.println("Saldo
 atual na conta POUPANCA " + savingsAccountNumber + " -> " + savingsBalance);
                            break;
                        default:
                            System.out.println("Opcao invalida.");
                            break;
                    }
                    System.out.println();
                    break;

                case 5:
                    // Operacao encerrada pelo cliente
                    System.out.println("Voce escolheu a opcao de SAIR");
                    break;

                default:
                    System.out.println("Operacao Invalida!");
                    System.out.println();
                    break;
            }
        } while (option != 5);

        // Mensagem de despedida
        System.out.println("Obrigado por utilizar nosso sistema bancario. Volte sempre!");
    }
            }
