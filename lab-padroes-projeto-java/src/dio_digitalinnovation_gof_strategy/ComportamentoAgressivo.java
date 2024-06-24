package dio_digitalinnovation_gof_strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Está atacando!");
    }
}
