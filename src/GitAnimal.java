import java.util.Scanner;

public class GitAnimal {
    
    public static void main(String[] args){
        
        Scanner inputScanner = new Scanner(System.in);

        String selectedAnimal = "";

         while ( !selectedAnimal.equals("dog") && !selectedAnimal.equals("cat"))   
           
            System.out.println("Would you like to see a dog or a cat?");
            selectedAnimal = inputScanner.next();
         
            if (selectedAnimal.equals("dog"))
                {
                    System.out.println("");
                }
                else if (selectedAnimal.equals("cat"))
                {
                    System.out.println("");
                }
                else
                {
                    System.out.println("Not available");
                }
    }
}