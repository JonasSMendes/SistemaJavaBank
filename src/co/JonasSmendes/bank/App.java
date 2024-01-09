package co.JonasSmendes.bank;

public class App {
    public static void main(String[] args) {

        Account usuario1 = new Account(
                " 0001 ", " 1234 ", " jonas ",2000
        );

        System.out.println(usuario1.sacar(1000));

        // criar conta de usuario(agencia, conta, nome)
        // limitar o nome com 12 caracter
        // sacar valores, não pode sacar mais do que tem
        // depositar
        // informar o usuario saque deposito

    }
}
