/*
public class JavaStrings {
    
    public static void main(String args []) {
        
        //
        String greetings = "Hello";
        System.out.println("greetings");

        String txt = "ABCDEFGHIJKLMNOPQERSTUVWXYZ";
        System.out.println("The length of the txt sting is: " + txt.length());
        
        //.toUpperCase och/ja .toLowerCase
        String txt = "text här";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        
        String txt2 = "The length of the txt string is";
        System.out.println(txt2.indexOf("txt"));
                
        //variabler, muuttujia
        int x = 5;
        int y = 5;
            
        ++x; // detta ökar x med 1, tämä korottaa x yhdellä
        --y; //detta sänker y med två, tämä alentaa y yhdellä
        
        //nytt
        String txt3 = "We are coding today \"coding"\";
        /* detta kan användas för att ha två gånger "" i samma 
        /n = detta byter rad
        String txt3 = "We are coding today \n today";
        /t = "tab" -> 4 mellanslag/neljä välilyöntiä
        */
/*
        //boolean 
        boolean isJavaFun = true;
        boolean isJavaNotFun
                
        System.out.println(isJavaFun);
        System.out.println(isJavaNotFun);
    }
}
        

public class newJavaFile{
    
    public static void main(String args[]){
        //Int Score variable
        int Score = 700;
        //Int UserScore
        int userScore = 450;
        //Float percentage
        float percentage = (float) userScore / Score * 100.0f;
        System.out.println("User's percentage is: " + percentage);
    }
}

public class newJavaFile{
   
    public static void main(String args[]){
        
        boolean iscodingFun = true;
        boolean funOutDoorDay = false;
        System.out.print("Is coding Fun?");
        System.out.println(" " + iscodingFun);
        System.out.print("Is it fun to go outside against one's will?");
        System.out.println(" " + funOutDoorDay);
        
        //
        int items = 50;
        float costPerItem = 7.99f;
        float totalCost = items + costPerItem;
        char currency = '$'; // " " går inte här
        
        //Print Varibles
        System.out.println("Number of items: " + items);
        System.out.println("Cost per Item:" + costPerItem + currency);
        System.out.println("Total cost: " + totalCost + currency);
    }
}
        
public class NewJavaFile
    
    public static void main(String args[]){
        
        boolean iscodingFun = true;
        boolean funOutDoorDay = false;
        System.out.print("Is coding Fun?");
        System.out.println(" " + iscodingFun);
        System.out.print("Is it fun to go outside against one's will?");
        System.out.println(" " + funOutDoorDay);
        
        //
        int items = 50;
        float costPerItem = 7.99f;
        float totalCost = items + costPerItem;
        char currency = '$'; // " " går inte här
        
        //Print Varibles
        System.out.println("Number of items: " + items);
        System.out.println("Cost per Item:" + costPerItem + currency);
        System.out.println("Total cost: " + totalCost + currency);
    }
}

public class JavaStrings {
      
    public static void main(String args []) {        
        //
        String greetings = "Hello";
        System.out.println("greetings");
        // observeration "String" med stort "S", inte litet
        String txt = "ABCDEFGHIJKLMNOPQERSTUVWXYZ";
        System.out.println("The length of the txt sting is: " + txt.length());
        
        //.toUpperCase och/ja .toLowerCase
        String txt = "Hello class";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        
        String txt2 = "The length of the txt string is";
        System.out.println(txt2.indexOf("txt"));
                
        //variabler, muuttujia
        int x = 5;
        int y = 5;
            
        ++x; // detta ökar med 1, tämä korottaa yhdellä
        --y; //detta sänker med två
        
        //nytt
        String txt3 = "We are coding today \"coding"\";
        /* detta kan användas för att ha två gånger "" i samma 
        /n = detta byter rad
        String txt3 = "We are coding today \n today";
        /t = "tab" -> 4 mellanslag/neljä välilyöntiä
        */
        
/*
        //boolean 
        boolean isJavaFun = true;
        boolean isJavaNotFun
                
        System.out.println(isJavaFun);
        System.out.println(isJavaNotFun);
        
        //nytt material
        int x = 15;
        int y = 9;
        
        System.out.println(x > y);
        System.out.println(x < y);
        
        System.out.println(100 > 1); //observation: inte (100>1)
        System.out.println("");
        
        /*
        char detta verkar vara ganska begränsat, vanligtvis bara ett tecken,
        inte två eller mera??, "char" kan inte ha +1 eller -1 ????
        
        Namngivning till variabler: "RigthToVote", inte ?? rightToVote
        */
