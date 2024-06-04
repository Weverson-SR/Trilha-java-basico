public class Main {
    public static void main(String[] args){
        Cliente weverson = new Cliente();
        weverson.setNome("Weverson");


        Conta cc = new ContaCorrente(weverson);
        Conta poupanca = new ContaPoupanca(weverson);

        cc.depositar(100);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
