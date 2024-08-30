public class NewJavaFile{
         
    public static void main(String args[]){
        
        // deklaration av tabeller (taulukko, array)
        int [] array1 = {5, 10, 25, 75, 125}; // array = tabell, taulukko
        int sum1 = 0; 
        for (int i : array1){
            sum1 += i;
        }
        
        int [] array2 = {50, 100, 250, 750, 25}; // array = tabell, taulukko 
        int sum2 = 0;
        for (int i : array2){
            sum2 += i;
        }
        // utskrift av summorna
        System.out.println("The sum of array1 is " + sum1 + ".");
        System.out.println("The sum of array2 is " + sum2 + ".");

        //division med sum1 och sum2
        System.out.println("The division between sum1 and sum2 is " + ((double) sum1 / sum2) + ".");
    }
}
/*
Bonus:  
Ta bort den första sifrran från Array1 och den sista siffran från Array2 
skriv ut svaret   
*/
