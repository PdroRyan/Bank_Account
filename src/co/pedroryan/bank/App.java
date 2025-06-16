package co.pedroryan.bank;

import java.util.Scanner;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // depositar, saque, sair do programa //

        Bank Santander = new Bank("0001");
        // C = Crar conta
        // E = Sair (Exit)

        while (true){
            System.out.println("Oque voçê deseja fazer?\nC = Criar uma conta\nE = Sair\nDigite aqui: ");
            String op = sc.nextLine();

            if(op.equals("C")||op.equals("c")){
            System.out.println("Digite o seu nome: ");
            String nome = sc.nextLine();
            Account account = Santander.generateAccount(nome);
            Santander.insertAccount(account);

            operateAccount(account);

            }
            else if(op.equals("E")||op.equals("e"))
            {
                System.out.println("Finalizado!");
                break;
            }
            else
            {
                System.out.println("Alternativa invalida!");
            }
        }

        Account account = new Account("","", "");
        // D = Deposito
        // S = Saque
        // E = Sair (Exit)

        while(true){
            System.out.println("Oque deseja fazer?\n D = Deposito \n S = Saque \n E = Sair do programa! \nDigite aqui: ");
            String input = sc.nextLine();
            if(input.equals("D")||input.equals("d")){
                System.out.println("Qual o valor que deseja depositar?\n");
                double value = sc.nextDouble();
                account.deposit(value);
            }
            else if (input.equals("S")||input.equals("s")) {
                System.out.println("Qual o valor que deseja Sacar?\n");
                double value = sc.nextDouble();
                account.withDraw(value);

                if(!account.withDraw(value)){
                    System.out.println("Saldo insuficiente!");
                }

            }
            else if (input.equals("E")||input.equals("e")) {
                System.out.println("Sessão finalizada!");
                break;
            }
            else{
                System.out.println("Comando invalido!!!\nTente novamente!");
            }
        sc = new Scanner(System.in); // evitar usar o mesmo scanner em todo o loop
        }

        List<Account> accounts = Santander.getAccounts();
        for(Account cc : accounts){
            System.out.println(cc);
         }
    Santander.outputTotal();
    }


    static void operateAccount(Account account){
        Scanner sc = new Scanner(System.in);
        // D = Deposito
        // S = Saque
        // E = Sair (Exit)

        while(true){
            System.out.println("Oque deseja fazer?\n D = Deposito \n S = Saque \n E = Sair! \nDigite aqui: ");
            String input = sc.nextLine();
            if(input.equals("D")||input.equals("d")){
                System.out.println("Qual o valor que deseja depositar?\n");
                double value = sc.nextDouble();
                account.deposit(value);
            }
            else if (input.equals("S")||input.equals("s")) {
                System.out.println("Qual o valor que deseja Sacar?\n");
                double value = sc.nextDouble();
                account.withDraw(value);

                if(!account.withDraw(value)){
                    System.out.println("Saldo insuficiente!");
                }

            }
            else if (input.equals("E")||input.equals("e")) {
                System.out.println("Sessão finalizada!");
                break;
            }
            else{
                System.out.println("Comando invalido!!!\nTente novamente!");
            }

            sc = new Scanner(System.in); // evitar usar o mesmo scanner em todo o loop
        }
    }

}


