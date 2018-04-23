/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import javax.swing.JOptionPane;

/**
 *
 * @author AlexPC
 */
public class Datos {
    
    public Datos(){
        
}

    Integer edad=0;
    String nombre="";
    
    public void captura_datos(){
        nombre=Ventana1.nom_per.getText();
        /* Se utiliza parse para convertir la cadena de texto en un valor entero*/
        /* TipodeDato.parseTipoDeDato(TipoDeDatoAConvertirEnCadena); */
        edad=Integer.parseInt(Ventana1.edad_per.getText());
        
        
    }
    
    public void imprimir_datos(){
        JOptionPane.showMessageDialog(null,"El nombre capturado es = "+nombre+"la edad de la persona es = "+edad,"Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
    
}

