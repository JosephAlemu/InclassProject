/**
 * Created by user on 1/12/2018.
 */

public class Singleton {

    private static Singleton obj;
    private static int i;

    private Singleton() {

        System.out.println("Object  is Created " );
    }

    public static synchronized Singleton getSingleton() {
        if (obj == null)
        {

            obj = new Singleton();

        }


        return obj;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton obj =  Singleton.getSingleton();
            }


        });
        Thread  t2 = new Thread( new Runnable() {
            @Override
            public void run() {
                Singleton obj=   Singleton.getSingleton();
            }


        });


        t1.start();
        t2.start();

    }
}
