package co.JonasSmendes.bank;

public class Account {
    private String ag;
    private String cc;
    private String name;
    private int valor;
    private int saque;

    private static final int MAX_LENGTH = 12;

    public Account(String ag, String cc, String name, Integer valor ){
        this.ag = ag;
        this.cc = cc;
        setName(name);
        this.valor = valor;
    }
    public void setName(String name) {
        if (name.length() > MAX_LENGTH){
            this.name = name.substring(0,MAX_LENGTH);
        }else {
            this.name = name;
        }
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public int sacar(int saque){
        if(saque > valor ){
            System.out.println("seu saldo não é o suficiente");
        }

        return valor - saque;
    }

    public int deposito(int deposito){
        return valor + deposito;
    }
}
