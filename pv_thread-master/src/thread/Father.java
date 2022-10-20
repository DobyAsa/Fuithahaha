package thread;

import java.util.TimerTask;

public class Father extends TimerTask {

    @Override
    public void run() {
        try {
            while (true) {
                if(App.diskEmpty.tryAcquire()){
                    App.fContinue.acquire();
                    App.diskMutex.acquire();
//                    Thread.sleep(1000);

                    move();

                    System.out.println("爸爸放了一个香蕉");

                    int c = App.mContinue.availablePermits();
                    App.mContinue.release(2-c);

                    System.out.println(App.fContinue.availablePermits()+" "+App.mContinue.availablePermits());
                    App.diskMutex.release();
                    App.haveOrange.release();
                    App.bananaCount =App.bananaCount +1;//香蕉数加一
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void move() throws InterruptedException {
        int x1=Form.getX(Form.bananaLabel1);
        int y1=Form.getY(Form.bananaLabel1);
        int x2=Form.getX(Form.fHandLabel);
        int y2=Form.getY(Form.fHandLabel);

        while(x1<=475&&y1<=300){        //移动图片
            x1+=21;
            y1+=21;
            x2+=21;
            y2+=21;
            Thread.sleep(100);
            Form.setXY(Form.bananaLabel1,x1,y1);
            Form.setXY(Form.fHandLabel,x2,y2);
        }

        if(App.bananaCount ==0){
            Form.bananaLabel3.setVisible(true);
        }
        else if(App.bananaCount ==1){
            Form.bananaLabel4.setVisible(true);
        }

        Form.bananaLabel1.setBounds(170,55,
                Form.banana.getIconWidth(),Form.banana.getIconHeight());//香蕉返回原位
        Form.fHandLabel.setBounds(100,20,
                Form.motherHand.getIconWidth(),Form.motherHand.getIconHeight());//爸爸的手返回原位
    }
}
