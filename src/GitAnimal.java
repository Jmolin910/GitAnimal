import java.util.Scanner;

public class GitAnimal {
    
    public static void main(String[] args){
        
        Scanner inputScanner = new Scanner(System.in);

        String selectedAnimal = "";

         while ( !selectedAnimal.equals("dog") && !selectedAnimal.equals("cat") && !selectedAnimal.equals("fish") && !selectedAnimal.equalsIgnoreCase("bird")){   
           
            System.out.println("Would you like to see a dog, cat, fish, or a bird?");
            selectedAnimal = inputScanner.next();
         
            if (selectedAnimal.equals("dog"))
            {
                System.out.println("  .");
                System.out.println(" ..^____/");
                System.out.println("`-. ___ )");
                System.out.println("  ||  || ");
            }
            else if (selectedAnimal.equals("cat"))
            {
                System.out.println("  ^~^  ,");
                System.out.println(" ('Y') )");
                System.out.println(" /   \\");
                System.out.println("(/|||/)");
            }
            else if (selectedAnimal.equals("fish"))
            {
                System.out.println(" __v_");
                System.out.println("(____\\/{");
            }
            else if (selectedAnimal.equalsIgnoreCase("bird"))
            {
                System.out.println(" /\\_/\\\n((@v@))\n():::()\n VV-VV");
            }
            else
            {
                System.out.println("Not available");
            }
        }
    }
}