import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop para iterar sobre os saques:
        while (true) {
            // Solicita ao usuário o valor do saque:
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é zero, encerrando as transações:
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (valorSaque > limiteDiario) {
                // Se o valor do saque ultrapassar o limite diário, informa que não é possível realizar o saque:
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                // Se o valor do saque não ultrapassar o limite diário, subtrai o valor do saque do limite diário:
                limiteDiario -= valorSaque;

                // Informa que o saque foi realizado e mostra o limite restante:
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }
        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}