public class NewJavaFile {
        
        public static void main(String args[]){

        //deklaration av variabler
        int variable1 = 1;
        float variable2 = 2.5f;
        double variable3 = 2.55; 
        char variable4 = 'A';
        int variable5 = 4;

        //utskrift
        System.out.println("This is originally in int: " + variable1 + ".");
        System.out.println("This is originally in float: " + variable2 + ".");
        System.out.println("This is originally in double: " + variable3 + ".");
        System.out.println("This is originally in char: " + variable4 + ".");
        System.out.println("This is originally in int: " + variable5 + ".");
        
        //tom rad
        System.out.println(""); //detta gör en tom rad
        
        //utskrift mmed nya 
        System.out.println("This should now be printed in double: " + ((double) variable1) + ".");
        System.out.println("This should now be printed in double: " + ((double) variable2) + ".");
        System.out.println("This should now be printed in int: " + ((int) variable3) + ".");
        System.out.println("This should now be printed in int: " + ((int) variable4) + ".");
        System.out.println("This should now be printed in byte: " + ((byte) variable5) + ".");
    }
}



((int/float/double/byte etc) VariabelnamnetKommerHit)

