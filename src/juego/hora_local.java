/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
/**
 *
 * @author Edward Esteban
 */
public class hora_local {
    Calendar fecha = new GregorianCalendar();
    
    String hora=Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String min=Integer.toString(fecha.get(Calendar.MINUTE));
    
    String completa= hora+" :"+ min;
  
    
}
