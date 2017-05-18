package reloj;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Reloj {

    static LocalTime horaActual;
    static LocalTime horaAlarma;
    static Timer timer;
    static TimerTask tarea;
    static boolean pararAlarma = true;

    public static void main(String[] args) {
        tarea = new TimerTask() {
            @Override
            public void run() {
                
                if (horaAlarma.getMinute() == LocalTime.now().getMinute() && horaAlarma.getHour() == LocalTime.now().getHour()&& Display.ledAlarm==true) {
                    JOptionPane.showMessageDialog(null, "ALARMA!!!");
                    Altavoz.playSound();
                    

                } else {
                    JOptionPane.showMessageDialog(null, "La hora Actual es : " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());
                }
            }
        };
        timer = new Timer();
        horaActual = LocalTime.now();
        horaAlarma = LocalTime.now();
        int select;
        timer.schedule(tarea, 10, 10000);
        do {
            select = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la opción Deseada \n 1. configurar Hora  \n 2. hora +  \n 3. Min + \n 4. Configurar Alarma"
   + "\n 5. Mostrar Hora y minutos \n 6. Parar Alarma \n 7.AlarmOn \n 8.AlarmOff"
            ));

            switch (select) {

                case 1:
                    Botonera.configHr();
                    break;
                case 2:
                    Botonera.plusHr();
                    break;
                case 3:
                    Botonera.plusMin();
                    break;
                case 4:
                    Botonera.configAlarm();
                    break;
                case 5:
                    Display.showHourMin();
                    break;
                case 6:
                    Botonera.stopAlarm();
                    break;
                case 7:
                    Botonera.arlamOn();
                    break;
                case 8:
                    Botonera.alarmOff();
                    break;
            }

        } while (select != 0);
     
tarea.cancel();
    }

}
