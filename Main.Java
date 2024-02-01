import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first breakfast item: ");
        String item1 = input.nextLine();
        System.out.println("How many calories was " + item1 + " ?");
        int calories1 = input.nextInt();
        input.nextLine();

        System.out.println("Enter the second breakfast item: ");
        String item2 = input.nextLine();
        System.out.println("How many calories was " + item2 + " ?");
        int calories2 = input.nextInt();
        input.nextLine();

        System.out.println("Enter first lunch item: ");
        String item3 = input.nextLine();
        int calories3 = getCalories(input, item3);

        System.out.println("Enter the second lunch item: ");
        String item4 = input.nextLine();
        int calories4 = getCalories(input, item4);

        System.out.println("Enter first dinner item: ");
        String item5 = input.nextLine();
        int calories5 = getCalories(input, item5);

        System.out.println("Enter the second dinner item: ");
        String item6 = input.nextLine();
        int calories6 = getCalories(input, item6);

        input.close();

        System.out.println("\nBreakfast item 1: " + item1 + " : " + calories1 + " calories");
        System.out.println("Breakfast item 2: " + item2 + " : " + calories2 + " calories");
        System.out.println("Total Breakfast calories: " + (calories1 + calories2));

        System.out.println("\nLunch item 1: " + item3 + " : " + calories3 + " calories");
        System.out.println("Lunch item 2: " + item4 + " : " + calories4 + " calories");
        System.out.println("Total Lunch calories: " + (calories3 + calories4));

        System.out.println("\nDinner item 1: " + item5 + " : " + calories5 + " calories");
        System.out.println("Dinner item 2: " + item6 + " : " + calories6 + " calories");
        System.out.println("Total Dinner calories: " + (calories5 + calories6));

        int totalCalories = calories1 + calories2 + calories3 + calories4 + calories5 + calories6;
        System.out.println("\nTotal calories for the day: " + totalCalories);
    }

    private static int getCalories(Scanner input, String item) {
        int calories = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("How many calories was " + item + " ?");
                calories = input.nextInt();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for calories.");
                input.nextLine();
            }
        }

        input.nextLine();
        return calories;
    }
}
