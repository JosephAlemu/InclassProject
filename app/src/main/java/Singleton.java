/**
 * Created by user on 1/12/2018.
 */

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){

        System.out.println("Creating");
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
