package comparingPets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pet> listOfPets = new ArrayList<>();



        System.out.println("How many pets do you have");

        int x = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i <  x ; i++){
            System.out.println("What type of pet do you have");
            String typeAnswer = scanner.nextLine();

            if(typeAnswer.equalsIgnoreCase("Dog")){
                System.out.println("What is the name of your dog?");
                String name = scanner.nextLine();
                listOfPets.add(new Dog(name));

            }else if(typeAnswer.equalsIgnoreCase("Cat")){
                System.out.println("What is the name of your cat?");
                String name = scanner.nextLine();
                listOfPets.add(new Cat(name));

            }else if(typeAnswer.equalsIgnoreCase("Bird")) {
                System.out.println("What is the name of your bird?");
                String name = scanner.nextLine();
                listOfPets.add(new Bird(name));
            }
            }




        Collections.sort(listOfPets);

        for (Pet l : listOfPets){
            System.out.println(l);
        }


        System.out.println("----------------------");

        TypeComparator typeComparator = new TypeComparator();
        Collections.sort(listOfPets, typeComparator);


        for (Pet l : listOfPets){
            System.out.print(l);
            l.makeNoise();

        }
    }



}
