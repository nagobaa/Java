/*
utskrift av den första och sista siffran i tabellen
slinga för att få summan av tabellen (taulukko, array) + division med 2 + utskrift av svaret
BONUS: slinga för att hitta det högsta värdet i tabellen (taulukko, array)
*/
import java.util.Arrays;

public class NewJavaFile {
    
    public static void main(String[] args) {
        
        int array1 [] = {10, 20, 30, 40, 50};
        
        //utskrift av tabellen (taulukko, array)
        for (int i: array1){
            System.out.print(i + " ");
        }
        
        System.out.println(" ");
        
        //detta är en "endimensionell" tabell
        System.out.println(Arrays.toString(array1));
        
        
        //utskrift av det första och sista värdet av tabellen (taulukko, array)
        System.out.println("The first number in the array1 is " + array1 [0]);
        System.out.println("The second number in the array1 is " + array1 [4]);
    }
}





