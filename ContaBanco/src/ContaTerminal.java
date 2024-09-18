
import java.util.Scanner;

public class ContaTerminal{


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        // CONTA //
        System.out.println("\nDigite o número de sua conta: "); 
        int conta = scan.nextInt(); 
        
        // AGENCIA // 
        System.out.println("\nDigite o número de sua agência: ");
        String agencia = scan.next(); 
        scan.nextLine(); 
        
        // NOME //
        System.out.println("\nDigite seu nome: "); 
        String nome = scan.nextLine(); 

        // SALDO //
        System.out.println("\nDigite seu saldo: "); 
        Double saldo = scan.nextDouble(); 


        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia +", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!\n"); 

        scan.close();

    }


}
