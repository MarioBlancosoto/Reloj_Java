
package reloj;

import java.time.LocalTime;
import javax.swing.JOptionPane;

public class Reloj {

    static LocalTime horaActual;
    static LocalTime horaAlarma;
    
    public static void main(String[] args) {
    horaActual = LocalTime.of(8,55);
    horaAlarma = LocalTime.of(3, 15);
    int select;
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
    
    
    }
    
    
}
