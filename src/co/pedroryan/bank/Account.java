package co.pedroryan.bank;

public class Account {

    private static final int MAX_LENGTH = 12;

    private String ag;
    private String cc;
    private String name;

    private double balance;


    private Log logger;

    // Construtor da classe //
    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        setName(name);

        logger = new Log();
    }

    public void setName(String name) {
        if(name.length() > MAX_LENGTH){
            this.name = name.substring(0, MAX_LENGTH);
        }
        else{
            this.name = name;
        }
     System.out.println(this.name);
    }
    public void deposit(double value) {
        balance += value;
    logger.out("DEPOSITO - R$"+ value + " Sua conta agora é de R$" + balance);
    }

    public boolean withDraw(double value) {

        if (value > balance) {
        logger.out("SAQUE - R$"+ value +" Seu saldo atual é de R$" + balance);
            return false;
        }
        balance -= value;
        logger.out("SAQUE - R$"+ value +" Sua conta agora é de R$" + balance);
        return true;
    }
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        // String result = "A conta de " + this.name +" " +this.ag+ " " +this.cc+ "possui R$ " + balance;
        return "A conta de " + this.name +" " +this.ag+ " " +this.cc+ "possui R$ " + balance;
    }
}
