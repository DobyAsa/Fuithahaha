package thread;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
    public JFrame myFrame=new JFrame("FruitSema"); //静态的窗口容器
    public JPanel myPanel1=new JPanel();
    public JPanel myPanel2=new JPanel();
    public Container myContainer=myFrame.getContentPane();
    public static JTextArea myTextArea=new JTextArea();      //静态的多行文本框
    public JScrollPane myScroll=new JScrollPane();
    public Graphics g=myPanel2.getGraphics();

    public ImageIcon father=new ImageIcon("pv_thread-master/src/images/father.png");
    public ImageIcon mother=new ImageIcon("pv_thread-master/src/images/mother.png");
    public ImageIcon son=new ImageIcon("pv_thread-master/src/images/son.png");
    public ImageIcon daughter=new ImageIcon("pv_thread-master/src/images/daughter.png");
    public static ImageIcon fatherHand=new ImageIcon("pv_thread-master/src/images/hand.png");
    public static ImageIcon motherHand=new ImageIcon("pv_thread-master/src/images/hand.png");
    public static ImageIcon sonHand=new ImageIcon("pv_thread-master/src/images/hand.png");
    public static ImageIcon daughterHand=new ImageIcon("pv_thread-master/src/images/hand.png");
    public static ImageIcon plate=new ImageIcon("pv_thread-master/src/images/plate.png");
    public static ImageIcon ichigo =new ImageIcon("pv_thread-master/src/images/ichogo.png");
    public static ImageIcon banana =new ImageIcon("pv_thread-master/src/images/banana.png");

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


    public static void putFruit(String name,String fruit){
        myTextArea.append(name+"放了一个"+fruit+"\n");
    }
    public static void eatFruit(String name,String fruit){
        myTextArea.append(name+"吃了一个"+fruit+"\n");
    }

    public static void putFruitFailed(String name,String fruit){
        myTextArea.append(name+"放"+fruit+"失败"+"\n");
    }

    public static void eatFruitFailed(String name,String fruit){
        myTextArea.append(name+"吃"+fruit+"失败"+"\n");
    }


    public void Init(){
        myFrame.setLayout(null);
        myPanel1.setLayout(null);
        myPanel2.setLayout(null);
        myContainer.setLayout(null);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.setSize(1200,800);
        myPanel1.setBounds(0,0,210,800);
        myPanel2.setBounds(210,0,990,800);
        fatherLabel.setBounds(20,5,father.getIconWidth(),father.getIconHeight());
        motherLabel.setBounds(850,5,mother.getIconWidth(),mother.getIconHeight());
        sonLabel.setBounds(20,645,son.getIconWidth(),son.getIconHeight());
        daughterLabel.setBounds(850,645,daughter.getIconWidth(),daughter.getIconHeight());
        plateLabel.setBounds(375,325,plate.getIconWidth(),plate.getIconHeight());
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

        myTextArea.add(myScroll);
        myPanel1.add(myTextArea);
        myPanel2.add(fatherLabel);
        myPanel2.add(motherLabel);
        myPanel2.add(sonLabel);
        myPanel2.add(daughterLabel);
        myPanel2.add(plateLabel);
        myPanel2.add(fHandLabel);
        myPanel2.add(mHandLabel);
        myPanel2.add(sHandLabel);
        myPanel2.add(dHandLabel);
        myPanel2.add(ichigoLabel1);
        myPanel2.add(ichigoLabel2);
        myPanel2.add(ichigoLabel3);
        myPanel2.add(ichigoLabel4);
        myPanel2.add(bananaLabel1);
        myPanel2.add(bananaLabel2);
        myPanel2.add(bananaLabel3);
        myPanel2.add(bananaLabel4);

        myContainer.add(myPanel1);
        myContainer.add(myPanel2);
        myFrame.add(myScroll);

        myTextArea.setBounds(20,20,180,710);

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
