/*
Mål:
if-else-satser 
ett program: ett givet heltal är udda eller jämnt.
Deklarera en Int variabel var 
programmet avgör om talet är udda eller jämnt med if-else. 
Programmet ska skriva ut om siffran är udda eller jämn.

*/
import java.util.Scanner; //detta är en ny rad

public class NewJavaFile {
        
    public static void main(String args[]) {
        
        Scanner reader = new Scanner(System.in); //detta är en ny rad
      
        System.out.print("Please give a number: "); //tillägg av ":" gör detta till en inmatning?
        int inmatningsvarde = reader.nextInt(); //detta är en ny rad
                
        if (inmatningsvarde % 2 == 0){ //är jämt
            System.out.println("Number " + inmatningsvarde + " is even");
        }else{
            System.out.println("Number " + inmatningsvarde + " is uneven");
        }
    }
}

