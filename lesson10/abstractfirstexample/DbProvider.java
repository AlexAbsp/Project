package Lesson10.abstractfirstexample;

public abstract class DbProvider {

    private String DbHost;

//    public DbProvider(String dbHost) {
//        DbHost = dbHost;
//    }

    abstract void connectToDb();
    abstract void disConnectFromDb();

    void printDbHost(){
        System.out.println("Db host is" + DbHost);
    }
}
