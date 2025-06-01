import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*  Enum----special type of class that represent fixed types of
            constants
            Improve code readability and are easy to maintain
            more efficient with switches when comparing strings

  */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String response = scanner.nextLine().toUpperCase();
        try {
            Day day = Day.valueOf(response);


            switch (day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY->System.out.println("it is a week day");
                case SATURDAY,
                     SUNDAY-> System.out.println("it is a weekend");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("please enter the valid day");
        }

        scanner.close();

    }
}