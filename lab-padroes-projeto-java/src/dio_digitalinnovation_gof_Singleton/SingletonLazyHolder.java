package dio_digitalinnovation_gof_Singleton;

/**
 * Singleton "Lazy Holder"
 * @author Weverson
 */

public class SingletonLazyHolder {
    
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
