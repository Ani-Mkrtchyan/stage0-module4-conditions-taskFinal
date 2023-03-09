package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year <= 0) {
            System.out.println("invalid date");

        } else if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && (month == 2)) {
            System.out.println("The month has 28 or 29 days.");
        } else {
            System.out.println(
                    switch (month) {
                        case 1, 3, 5, 7, 8, 10, 12 -> "The month has 31 days";
                        case 4, 6, 9, 11 -> "The month has 30 days";
                        case 2 -> "The month has 28 or 29 days.";
                        default -> "invalid date";
                    }
            );
        }
    }


    public static void main(String[] args) {
        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.printDays(2022, 4);
    }
}
