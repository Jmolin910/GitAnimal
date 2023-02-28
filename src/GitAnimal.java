import java.util.Scanner;

public class GitAnimal {
    public static void main(String[] args){
        
        Scanner inputScanner = new Scanner(System.in);

        String selectedAnimal = "";

        System.out.println("Would you like to see a dog or a cat?");
        selectedAnimal = inputScanner.next();
    }
}