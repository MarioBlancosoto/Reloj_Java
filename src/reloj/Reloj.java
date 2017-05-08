
package reloj;

import java.time.LocalTime;

public class Reloj {

    static LocalTime horaActual;
    public static void main(String[] args) {
   
    int select;
    do{
        select = Integer.parseInt("Elija la opción deseada ");
        
     switch(select){
         
         case 1:Botonera.configHr();
         break;
         case 2:Botonera.plusHr(horaActual);
         break;
         case 3:Botonera.plusMin(horaActual);
         break;
         
         
     }   
        
    }while(select!=0);
    
    
    }
    
    
}
