package dio_digitalinnovation_gof_strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Está se defendendo");
    }

}
