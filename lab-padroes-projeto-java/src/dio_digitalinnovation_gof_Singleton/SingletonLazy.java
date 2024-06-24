package dio_digitalinnovation_gof_Singleton;

/**
 * Singleton "Preguiçoso"
 * @author Weverson
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
