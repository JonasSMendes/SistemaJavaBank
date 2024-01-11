package co.JonasSmendes.bank;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account usuario1 = new Account(" 0001 ", " 1234 ", " jonas ",2000);

        while (true){
            System.out.println("Oque gostaria de fazer? digite: 'D' - Depositar  'S' - Sacar  'E' - Exit");
            String op = scanner.nextLine();

            if (op.equals("D")){
                System.out.println("Qual o valor que deseja depositar:");
                int ValorDeposito = scanner.nextInt();
                usuario1.deposito(ValorDeposito);

            } else if (op.equals("S")) {
                System.out.println("Qual valor gostaria de sacar:");
                int ValorSaque = scanner.nextInt();
                    if (!usuario1.sacar(ValorSaque)){
                        System.out.println("você não tem saldo o suficiente");
                    }
                usuario1.sacar(ValorSaque);

            } else if (op.equals("E")) {
                System.out.println("Obrigado por escolher o banco PandaAmericano");
                System.out.println(usuario1);

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