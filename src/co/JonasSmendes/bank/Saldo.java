package co.JonasSmendes.bank;

public class Saldo {

    private int valor = 1000;
    private int saque;

    public int sacar(int saque){

        if(saque > valor ){
            System.out.println("seu saldo não é o suficiente");
        }else {
            System.out.println("saldo atual: " + (valor - saque));
        }

        return saque;
    }

}
