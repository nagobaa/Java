/*
Deklarerar två variabler för att lagra två tal (heltal). 
Utför addition, subtraktion, multiplikation och division på dessa tal. 
Skriver ut resultatet av varje kalkyl i ett strukturerat format. 
som exempel System.out.println("Sum: " + sum);

    num1
    num2
    num1 + num2
    num1 – num2
    num1 * num2
    num1 / num2

*/
public class newJavaFile{
    
    
    public static void main(String args[]){
        
        int num1 = 5;
        int num2 = 3;
        
        //num1 + num2
        System.out.println("The sum of num1 and num2 is " + (num1 + num2));
        //num1 - num2
        System.out.println("The substraction of num1 and num2 is " + (num1 - num2));
        //num1 / num2
        System.out.println("The division of num1 and num2 is " + ((double) num1 / num2));
         //num1 * num2
        System.out.println("The multiplication of num1 and num2 is " + (num1 * num2));
    }        
}