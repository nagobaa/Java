public class NewJavaFile{
    
    public static void main(String args[]){
        
        int ElevensPoang = 50;
        
        if (ElevensPoang >= 90){
            System.out.println("The grade of the student is 5");
        } else if(ElevensPoang >= 80){
            System.out.println("The grade of the student is 4");
        } else if (ElevensPoang >= 70){
            System.out.println("The grade of the student is 3");
        } else if (ElevensPoang >= 60){
            System.out.println("The grade of the student is 2");    
        } else if (ElevensPoang >= 25){
            System.out.println("The grade of the student is 1");
        } else if (ElevensPoang >= 0){
            System.out.println("The grade of the student is 0");
        } else {
            System.out.println("Something went wrong.");
        }
    }                
}
    

