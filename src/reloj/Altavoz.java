
package reloj;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Altavoz {
   static  boolean ringOn;
   static  Clip melodia;
  
/**
 * 
 * @param ringOn actives the alarm,warn us about the hour that we have set the alarm.
 * @param melodia melody that sounds whenever the alarm rings
 */
    public Altavoz(boolean ringOn, Clip melodia) {
        this.ringOn = ringOn;
        this.melodia = melodia;
    }

    public Altavoz() {
      
        
        
    }
    /**
     * turns on the melody at the hour of the alarm
     */
    public static void playSound(){
         try {
           melodia = AudioSystem.getClip();
           try {
               melodia.open(AudioSystem.getAudioInputStream(new File("")));
           } catch (UnsupportedAudioFileException ex) {
               Logger.getLogger(Altavoz.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(Altavoz.class.getName()).log(Level.SEVERE, null, ex);
           }
       } catch (LineUnavailableException ex) {
           System.out.println("Error :"+ex.getMessage());
       }
        
    }
   
}
