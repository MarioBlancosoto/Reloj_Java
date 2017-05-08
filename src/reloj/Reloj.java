
package reloj;

public class Reloj {

    
    public static void main(String[] args) {
    Botonera boton = new  Botonera();
    Altavoz alt = new Altavoz();
    Display disp = new Display();
    int select;
    do{
        select = Integer.parseInt("Elija la opción deseada ");
        
     switch(select){
         
         case 1:Botonera.configHr();
         break;
         
         
     }   
        
    }while(select!=0);
    
    
    }
    
}
