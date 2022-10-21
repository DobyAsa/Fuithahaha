package thread;

import java.util.Timer;
import java.util.concurrent.Semaphore;

public class App {

    public static Semaphore diskEmpty = new Semaphore(2);
    public static Semaphore haveBanana = new Semaphore(0);
    public static Semaphore haveIchigo = new Semaphore(0);
    public static Semaphore diskMutex =new Semaphore(1);

    public static Semaphore fContinue = new Semaphore(2);
    public static Semaphore mContinue = new Semaphore(2);

    public static int bananaCount =0;
    public static int ichigoCount =0;

    public static void main(String[] args) {
        Timer timer1=new Timer();
        Timer timer2=new Timer();
        Timer timer3=new Timer();
        Timer timer4=new Timer();

        timer3.schedule(new Son(),1000);
        timer4.schedule(new Daughter(),1000);
        timer1.schedule(new Father(),1000);
        timer2.schedule(new Mother(),1000);

        new Form();
    }

}
