package thread;

import java.util.TimerTask;

public class Son extends TimerTask {
    @Override
    public void run() {
        try {
            while (true) {
                if(App.haveBanana.tryAcquire()){
                    App.bananaCount--;
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
        int x1=Form.getX(Form.bananaLabel2);
        int y1=Form.getY(Form.bananaLabel2);
        int x2=Form.getX(Form.sHandLabel);
        int y2=Form.getY(Form.sHandLabel);
        while (x2<=375&&y2>=300){
            x2+=21;
            y2-=21;
            Thread.sleep(100); //移动手
            Form.setXY(Form.sHandLabel,x2,y2);
        }
        if(App.bananaCount ==1)
            Form.bananaLabel4.setVisible(false);
        else if(App.bananaCount ==0)
            Form.bananaLabel3.setVisible(false);
        x1=x2+10;
        y1=y2;
        Form.bananaLabel2.setLocation(x1,y1);
        Form.bananaLabel2.setVisible(true);
        while(x2>=100&&y2<=660){
            x2-=21;
            y2+=21;
            x1-=21;
            y1+=21;
            Thread.sleep(100);
            Form.setXY(Form.sHandLabel,x2,y2);
            Form.setXY(Form.bananaLabel2,x1,y1);
        }
        Form.bananaLabel2.setBounds(170,655,Form.banana.getIconWidth(),Form.banana.getIconHeight());
        Form.sHandLabel.setBounds(100,660,Form.motherHand.getIconWidth(),Form.motherHand.getIconHeight());
        Thread.sleep(1000);
        Form.bananaLabel2.setVisible(false);
    }
}
