import java.time.LocalTime;



public class greetings {
 
    
    void time (){
   
   LocalTime now = LocalTime.now();
       
   LocalTime mstart = LocalTime.of(0, 0);
   LocalTime mend = LocalTime.of(12, 0);

   if (now.isAfter(mstart)&& now.isBefore(mend)){System.out.println("Good Morning");}
   else {System.out.println("Good Afternoon" );}


    }
    

}
