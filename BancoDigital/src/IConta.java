public interface IConta {

    //Interfaces já são publicas então não precisa de public void
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor , Conta contaDestino);

    void imprimirExtrato();
}
