package dio_digitalinnovation_gof_Singleton;

/**
 * Singleton "Apressado"
 * @author Weverson
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
