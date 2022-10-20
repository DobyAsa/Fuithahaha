package thread;

import java.util.TimerTask;

public class Mother extends TimerTask {
    @Override
    public void run() {
        try {
            while (true) {
                if(App.diskEmpty.tryAcquire()){
                    App.mContinue.acquire();
                    App.diskMutex.acquire();
//                    Thread.sleep(1000);

                    move();
                    System.out.println("妈妈放了一个草莓");

                    int c = App.fContinue.availablePermits();
                    App.fContinue.release(2-c);
                    System.out.println(App.fContinue.availablePermits()+" "+App.mContinue.availablePermits());

                    App.diskMutex.release();
                    App.haveApple.release();
                    App.appleCount=App.appleCount+1; //苹果数+1；
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void move() throws InterruptedException {
        int x1=Form.getX(Form.ichigoLabel1);
        int y1=Form.getY(Form.ichigoLabel1);
        int x2=Form.getX(Form.mHandLabel);
        int y2=Form.getY(Form.mHandLabel);

        while(x1>=475&&y1<=300){        //移动图片
            x1-=21;
            y1+=21;
            x2-=21;
            y2+=21;
            Thread.sleep(100);
            Form.setXY(Form.ichigoLabel1,x1,y1);
            Form.setXY(Form.mHandLabel,x2,y2);
        }

        if(App.appleCount==0){
            Form.ichigoLabel3.setVisible(true);
        }
        else if(App.appleCount==1){
            Form.ichigoLabel4.setVisible(true);
        }

        Form.ichigoLabel1.setBounds(750,55,Form.ichigo.getIconWidth(),Form.ichigo.getIconHeight());
        Form.mHandLabel.setBounds(800,20,Form.motherHand.getIconWidth(),Form.motherHand.getIconHeight());
    }
}
