/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarioneto;
import javax.swing.JOptionPane;

/**
 *
 * @author lalej
 */
public class SalarioNeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cedula,vinculacion,porcentaje,descuentoSalario,salarioBasico,salarioNeto;
        String mensaje;
        
        //Guarda la cedula, usamos el parse int porque todo elemento de un JOptionPane que reciba lo recibe en formato de string, hay que transformarlo a Entero.
        cedula = Integer.parseInt(JOptionPane.showInputDialog("digite su cedula por favor"));
        salarioBasico = Integer.parseInt(JOptionPane.showInputDialog("Digite el salario básico del empleado"));
        vinculacion = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de su vinculación a la empresa"));
        
        if((salarioBasico > 1200000) && (vinculacion > 1990)){
            //Se descuenta un 8% de su salario
            mensaje = "Se descuenta un 8% de tu salario";
            porcentaje = 8;
        }else if((salarioBasico < 550000) || (vinculacion == 1990)){
            mensaje = "Se descuenta un 2% de tu salario";
            porcentaje = 2;
        }else{
            mensaje = "Se descuenta un 5% de descuento";
            porcentaje = 5;
        }
        
        descuentoSalario = (salarioBasico * porcentaje) / 100;
        salarioNeto = salarioBasico - descuentoSalario;
        
        JOptionPane.showMessageDialog(null, " "+mensaje+" \n Nro cedula: "+cedula+"\n Salario Neto: "+salarioNeto);
    
    }
}
