package co.JonasSmendes.bank;

public class Account {

    private static final int MAX_LENGTH = 12;

    private String ag;
    private String cc;
    private String name;
    private int valor;
    private int saque;
    private Log logger;

    public Account(String ag, String cc, String name, Integer valor ){
        this.ag = ag;
        this.cc = cc;
        setName(name);
        this.valor = valor;
        logger = new Log();
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

    public boolean sacar(int saque){
        if (valor < saque){
            logger.out("SALDO INSUFICIENTE!!! - vocè tentou sacar R$"+ saque + ",seu saldo atual é de R$: " + valor);
            return false;
        }else {
            valor = valor - saque;
            logger.out("você sacou R$" + saque + ",sua conta agora é de R$: " + valor);
            return true ;

        }



    }

    public void deposito(int deposito){
        valor = valor + deposito;
        logger.out("você depositou R$" + deposito + ",sua conta agora é de R$ " + valor);
    }


    @Override
    public String toString(){
        String result = "A conta:" + this.name.toUpperCase() + ",Agencia:" + this.ag + ",Conta corrente:" + this.cc +
                "está com o saldo de: R$" + this.valor;

        return result;
    }
}
