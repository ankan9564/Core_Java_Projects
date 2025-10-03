package in.an.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGame implements ActionListener {
    JFrame jf;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
    int count=0;
    String str="";
    boolean win=false;
    TicTacToeGame(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
        JFrame jf =new JFrame("TicTacToe Game By Ankan");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gd =new GridLayout();
        jf.setLayout(new GridLayout(3,3));
         jb1=new JButton();
        jb1.addActionListener(this);
        jb2=new JButton();
        jb2.addActionListener(this);
        jb3=new JButton();
        jb3.addActionListener(this);
        jb4=new JButton();
        jb4.addActionListener(this);
        jb5=new JButton();
        jb5.addActionListener(this);
        jb6=new JButton();
        jb6.addActionListener(this);
        jb7=new JButton();
        jb7.addActionListener(this);
        jb8=new JButton();
        jb8.addActionListener(this);
        jb9=new JButton();
        jb9.addActionListener(this);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jb5);
        jf.add(jb6);
        jf.add(jb7);
        jf.add(jb8);
        jf.add(jb9);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new TicTacToeGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count=count+1;
        if(count%2==0){
            str = "0";
        }else {
            str="x";
        }
        if(e.getSource()==jb1){
            jb1.setText(str);
           jb1.setFont(new Font("Arial",1,50));
           jb1.setEnabled(false);
        }
        if(e.getSource()==jb2){
            jb2.setText(str);
            jb2.setFont(new Font("Arial",1,50));
            jb2.setEnabled(false);
        }
        if(e.getSource()==jb3){
            jb3.setText(str);
            jb3.setFont(new Font("Arial",1,50));
            jb3.setEnabled(false);
        }
        if(e.getSource()==jb4){
            jb4.setText(str);
            jb4.setFont(new Font("Arial",1,50));
            jb4.setEnabled(false);
        }
        if(e.getSource()==jb5){
            jb5.setText(str);
            jb5.setFont(new Font("Arial",1,50));
            jb5.setEnabled(false);
        }
        if(e.getSource()==jb6){
            jb6.setText(str);
            jb6.setFont(new Font("Arial",1,50));
            jb6.setEnabled(false);
        }
        if(e.getSource()==jb7){
            jb7.setText(str);
            jb7.setFont(new Font("Arial",1,50));
            jb7.setEnabled(false);
        }
        if(e.getSource()==jb8){
            jb8.setText(str);
            jb8.setFont(new Font("Arial",1,50));
            jb8.setEnabled(false);
        }
        if(e.getSource()==jb9){
            jb9.setText(str);
            jb9.setFont(new Font("Arial",1,50));
            jb9.setEnabled(false);
        }
        winningpossiblilites();
        whowins();
    }
    void winningpossiblilites(){
        if(jb1.getText()!="" && jb1.getText()==jb2.getText()&&jb2.getText()==jb3.getText()){
            win=true;
            //JOptionPane.showMessageDialog(jf,str+"wins");
        } else if (jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb4.getText()!="") {
            win=true;
           // JOptionPane.showMessageDialog(jf,str+"wins");
        }else if (jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb7.getText()!=""){
            win=true;
            //JOptionPane.showMessageDialog(jf,str+"wins");
        }else if (jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb1.getText()!=""){
            win=true;
            //JOptionPane.showMessageDialog(jf,str+"wins");
        }else if (jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb2.getText()!=""){
            win=true;
            //JOptionPane.showMessageDialog(jf,str+"wins");
        }else if (jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb3.getText()!=""){
            win=true;
            //JOptionPane.showMessageDialog(jf,str+"wins");
        }else if (jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb3.getText()!=""){
            win=true;
            //JOptionPane.showMessageDialog(jf,str+"wins");
        }else if (jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb3.getText()!=""){
            win=true;
            //JOptionPane.showMessageDialog(jf,str+"wins");
        }
        else {
            win=false;
            //JOptionPane.showMessageDialog(jf,str+"draws");
        }
    }
    void whowins(){
        if(win==true){
            JOptionPane.showMessageDialog(jf,str+"wins");
            restartgame();
        } else if (count==9 && win == false) {
            JOptionPane.showMessageDialog(jf,str+"draw");
            restartgame();
        }
    }
    void restartgame(){
        int i=JOptionPane.showConfirmDialog(jf,"Do you want to restart game");
        if(i==0){
            jb1.setText("");
            jb2.setText("");
            jb3.setText("");
            jb4.setText("");
            jb5.setText("");
            jb6.setText("");
            jb7.setText("");
            jb8.setText("");
            jb9.setText("");

            bsetenabled(true);
            str="";
            count=0;
            win=false;
        } else if (i==1) {
            System.exit(0);
        }else {
            bsetenabled(false);
        }
    }
    void bsetenabled(boolean b){
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }
}
