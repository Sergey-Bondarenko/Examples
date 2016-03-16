package foo.bar;

public class Capital {
    private static Capital instance = null;

    private Capital(){}

    public static Capital getInstance() {
        if(instance == null)
            instance = new Capital();
        return instance;
    }

}
