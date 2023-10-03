package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

    while (true) {
        Scanner input = new Scanner(System.in);

        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nChoose your pet number: ");
        Integer choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet;

        switch(choice){
            case 1: pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                ((Dog) pet).setBreed("German Shepperd");
                System.out.println("Dog's Breed : " + ((Dog) pet).getBreed());
                System.out.println();
                break;
            case 2: pet = new Cat();             
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);           
                System.out.println("Number of Lives: " + ((Cat) pet).getNoOfLives());
                System.out.println();
                break;
            case 3: 
            	System.out.println("System Exiting...");
            	System.exit(0);
            	break;
            default:
            	System.out.println("Invalid input, try again.");
            	System.out.println();
            	break;
          
        }
        

    }
    
  } 
}