/*
        //if...
        int age = 25;
        int RightToVote = 18;
        //System.out.println(Age >= RightToVote);
        if(Age) >= RightToVote){
            System.out.println("Old enought to vote!");
        }else   {
            System.out.println("Not old enough to vote");
                
        //if, else
        if(20 > 18){ // > är större än, < är mindre än
            System.out.println("20 är större än 18");
        }else{
            System.out.println("Error");
        }
                    
        //nytt
        int z = 20;
        int y = 190;
       
        if(z>y){
           System.out.println("Z är större än Y");
        }else{
            System.out.println("Y är större än Z");
        }        
        //nytt
        int time = 8;
        if (time < 18){
            System.out.println("God dag");
        }else{        
            System.out.println("God kväll");
        }
                
        int time2 = 22;
        if(time2 < 10){ //vilkor 1, ehto 1
            System.out.println("Good morning");
        }else if(time2 < 18){ //vilkor 2, ehto 2
            System.out.println("God dag");
        }else{ // vilkor 3, ehto 3
            System.out.println("God kväll");
        } 
                
        //nytt
        int time = 20;
        //1
        if(time < 18);
            System.out.println("God dag");
        } else{
            System.out.println("God kväll");
        }
        
        //version 2
        String result = (time < 18)? "God dag" : "God kväll";
        System.out.println("result");
        
        //Exempel på Else
        
        }else[]
                
    }
}

*/
public class newJavaFile{
    
    public static void main(String args[]){
        //string, int, float, char, bool
        //string
        String name = "Bob";
        System.out.println(name);
        //int (heltal, positiva (?))
        int Num = 10;
        System.out.println(Num);
        //Float
        float FloatNum = 5.99f;
        System.out.println(FloatNum);  
        //Char (Character)
        char char1 = "H";
    }        
}
//nytt
/*
public class JavaSwitch {
    
    public static void main (String args[]) {
    int day = 3;

    switch(dag){
        case 1:
            System.out.println("Måndag");
            break;
        case 2:
            System.out.println("Tisdag");
            break;    
        case 3:
            System.out.println("Onsdag");
            break;    
        case 4:
            System.out.println("Torsdag");
            break;
        case 5:
            System.out.println("Fredag");
            break;
        case 6:
            System.out.println("Lördag");
            break;
        case 7:
            System.out.println("Söndag");
            break;
    }
}
*/
//nedan följer
/*
public class NewFile {

    public static void main(String args[]) {
        
        //version 1
        int = 0
        while(i < 10);
            System.out.println(i);
            i++;
        
        //version 2
        int i
        while(i > 10);        
            System.out.println(i);
            i++ //det ökar med 1
        }
        while (i < 7)
        
        //version 3
        int nedrakning = 10;
        while (nedrakning > 10);
            System.out.println(nedrakning);
            nedrakning--; //detta minskar med 1
        }
        System.out.println("Gott nytt år");
    }    
}
*/
/*    
public class JavaForLoop {
    
    public static void main(String args[]) {
        
        
        //version 1
        for (int i = 0; i < 10; i++){ // i-- skapar en evig repetition
            System.out.println(i);
        
        //version 2
        for (int i = 0; i < 10; i = i + 2){ // repetitionsvärdet ökas med 2.
            System.out.println(i);
            
            
        //version 3, "arrey"
        String[] name = ("Bob", "Jacob", "Steve", "Joe");
        for (String i : name){
            System.out.println(i);  
            
        //version 4
        for(int i = 1; i <= 2; i++){
            System.out.println("Outside: " +i); // detta körs två gånger
        
        for(int j = 1); j <= 3; j++)
            System.out.println("Inside: " +j); //detta körs tre gånger
            
        //version 5
        int number = 3;
        for(itne i = i; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
            
        //version 6
        
        }
    }
}
*/    
// nytt
/*
//detta fungerar inte av någon anledning
public class JavaArrays {
    
    public static void main(String args[]) {
        String[] names =  {"Bob", "Steve", "Jakob"};
        //int array
        int[] Numbers ={1, 2, 3, 4, 5, 6};
        //räknande börjar från 0
        System.out.println(names[0]);
        System.out.println(Numbers[0]);
        //"length of an array"
        System.out.println(names.length);
        System.out.println(Numbers.length);
        //namn i utskrifts omlopp (loop)
        for(int i = 6; i <= names.length);
            System.out.println(Numbers[i]);
    }
}    
*/
/*
//denna fungerar/tämä toimii
public class JavaArrayExample {
    
    public static void main(String args[]) {
        int ages[] = {10, 15, 20, 25, 30, 35, 40, 45, 55};
        
        float avg, sum = 0;
        
        int length = ages.length;
        //här kommer en circulation
        for (int age: ages){
            sum += age;
        }   
        //räkning av medeltal
        avg = sum / length;
        
        System.out.println("The average age is: " + avg);
    }          
}
*/
/*
//denna fungerar också
public class JavaBreakandContinue {
    
    public static void main(String args[]) {
        for(int i = 0; i < 10; i++) {
            if(i == 7){
                break;
            }
            System.out.println(i);
        }
        */
        /*        
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
            if(i == 5){
                break;
            }
        }    
        
    }
}
*/                

/*
public class JavaSkipEven {
    
    public static void main(String args[]) {
    
        //cirkulation från 1+10
        for(int i = 1; i <= 10; i++){
            //"If even skip"
            if(i % 2 == 0){
                //"skips the loop"
                continue;
            }
            //print odd numbers
            System.out.println(i);
        }
    }
}   
*/

