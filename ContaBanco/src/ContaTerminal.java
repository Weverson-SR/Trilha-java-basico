//importar classe Scanner
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Declarando as variaveis 
        String nomeCliente, Agencia;
        int NumeroConta;
        Double Saldo;

        try (Scanner entrada = new Scanner(System.in)) {

            //Obtendo dados do usuário
            System.out.println("Cadastre o seu nome!");
            System.out.print("Por favor, informe seu nome:  ");
            nomeCliente = entrada.nextLine();

            System.out.println("Informe sua Agência!");
            System.out.print("Digite o número da Agência: ");
            Agencia = entrada.nextLine();

            System.out.println("Informe o numero da sua conta!");
            System.out.print("Número da sua conta: ");
            NumeroConta = Integer.parseInt(entrada.nextLine());

            System.out.println("Digite o Saldo que deseja depositar!");
            System.out.print("Digite o Saldo: ");
            Saldo = Double.parseDouble(entrada.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("Erro ao converter entrada para número. Certifique-se de fornecer valores válidos.");
            return; // Encerra o programa em caso do usuário não usar números na conta e no saldo.
        }
        // Exibindo mensagem de confirmação com os dados cadastrados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + Agencia);
        System.out.println("Número da conta: " + NumeroConta);
        System.out.println("Seu saldo de R$" + Saldo + " já está disponível para saque.");
    }
}