import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.print("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();

            if (parametroUm > parametroDois) {
                System.out.println("Erro: O primeiro parâmetro não pode ser maior que o segundo.");
            } else {
                contar(parametroUm, parametroDois);
            }
        }catch(InputMismatchException e){
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir um número inteiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        // Realizar a contagem e imprimir os números de parametroUm até parametroDois
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}
