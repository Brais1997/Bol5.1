/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol5.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Bol51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Coche car = new Coche();
       JOptionPane.showMessageDialog(null,"Velocidade"+ ""+car.getVelocidade());
               String resposta=JOptionPane.showInputDialog("Velocidade que aumenta?");
               car.acelerar(Integer.parseInt(resposta));
               JOptionPane.showMessageDialog(null, "Velocidade aumentada:"+car.getVelocidade());
    String resp=JOptionPane.showInputDialog("Velocidade que diminúe?");
    car.frenar(Integer.parseInt(resp));
    JOptionPane.showMessageDialog(null,"Velocidade diminuida" + car.getVelocidade());
    }
    
}
