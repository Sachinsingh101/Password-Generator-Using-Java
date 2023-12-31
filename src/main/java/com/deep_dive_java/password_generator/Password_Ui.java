/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deep_dive_java.password_generator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.SliderUI;
import javax.swing.*;
/**
 *
 * @author Sachin Kumar Singh
 */
public class Password_Ui{
    JFrame f;
    JButton submit;
    JToggleButton b1,b2,b3,b4;
    JTextField passfield, field2;
    boolean upercase=false,lowercase=false,number=false,symbols=false;
    int length=8;
    Password_Ui(){
        f=new JFrame("Password Generator");
        Font font=new Font(Font.SERIF, Font.BOLD,20);
        passfield=new JTextField("Your password Will Appear here");
        passfield.setFont(font);
        Dimension d=new Dimension(150, 40);
        passfield.setPreferredSize(d);
//        Insets inset=new Insets(15, 15, 15, 15);
//        passfield.setMargin(inset);
        f.add(passfield,BorderLayout.NORTH);
        submit=new JButton("Create");
        f.add(submit,BorderLayout.SOUTH);
        
        //Panel
        Panel p=new Panel();
        GridBagLayout gbag=new GridBagLayout();
        GridBagConstraints gc=new GridBagConstraints();
        p.setLayout(gbag);
        p.setSize(300, 300);
        
        //components
        Label label=new Label("Password Size");
        field2=new JTextField("8");
        field2.setFont(font);
        field2.setPreferredSize(d);
        label.setFont(font);
        f.setSize(400,400);
        gc.gridx=0; gc.gridy=0;
        p.add(label);
        gc.gridx=1; gc.gridy=0;
        p.add(field2,gc);
        b1=new JToggleButton("UpperCase");
        b2=new JToggleButton("Lowercase");
        b3=new JToggleButton("Numbers");
        b4=new JToggleButton("Symbols");
        gc.gridx=0; gc.gridy=8;
        p.add(b1,gc);
        gc.gridx=1; gc.gridy=8;
        p.add(b2,gc);
        gc.gridx=0; gc.gridy=15;
        p.add(b3,gc);
        gc.gridx=1; gc.gridy=15;
        p.add(b4,gc);
        f.setResizable(false);
        f.add(p,BorderLayout.CENTER);
        f.setVisible(true);
        
        //Adding Event listeners
        b1.addActionListener(new HandleClick1());
        b2.addActionListener(new HandleClick2());
        b3.addActionListener(new HandleClick3());
        b4.addActionListener(new HandleClick4());
        submit.addActionListener(new submitHandler());
    }
    
    class HandleClick1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            b1.setBackground(Color.yellow);
            upercase = !upercase;
        }
        
    }
    class HandleClick2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            b2.setBackground(Color.yellow);
            lowercase = !lowercase;
        }
    }
    class HandleClick3 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            b3.setBackground(Color.yellow);
            number=!number;
        }
        
    }

    class HandleClick4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JFrame f2 = null;
            b4.setBackground(Color.yellow);
            symbols= !symbols;
        }
    }
    
    class submitHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            length=Integer.parseInt(field2.getText());
            Password_Processor obj=new Password_Processor( upercase, lowercase, number, symbols,length);
            String ans=obj.generatePassword();
            passfield.setText(ans);
        }
    }
}
