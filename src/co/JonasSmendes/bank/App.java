package co.JonasSmendes.bank;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Banks santander = new Banks("0011");
        // C - criar conta
        // E - sair

        Account account;
        while (true) {
            System.out.println("oque você quer fazer? C - Criar conta  E - Exit");
            String op = scanner.nextLine();

            if (op.equals("C")) {

                System.out.println("qual o seu nome:");
                String name = scanner.nextLine();

                System.out.println("qual o seu patrimonio");
                int patrimonio = scanner.nextInt();

                account = santander.generateAccount(name, patrimonio);
                System.out.println("conta criada com sucesso");
                System.out.println(account);
                santander.insertAccount(account);

                operatedAccount(account);

                System.out.println();
                scanner.nextLine();

            } else if (op.equals("E")) {
                System.out.println("Obrigado por escolher o banco santander ");
                break;
            } else {
                System.out.println("comando invalido tente novamente ");
            }

        }

        List<Account> accountList = santander.getAccounts();
        for (Account cc : accountList){
            System.out.println(cc);
        }

        santander.outputtotal();

    }

    static void operatedAccount(Account account){

       Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Oque gostaria de fazer? digite: 'D' - Depositar  'S' - Sacar  'E' - Exit");
            String op = scanner.nextLine();

            if (op.equals("D")) {
                try {
                    System.out.println("Qual o valor que deseja depositar:");
                    boolean NumberToken = true;
                    int ValorDeposito = scanner.nextInt();
                    account.deposito(ValorDeposito);

                } catch (InputMismatchException e) {
                    System.out.println("Apenas números são permitidos para debito. Tente novamente.");
                    scanner.nextLine(); // Consumir a entrada incorreta

                }
            } else if (op.equals("S")) {
                System.out.println("Qual valor gostaria de sacar:");

                try {
                    int ValorSaque = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha pendente após nextInt()

                    if (!account.sacar(ValorSaque)) {
                        System.out.println("Você não tem saldo suficiente");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Apenas números são permitidos para saque. Tente novamente.");
                    scanner.nextLine(); // Consumir a entrada incorreta
                }

            } else if (op.equals("E")) {
                System.out.println("Obrigado por escolher o banco santander");
                System.out.println(account);

                break;
            } else {
                System.out.println("comando invalido tente novamente ");
            }

            scanner = new Scanner(System.in);

        }
    }
}

// Criar conta de usuario(agencia, conta, nome, valor depositado)
// Limitar o nome em 12 caracter
// sacar valores, não pode sacar mais do que tem
// Depositar
// Informar o usuario saque deposito com o LOG