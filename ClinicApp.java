/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinicapp;

import javax.swing.JFrame;
import java.awt.Color;

/**
 *
 * @author HASSNAT
 */
public class ClinicApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainframe frm=new mainframe();
        frm.getContentPane().setBackground(Color.cyan);
        frm.setTitle("hasnat ashraf");
        frm.setSize(800,600);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        
    }
    
}
