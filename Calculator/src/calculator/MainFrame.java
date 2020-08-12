package calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainFrame implements ActionListener 
{
    JFrame jf;
    JPanel pmark;
    JTextField screen;
    JLabel lblans;
    ButtonGroup jbg;
    JRadioButton rbon,rboff;
    JButton bclear,badd,bminus,bmultiply,bdivide,bdot,bequals;  //Symbols and Operators
    JButton bseven,beight,bnine,bfour,bfive,bsix,bone,btwo,bthree,bzero;  //Numbers
    String s0, s1, s2; 
    MainFrame()
    {
        //Frame Details
        s0 = s1 = s2 = ""; 
        jf=new JFrame("CALCULATOR");
        jf.setBackground(Color.LIGHT_GRAY);
        jf.setDefaultCloseOperation(WindowConstants. EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.WHITE);
        jf.setResizable(false);
        jf.setSize(265,377);
        jf.setLayout(null);
        jf.setLocation(100,100);
        
        //Screen Details
        screen=new JTextField();
        screen.setBounds(5,20,250,35);
        screen.setFont(new Font("TIMES_NEW_ROMAN",Font.BOLD,20));
        screen.setForeground(Color.BLACK);
        screen.setBackground(Color.WHITE);
        screen.setHorizontalAlignment(screen.RIGHT);
        screen.setEditable(false);
        jf.add(screen);
        
        //RadioButton Details
        jbg=new ButtonGroup();
        rbon=new JRadioButton("ON");
        rbon.setBounds(5,65,50,15);
        rbon.setFont(new Font("TIMES_NEW_ROMAN",Font.BOLD,12));
        rbon.setForeground(Color.BLACK);
        rbon.setBackground(Color.WHITE);
        rbon.addActionListener(this);
        
        rboff=new JRadioButton("OFF");
        rboff.setBounds(5,90,50,15);
        rboff.setFont(new Font("TIMES_NEW_ROMAN",Font.BOLD,12));
        rboff.setForeground(Color.BLACK);
        rboff.setBackground(Color.WHITE);
        rboff.addActionListener(this);
        jf.add(rbon);
        jf.add(rboff);
        jbg.add(rbon);
        jbg.add(rboff);
        rbon.setSelected(true);
        rbon.setEnabled(false);
        
        
        //Panel Details
        pmark=new JPanel();
        pmark.setBounds(70,65,50,40);
        pmark.setBackground(Color.BLACK);
        lblans=new JLabel("H");
        lblans.setFont(new Font("ARIAL",Font.BOLD,25));
        lblans.setForeground(Color.WHITE);
        pmark.add(lblans);
        jf.add(pmark);
       
        //Button Details
        bclear=new JButton("C");
        bclear.setBounds(135,65,50,40);
        bclear.setForeground(Color.BLACK);
        bclear.setFont(new Font("ARIAL",Font.BOLD,20));
        bclear.addActionListener(this);
        jf.add(bclear);
        
        badd=new JButton("+");
        badd.setBounds(203,65,50,40);
        badd.setForeground(Color.BLACK);
        badd.setFont(new Font("ARIAL",Font.BOLD,20));
        badd.addActionListener(this);
        jf.add(badd);
        
        bseven=new JButton("7");
        bseven.setBounds(5,125,50,40);
        bseven.setForeground(Color.BLACK);
        bseven.setFont(new Font("ARIAL",Font.BOLD,20));
        bseven.addActionListener(this);
        jf.add(bseven);
        
        beight=new JButton("8");
        beight.setBounds(70,125,50,40);
        beight.setForeground(Color.BLACK);
        beight.setFont(new Font("ARIAL",Font.BOLD,20));
        beight.addActionListener(this);
        jf.add(beight);
        
        bnine=new JButton("9");
        bnine.setBounds(135,125,50,40);
        bnine.setForeground(Color.BLACK);
        bnine.setFont(new Font("ARIAL",Font.BOLD,20));
        bnine.addActionListener(this);
        jf.add(bnine);
        
        bminus=new JButton("-");
        bminus.setBounds(203,125,50,40);
        bminus.setForeground(Color.BLACK);
        bminus.setFont(new Font("ARIAL",Font.BOLD,30));
        bminus.addActionListener(this);
        jf.add(bminus);  
        
        bfour=new JButton("4");
        bfour.setBounds(5,185,50,40);
        bfour.setForeground(Color.BLACK);
        bfour.setFont(new Font("ARIAL",Font.BOLD,20));
        bfour.addActionListener(this);
        jf.add(bfour);
        
        bfive=new JButton("5");
        bfive.setBounds(70,185,50,40);
        bfive.setForeground(Color.BLACK);
        bfive.setFont(new Font("ARIAL",Font.BOLD,20));
        bfive.addActionListener(this);
        jf.add(bfive);
        
        bsix=new JButton("6");
        bsix.setBounds(135,185,50,40);
        bsix.setForeground(Color.BLACK);
        bsix.setFont(new Font("ARIAL",Font.BOLD,20));
        bsix.addActionListener(this);
        jf.add(bsix);
        
        bmultiply=new JButton("*");
        bmultiply.setBounds(203,185,50,40);
        bmultiply.setForeground(Color.BLACK);
        bmultiply.setFont(new Font("ARIAL",Font.BOLD,25));
        bmultiply.addActionListener(this);
        jf.add(bmultiply);
        
        bone=new JButton("1");
        bone.setBounds(5,245,50,40);
        bone.setForeground(Color.BLACK);
        bone.setFont(new Font("ARIAL",Font.BOLD,20));
        bone.addActionListener(this);
        jf.add(bone);
        
        btwo=new JButton("2");
        btwo.setBounds(70,245,50,40);
        btwo.setForeground(Color.BLACK);
        btwo.setFont(new Font("ARIAL",Font.BOLD,20));
        btwo.addActionListener(this);
        jf.add(btwo);
        
        bthree=new JButton("3");
        bthree.setBounds(135,245,50,40);
        bthree.setForeground(Color.BLACK);
        bthree.setFont(new Font("ARIAL",Font.BOLD,20));
        bthree.addActionListener(this);
        jf.add(bthree);
        
        bdivide=new JButton("/");
        bdivide.setBounds(203,245,50,40);
        bdivide.setForeground(Color.BLACK);
        bdivide.setFont(new Font("ARIAL",Font.BOLD,20));
        bdivide.addActionListener(this);
        jf.add(bdivide);
        
        bzero=new JButton("0");
        bzero.setBounds(5,305,50,40);
        bzero.setForeground(Color.BLACK);
        bzero.setFont(new Font("ARIAL",Font.BOLD,20));
        bzero.addActionListener(this);
        jf.add(bzero);
        
        bdot=new JButton(".");
        bdot.setBounds(70,305,50,40);
        bdot.setForeground(Color.BLACK);
        bdot.setFont(new Font("ARIAL",Font.BOLD,20));
        bdot.addActionListener(this);
        jf.add(bdot);
        
        bequals=new JButton("=");
        bequals.setBounds(135,305,118,40);
        bequals.setForeground(Color.BLACK);
        bequals.setFont(new Font("ARIAL",Font.BOLD,25));
        bequals.addActionListener(this);
        jf.add(bequals);
        
        jf.setVisible(true);
    }
    public void disableall()
    {
            rbon.setEnabled(true);
            rboff.setEnabled(false);
            screen.setEnabled(false);
            pmark.setEnabled(true);
            bclear.setEnabled(false);
            badd.setEnabled(false);
            bminus.setEnabled(false);
            bmultiply.setEnabled(false);
            bdivide.setEnabled(false);
            bdot.setEnabled(false);
            bequals.setEnabled(false);
            bseven.setEnabled(false);
            beight.setEnabled(false);
            bnine.setEnabled(false);
            bfour.setEnabled(false);
            bfive.setEnabled(false);
            bsix.setEnabled(false);
            bone.setEnabled(false);
            btwo.setEnabled(false);
            bthree.setEnabled(false);
            bzero.setEnabled(false);
    }
    public void enableall()
    {
            rbon.setEnabled(false);
            rboff.setEnabled(true);
            screen.setEnabled(true);        
            pmark.setEnabled(true);
            bclear.setEnabled(true);
            badd.setEnabled(true);
            bminus.setEnabled(true);
            bmultiply.setEnabled(true);
            bdivide.setEnabled(true);
            bdot.setEnabled(true);
            bequals.setEnabled(true);
            bseven.setEnabled(true);
            beight.setEnabled(true);
            bnine.setEnabled(true);
            bfour.setEnabled(true);
            bfive.setEnabled(true);
            bsix.setEnabled(true);
            bone.setEnabled(true);
            btwo.setEnabled(true);
            bthree.setEnabled(true);
            bzero.setEnabled(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(rboff.isSelected())
        {
            disableall(); 
        }
        if(rbon.isSelected())
        {
            enableall();
        } 
        String s=ae.getActionCommand();
        if(ae.getSource()==bdot||ae.getSource()==bzero||ae.getSource()==bone||ae.getSource()==btwo||ae.getSource()==bthree||ae.getSource()==bfour||ae.getSource()==bfive||ae.getSource()==bsix||ae.getSource()==bseven||ae.getSource()==beight||ae.getSource()==bnine)
        { 
            if(!s1.equals(""))
                s2=s2+s;
            else
                s0=s0+s;
            screen.setText(s0+s1+s2);
        }
    else if(ae.getSource()==bclear)
    {
        s0=s1=s2="";
        screen.setText(s0+s1+s2);
    }
    else if(ae.getSource()==bequals)
    {
        double te;
        if (s1.equals("+")) 
            te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
        else if (s1.equals("-")) 
            te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
        else if (s1.equals("/")) 
            te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
        else
            te = (Double.parseDouble(s0) * Double.parseDouble(s2));
        screen.setText(s0 + s1 + s2 + "=" + te); 
        s0 = Double.toString(te); 
        s1 = s2 = "";
    }
    else { 
            // if there was no operand 
            if (s1.equals("") || s2.equals("")) 
                s1 = s; 
            // else evaluate 
            else { 
                double te; 
  
                // store the value in 1st 
                if (s1.equals("+")) 
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
                else if (s1.equals("-")) 
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
                else if (s1.equals("/")) 
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 

                s0 = Double.toString(te); 

                s1 = s; 

                s2 = ""; 
            } 
            screen.setText(s0 + s1 + s2); 
        }  
    }
    public static void main(String args[])
    {
        MainFrame mf=new MainFrame();
    }
}
