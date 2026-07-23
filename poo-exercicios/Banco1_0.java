public class Banco1_0 {
    //Parte 1: foi a criação e representação do objeto que é a Conta bancária. Essas são as primeiras funções da conta para que ela seja criada.
    private String createAccount;

    private double balance;

    private double check;

    //criei esse construtor para verificar se existe uma conta ou não.
    private boolean hasacoount;

    private boolean verifyCheck;

    public String getCreateAccount(){return createAccount;}

    public boolean isHasacoount() {
        if (this.hasacoount == false){
            System.out.println("Conta não encontrada! Você precisa criar uma conta");
        }
        return hasacoount;
    }
    // crie essa função para abrir a conta, com o valor inicial do saldo e do cheque.

    public Banco1_0(String createAccount, double balance, double check) {
        this.createAccount = createAccount;
        this.balance = balance;
        this.hasacoount = true;
        if (balance <= 500){
            this.check= 50;

        }else{
            this.check= balance * 0.5;
        }
    }
    //Parte 2: Agora vai começar a parte de estruturar a conta com todas as funcionalidades, como: consultar saldo, consultar cheque especial, depositar dinheiro, sacar dinheiro, pagar um boleto, verificar se a conta esta usando o cheque especial.

     public void deposit (double amount){
        if (this.verifyCheck == true){
            double rate =  amount * 0.20;
            balance =  this.balance + (amount - rate);
            double valorDesconto = amount - rate;
            System.out.printf("Vai ser descontado 20%% do valor do depósito, para pagar a taxa de imposto. Valor depositado foi de R$ %.2f\n", valorDesconto);

        }else{
            balance = amount + this.balance;
            System.out.printf("Valor depositado foi de R$ %.2f\n", amount);
        }
         if (this.balance >= 0) {
             this.verifyCheck = false;
         }
     }
     public void withdraw(double amount){
        if (amount > (this.balance + this.check)){
            System.out.println("Valor indisponível para saque");
            return;
        }
        balance= this.balance - amount;
         if (this.balance < 0) {
             this.verifyCheck = true;
         }
     }
     public void payBill(double amount){
         if (amount > (this.balance + this.check)){
             System.out.println("Valor indisponível para pagar boleto");
             return;
         }
         balance= this.balance - amount;
         
         if (this.balance < 0) {
             this.verifyCheck = true;
         }
     }
     public void verifyBalance(){
         System.out.printf("O saldo atual é R$ %.2f//n", this.balance);
     }

    public void verifyCheck(){
        if ( this.balance < 0){
            System.out.printf("Você está usando o seu cheque especial, o valor dele é é R$ %.2f//n\n", this.check);
        }else{
            System.out.printf("Você não está usando seu cheque especial\n");
        }

    }

}


