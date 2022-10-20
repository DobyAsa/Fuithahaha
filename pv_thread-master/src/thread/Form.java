package thread;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    public JFrame myFrame=new JFrame("FruitSema"); //静态的窗口容器
    public JPanel myPanel =new JPanel();
    public Container myContainer=myFrame.getContentPane();
    public JScrollPane myScroll=new JScrollPane();
    public Graphics g= myPanel.getGraphics();

    public ImageIcon father=new ImageIcon(new ImageIcon("pv_thread-master/src/images/father.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    public ImageIcon mother=new ImageIcon(new ImageIcon("pv_thread-master/src/images/mother.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    public ImageIcon son=new ImageIcon(new ImageIcon("pv_thread-master/src/images/son.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    public ImageIcon daughter=new ImageIcon(new ImageIcon("pv_thread-master/src/images/daughter.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    public static ImageIcon fatherHand=new ImageIcon(new ImageIcon("pv_thread-master/src/images/hand.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    public static ImageIcon motherHand=fatherHand;
    public static ImageIcon sonHand=fatherHand;
    public static ImageIcon daughterHand=fatherHand;
    public static ImageIcon plate=new ImageIcon(new ImageIcon("pv_thread-master/src/images/plate.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    public static ImageIcon ichigo =new ImageIcon(new ImageIcon("pv_thread-master/src/images/ichogo.png").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
    public static ImageIcon banana =new ImageIcon(new ImageIcon("pv_thread-master/src/images/banana.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

    public JLabel fatherLabel=new JLabel(father);
    public JLabel motherLabel=new JLabel(mother);
    public JLabel sonLabel=new JLabel(son);
    public JLabel daughterLabel=new JLabel(daughter);
    public JLabel plateLabel=new JLabel(plate);
    public static JLabel fHandLabel=new JLabel(fatherHand);
    public static JLabel mHandLabel=new JLabel(motherHand);
    public static JLabel sHandLabel=new JLabel(sonHand);
    public static JLabel dHandLabel=new JLabel(daughterHand);
    public static JLabel ichigoLabel1 =new JLabel(ichigo);
    public static JLabel ichigoLabel2 =new JLabel(ichigo);
    public static JLabel ichigoLabel3 =new JLabel(ichigo);
    public static JLabel ichigoLabel4 =new JLabel(ichigo);
    public static JLabel bananaLabel1 =new JLabel(banana);
    public static JLabel bananaLabel2 =new JLabel(banana);
    public static JLabel bananaLabel3 =new JLabel(banana);
    public static JLabel bananaLabel4 =new JLabel(banana);

    public static int getX(Component a){
        return a.getX();
    }

    public static int getY(Component a){
        return a.getY();
    }

    public static void setXY(Component a,int x,int y){
        a.setLocation(x,y);
    }


    public void Init(){
        myFrame.setLayout(null);
        myPanel.setLayout(null);
        myContainer.setLayout(null);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.setSize(1000,800);
        myPanel.setBounds(0,0,1200,800);
        fatherLabel.setBounds(0,0,father.getIconWidth(),father.getIconHeight());
        motherLabel.setBounds(850,0,mother.getIconWidth(),mother.getIconHeight());
        sonLabel.setBounds(20,700-son.getIconHeight(),son.getIconWidth(),son.getIconHeight());
        daughterLabel.setBounds(850,700-daughter.getIconHeight(),daughter.getIconWidth(),daughter.getIconHeight());
        plateLabel.setBounds(300-plateLabel.getWidth(),200-plateLabel.getHeight(),plate.getIconWidth(),plate.getIconHeight());
        fHandLabel.setBounds(100,20,motherHand.getIconWidth(),motherHand.getIconHeight());
        mHandLabel.setBounds(800,20,motherHand.getIconWidth(),motherHand.getIconHeight());
        sHandLabel.setBounds(100,660,motherHand.getIconWidth(),motherHand.getIconHeight());
        dHandLabel.setBounds(800,660,motherHand.getIconWidth(),motherHand.getIconHeight());
        ichigoLabel1.setBounds(750,55,ichigo.getIconWidth(),ichigo.getIconHeight());//右上角
        ichigoLabel2.setBounds(750,635,ichigo.getIconWidth(),ichigo.getIconHeight());//右下角
        ichigoLabel3.setBounds(475,300,ichigo.getIconWidth(),ichigo.getIconHeight());//中间靠左
        ichigoLabel4.setBounds(525,300,ichigo.getIconWidth(),ichigo.getIconHeight());//中间靠右
        bananaLabel1.setBounds(170,55,banana.getIconWidth(),banana.getIconHeight());
        bananaLabel2.setBounds(170,635,banana.getIconWidth(),banana.getIconHeight());
        bananaLabel3.setBounds(375,300,banana.getIconWidth(),banana.getIconHeight());
        bananaLabel4.setBounds(425,300,banana.getIconWidth(),banana.getIconHeight());

        myPanel.add(motherLabel);
        myPanel.add(fatherLabel);
        myPanel.add(sonLabel);
        myPanel.add(daughterLabel);
        myPanel.add(plateLabel);
        myPanel.add(fHandLabel);
        myPanel.add(mHandLabel);
        myPanel.add(sHandLabel);
        myPanel.add(dHandLabel);
        myPanel.add(ichigoLabel1);
        myPanel.add(ichigoLabel2);
        myPanel.add(ichigoLabel3);
        myPanel.add(ichigoLabel4);
        myPanel.add(bananaLabel1);
        myPanel.add(bananaLabel2);
        myPanel.add(bananaLabel3);
        myPanel.add(bananaLabel4);

        myContainer.add(myPanel);
        myFrame.add(myScroll);

        myFrame.setVisible(true);
        myScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        bananaLabel3.setVisible(false);
        bananaLabel4.setVisible(false);
        ichigoLabel3.setVisible(false);
        ichigoLabel4.setVisible(false);
        bananaLabel2.setVisible(false);
        ichigoLabel2.setVisible(false);
    }


    public Form(){
        Init();
    }

}
