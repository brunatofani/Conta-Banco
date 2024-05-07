import java.util.Scanner;

public class ContaTerminal {

public static void main (String[] args) throws Exception{

    Scanner scan = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência !");
    String Agencia = scan.nextLine();

    System.out.println("Por favor, digite o número do Nome do Cliente !");
    String NomeCliente = scan.nextLine();

    System.out.println("Por favor, digite o número o Numero !");
    Integer Numero = scan.nextInt();

    System.out.println("Por favor, digite o número o Saldo !");
    Float Saldo = scan.nextFloat();

    System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta"+Numero+" e seu saldo "+Saldo+"já está disponível para saque");
}

}
