
package reloj;


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
        
    }
    /**
     * shows if the alarm is off
     */
    public static void alarmOff(){
        
    }
    /**
     * allow you to config the hour
     */
    public static void plusHr(){
        
    }
    /**
     * Allow you to config the minutes of the clock
     */
    public static void plusMin(){
        
    }
    /**
     * stops the alarm when pressed
     */
    public static void stopAlarm(){
        
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
        
    }
}
