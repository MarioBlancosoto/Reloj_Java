
package reloj;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


public class Reloj {

    static LocalTime horaActual;
    static LocalTime horaAlarma;
    static Timer timer ;
    static TimerTask task;
     
    
    public static void main(String[] args) {
    task = new TimerTask() {
        @Override
        public void run() {
          if(horaAlarma.getMinute()==LocalTime.now().getMinute()){
              JOptionPane.showMessageDialog(null,"ALARMA!!!");
          }else{
              JOptionPane.showMessageDialog(null,"La hora Actual es : " +LocalTime.now().getHour()+":"+LocalTime.now().getMinute());
          }
        }
    };
    timer = new Timer();
    horaActual = LocalTime.now();
    horaAlarma = LocalTime.of(3, 15);
    int select;
    timer.schedule(task,10, 10000);
    do{
        select = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la opción Deseada \n 1. configurar Hora  \n 2. hora + "
                + "\n 3.minutos +"));
        
     switch(select){
        
         case 1:Botonera.configHr();
         break;
         case 2:Botonera.plusHr();
         break;
         case 3:Botonera.plusMin();
         break;
         case 4:Display.showHourMin();
         break;
         
         
         
     }   
        
    }while(select!=0);
    timer.cancel();
    
    }

    
    
}
