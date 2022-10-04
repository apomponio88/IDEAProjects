package WeightCalculatorPackage;

import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {


        GainsCalculator calculator = new GainsCalculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the muscle group you wish to calculate");
        String muscleGroupInput = scanner.nextLine();

        System.out.println("Enter the exercise you are stuck at");
        String exerciseInput = scanner.nextLine();

        System.out.println("Enter the number of sets you are performing for this exercise");
        String setInput = scanner.nextLine();
        int setAsInt = Integer.parseInt(setInput);

        if(setAsInt < 4) {
            System.out.println("You need to increase your sets by another 2-3");
        }

        System.out.println("Enter the number of reps you perform for your FINAL set");
        String repInput = scanner.nextLine();
        int repAsInt =Integer.parseInt(repInput);

        if(repAsInt < 12) {
            System.out.println("You are a choir boy");
        }


        if(exerciseInput == "incline"){
            System.out.println("Switch to dumbbell press");
        }



    }

}
