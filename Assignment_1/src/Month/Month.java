package Month;
import java.util.Scanner;

public class Month{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month name: ");
        String monthName = scanner.nextLine().toLowerCase(); 
        scanner.close();

        int daysInMonth = getDaysInMonth(monthName);
        
        if (daysInMonth != -1) {
            System.out.println("Number of days in " + monthName + ": " + daysInMonth);
        } else {
            System.out.println("Invalid month name.");
        }
    }

    public static int getDaysInMonth(String month) {
        switch (month) {
            case "january": case "march": case "may": case "july":
            case "august": case "october": case "december":
                return 31;
            case "april": case "june": case "september": case "november":
                return 30;
            case "february":
                return 28; 
            default:
                return -1; 
        }
    }
}

