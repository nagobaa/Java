/*
BONUS: slinga för att hitta det högsta värdet i tabellen (taulukko, array)
*/
import java.util.Arrays;
import java.util.Scanner;

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
        
        //summan av tabellen (taulukko, array)
        int sum = 0;
        for (int i : array1) {
            sum += i;
        }
        System.out.println("The sum of array1 is " + sum);
        System.out.println("The sum of array1 divided by 2 is " + (sum / 2));
        
        //det maximala värdet i tabellen (taulukko, array)
        int max = array1 [0];
        
        for(int i = 0; i < array1.length; i++){
            if(max < array1 [i]){
                max = array1 [i];
            }
        }
        System.out.println("The maximal value of the array is " + max);
    }
}





 
        
        
        


