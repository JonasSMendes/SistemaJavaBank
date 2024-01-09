package co.JonasSmendes.bank;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account usuario1 = new Account(
                " 0001 ", " 1234 ", " jonas ",2000
        );

        System.out.println("valor do deposito:");
        int ValorDeposito = scanner.nextInt();
        usuario1.deposito(ValorDeposito);

        System.out.println("valor de saque: ");
        int ValorSaque = scanner.nextInt();
        usuario1.sacar(ValorSaque);

        System.out.println(usuario1);
    }
}

// Criar conta de usuario(agencia, conta, nome, valor depositado)
// Limitar o nome em 12 caracter
// sacar valores, não pode sacar mais do que tem
// Depositar
// Informar o usuario saque deposito com o LOG