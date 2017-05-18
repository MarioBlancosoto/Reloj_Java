
package reloj;

import java.time.LocalTime;
import javax.swing.JOptionPane;
import static reloj.Reloj.tarea;


public class Botonera {
    static boolean alarmmActive;
    static boolean setHr;
    static boolean setAlarm;
 
    
    /**
     * abstract buttons to allow you to config de alarm,hour etc...
     * @param showAlarmActive shows if the alarm is on or off
     * @param showSetHr allow you to set the hour
     * @param showSetAlarm  allow you to see when de alarm is set 
     */
    public Botonera(boolean showAlarmActive, boolean showSetHr, boolean showSetAlarm) {
       this.alarmmActive = showAlarmActive;
       this.setAlarm = showSetAlarm;
       this.setHr = showSetHr;
    }

    public Botonera() {
        
    }
    
    /**
     * shows if the alarm is on
     */
    public static void arlamOn(){
        Display.showLeds(false,true,false);
        
    }
    /**
     * shows if the alarm is off
     */
    public static void alarmOff(){
        Display.showLeds(false, false, false);
    }
    /**
     * allow you to config the hour
     * 
     */
    public static void plusHr(){
     if(Display.ledAlarm==true){
      Reloj.horaAlarma = Reloj.horaAlarma.plusHours(1);
      Display.showHourMin();
     }else{
     Reloj.horaActual = Reloj.horaActual.plusHours(1);
     
      Display.showHourMin();
     }


    }
    /**
     * Allow you to config the minutes of the clock
     */
    public static void plusMin(){
        if(Display.ledAlarm ==true){
            Reloj.horaAlarma = Reloj.horaAlarma.plusMinutes(1);
          
        }else{
      Reloj.horaActual  =   Reloj.horaActual.plusMinutes(1);
      Display.showHourMin();
        } 
  
    }
    /**
     * stops the alarm when pressed
     */
    public static void stopAlarm(){
        Reloj.timer.cancel();
       
    }
    /**
     * allow you to config the actual hour
     */
    public static void configHr(){
       
        Display.showLeds(true,false,true);
        Display.showHourMin();
        
        
    }
    /**
     * allow you to config the hour of the alarm 
     */
    public static void configAlarm(){
     
        Display.showLeds(false,true,true);
        
        Display.showHourMin();
        
        
    }
  
}
