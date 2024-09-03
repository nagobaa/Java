/*
Ändra slingan så att den slutar skriva när siffran 11 nås. 
Använd "break"-satsen för att sluta slingan när villkoret är uppfyllt.
När slignan är slutad, skriv ut "Loop terminated early due to break statement."

*/
public class NewJavaFile {
    
    public static void main(String[] args) {
        
        for (int i = 1; i < 31; i++){
            if (i <30){
            System.out.print(i + ", ");
        } else{
            System.out.println(i);
            }
        }
        
        for (int i = 1; i < 31; i++){
            if (i == 11){
                System.out.print(i + " ");
                System.out.println("Loop terminated early due to break statement.");
                    break;
            } if (i <30){
            System.out.print(i + ", ");
            } else{
                System.out.print(i);
            }
        }        
    } 
}

