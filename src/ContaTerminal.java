import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da sua conta ! = ");
        Numero = sc.nextInt();

        System.out.print("Por favor, digite o número da Agência ! = ");
        Agencia = sc.next();
        
        System.out.print("Por favor, digite o seu nome! = ");
        NomeCliente = sc.next();
        
        System.out.print("Por favor, digite o valor ue deseja depositar ! = ");
        Saldo = sc.nextDouble();
        
        System.out.print("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco,"
         + " sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de R$" + Saldo + " já está disponível para saque.");

         sc.close();
        
    }
}
