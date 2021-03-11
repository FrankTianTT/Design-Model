public class Singleton {
    private static Singleton singleton = new Singleton();
    public Singleton(){
        System.out.println("Create an Instance.");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
