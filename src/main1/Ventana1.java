/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Pablite5
 */
public class Ventana1 {
    
    
    public void crearVentana1(){
    
    JFrame marco = new JFrame();
    JPanel panel1 = new JPanel();
    JLabel letraN = new JLabel("nome");
    JTextField letra1 = new JTextField(20);
    JLabel letrasP = new JLabel("password");
    JPasswordField letra2 = new JPasswordField(20);
    JButton botonp = new JButton("Premer");
    JButton botonl = new JButton("Limpar");
      
    
    //panel12
    JPanel panel2 = new JPanel();
    String[]lista ={"Elemento1","Elemento2","Elemento3"};
    JList list = new JList(lista);
    JButton boton3= new JButton("botón");
    JTextArea letras = new JTextArea(5,10);
    
   
    marco.setSize(340,500);
    panel1.setBounds(0,0,340,250);
    panel2.setBounds(0,250,340,250);
    
    
        letraN.setBounds(50, 10, 150, 100);
        letra1.setBounds(150, 50, 100, 30);
        letrasP.setBounds(50, 85, 150, 100);
        letra2.setBounds(150, 125, 100, 30);
        botonp.setBounds(50, 210, 85, 30);
        botonl.setBounds(150, 210, 85, 30);
        
        list.setBounds(0, 80, 110, 50);
        boton3.setBounds(125, 80, 85, 35);
        letras.setBounds(230, 80, 80, 40);
    
        
    panel1.add(letraN);
    panel1.add(letra1);
    panel1.add(letrasP);
    panel1.add(letra2);
    panel1.add(botonp);
    panel1.add(botonl);
    panel1.setBackground(Color.BLUE);
    
     panel2.add(list);
    panel2.add(boton3);
    panel2.add(letras);
    panel2.setBackground(Color.RED);
    
    marco.setLayout(null);
    panel1.setLayout(null);
    panel2.setLayout(null);
    marco.add(panel1);
    marco.add(panel2);
  
    
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);
    
}
}
