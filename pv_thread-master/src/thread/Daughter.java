package thread;

import java.util.TimerTask;

public class Daughter extends TimerTask {
    @Override
    public void run() {
        try {
            while (true) {
                if(App.haveApple.tryAcquire()){
                    App.appleCount--;
                    move();

                    App.diskEmpty.release();
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void move() throws InterruptedException {
        int x1=Form.getX(Form.ichigoLabel2);//记录苹果的坐标
        int y1=Form.getY(Form.ichigoLabel2);
        int x2=Form.getX(Form.dHandLabel);
        int y2=Form.getY(Form.dHandLabel);
        while (x2>=375&&y2>=300){
            x2-=21;
            y2-=21;
            Thread.sleep(100); //移动手
            Form.setXY(Form.dHandLabel,x2,y2);
        }
        if(App.appleCount==1)
            Form.ichigoLabel4.setVisible(false);
        else if(App.appleCount==0)
            Form.ichigoLabel3.setVisible(false);
        x1=x2-50;
        y1=y2;
        Form.ichigoLabel2.setLocation(x1,y1); //把橘子放在手旁边
        Form.ichigoLabel2.setVisible(true);
        while(x2<=800&&y2<=660){
            x2+=21;
            y2+=21;
            x1+=21;
            y1+=21;
            Thread.sleep(100);
            Form.setXY(Form.dHandLabel,x2,y2);
            Form.setXY(Form.ichigoLabel2,x1,y1);
        }
        Form.ichigoLabel2.setBounds(750,655,Form.ichigo.getIconWidth(),Form.ichigo.getIconHeight());
        Form.dHandLabel.setBounds(800,660,Form.motherHand.getIconWidth(),Form.motherHand.getIconHeight());
        Thread.sleep(1000);
        Form.ichigoLabel2.setVisible(false);
    }
}
