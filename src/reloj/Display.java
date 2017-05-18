
package reloj;

import java.time.LocalTime;


public class Display {
   static  boolean ledClock;
   static boolean ledAlarm;
   static boolean ledSet;
    /**
     * shows the current hour and the alarm current hour
     */
   
   
    public static void showHourMin(){
        if(Display.ledAlarm ==true){
       System.out.println(Reloj.horaAlarma.getHour()+": "+Reloj.horaAlarma.getMinute());
        }else{
               System.out.println(Reloj.horaActual.getHour()+": "+Reloj.horaActual.getMinute()); 
               }
    }
   
    /**
     * shows the current icon to visualize where we are at in the cofiguration menu
     * and storing the led's state
     * 
     * @param ledClock shows the icon for the clock's led
     * @param ledAlarma shows the icon for the clock's alarm
     * @alarm ledSet shows which icon is set for the config
     */
    public static void showLeds(boolean clock,boolean alarm,boolean set){
        ledClock = clock;
        ledAlarm = alarm;
        ledSet = set;
        
        
    }
    
    
}
