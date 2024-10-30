package pontmonitor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        monitor monitor = new monitor();
        Voiture v1 = new Voiture(monitor, "v1", 1);
        Voiture v2 = new Voiture(monitor, "v2", -1);
        Voiture v3 = new Voiture(monitor, "v3",1);
        Voiture v4 = new Voiture(monitor, "v4", -1);
        Voiture v5 = new Voiture(monitor, "v5", 1);
        Voiture v6 = new Voiture(monitor, "v6", -1);
        Voiture v7 = new Voiture(monitor, "v7", 1);
        Voiture v8 = new Voiture(monitor, "v8", -1);
        Voiture v9 = new Voiture(monitor, "v9", 1);
        Voiture v10 = new Voiture(monitor, "v10", -1);
        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();
        v6.start();
        v7.start();
        v8.start();
        v9.start();
        v10.start();

    }
}