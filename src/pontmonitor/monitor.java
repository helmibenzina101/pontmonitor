package pontmonitor;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class monitor {
    private final ReentrantLock l = new ReentrantLock();
    private final Condition c1 = l.newCondition();
    private int nbrvoiture = 0;
    private int senseP = -1 ;
public void passer (int sense , String name ){
    l.lock ();
    try  {
        if (nbrvoiture == 0) {
            senseP = sense;

        }
         while (senseP != sense ) {
             System.out.println(name +" Voiture en attente");
            c1.await();
            if (nbrvoiture == 0) {
                senseP = sense;
            }
            System.out.println(name+"  Voiture quitte la file");
        }


        nbrvoiture++;
    }
    catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    finally {
        l.unlock();
    }
}
public void traverser (String name){
    System.out.println(name+" Voiture passe");
}
public void quitter (String name ) {
    l.lock();
    try {
        nbrvoiture--;
        System.out.println(name+ " Voiture quitte le pont");
        c1.signal();
    }
    catch (Exception e) {
        throw new RuntimeException(e);
    }
    finally {
        l.unlock();
    }
}}
