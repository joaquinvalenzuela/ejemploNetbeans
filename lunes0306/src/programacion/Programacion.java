/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author RLCR
 */
public class Programacion {

    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double dividir(int num1, int num2) {
        return num1 / num2;
    }

    public int potencia(int num1, int num2) {
        
        return (int)Math.pow(num1, num2);
    }
}
