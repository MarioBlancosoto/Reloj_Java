
package reloj;

public class Altavoz {
    boolean ringOn;
    String melodia;
/**
 * 
 * @param ringOn actives the alarm,warn us about the hour that we have set the alarm.
 * @param melodia melody that sounds whenever the alarm rings
 */
    public Altavoz(boolean ringOn, String melodia) {
        this.ringOn = ringOn;
        this.melodia = melodia;
    }

    public Altavoz() {
    }
    /**
     * turns on the melody at the hour of the alarm
     */
    public void playSound(){
        
    }
}
