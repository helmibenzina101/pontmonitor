package pontmonitor;

public class Voiture extends  Thread {
    private monitor monitor ;
    private String name ;
    private int sense ;
    public Voiture(monitor monitor , String name , int sense){
        this.monitor=monitor;
        this.name=name;
        this.sense=sense ;
    }

    public void run (){
        monitor.passer(sense , name);
        monitor.traverser(name);
        monitor.quitter( name);

    }
}
