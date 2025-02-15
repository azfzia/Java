This Java program is designed to display a calendar for a specific month and year entered by the user. It uses basic programming constructs like loops, conditionals, and methods to achieve this. Below is a detailed explanation of the code:

Structure of the Program
The program is divided into several methods, each responsible for a specific task. Here's an overview of the methods and their purposes:

main Method:

Entry point of the program.

Takes user input for the year and month.

Calls the printMonth method to display the calendar.

printMonth Method:

Calls printMonthTitle to display the month and year heading.

Calls printMonthBody to display the days of the month.

printMonthTitle Method:

Displays the month name and year.

Prints the days of the week (Sun, Mon, Tue, etc.).

getMonthName Method:

Returns the name of the month based on the month number.

printMonthBody Method:

Calculates the starting day of the month.

Prints the days of the month in a grid format.

getStartDay Method:

Calculates the day of the week for the first day of the month.

getTotalNumberOfDays Method:

Calculates the total number of days from January 1, 1800, to the start of the given month and year.

getNumberOfDaysInMonth Method:

Returns the number of days in a given month, accounting for leap years in February.

isLeapYear Method:

Determines if a given year is a leap year.

Detailed Explanation of Each Method
1. main Method
java
Copy
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter month as number between 1 and 12 : ");
    int month = sc.nextInt();

    System.out.println("Enter the full year e.g : 2012");
    int year = sc.nextInt();

    printMonth(year, month);
}
Prompts the user to enter a month (1–12) and a year.

Calls the printMonth method to display the calendar for the specified month and year.

2. printMonth Method
java
Copy
public static void printMonth(int year, int month) {
    printMonthTitle(year, month); // Print the month and year heading
    printMonthBody(year, month);  // Print the days of the month
}
Calls printMonthTitle to display the heading (month name and year).

Calls printMonthBody to display the days of the month.

3. printMonthTitle Method
java
Copy
public static void printMonthTitle(int year, int month) {
    System.out.println("           " + getMonthName(month) + " " + year);
    System.out.println("-----------------------------");
    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
}
Displays the month name and year.

Prints the days of the week (Sunday to Saturday).

4. getMonthName Method
java
Copy
public static String getMonthName(int month) {
    return switch (month) {
        case 1 -> "January";
        case 2 -> "February";
        case 3 -> "March";
        case 4 -> "April";
        case 5 -> "May";
        case 6 -> "June";
        case 7 -> "July";
        case 8 -> "August";
        case 9 -> "September";
        case 10 -> "October";
        case 11 -> "November";
        case 12 -> "December";
        default -> "";
    };
}
Uses a switch statement to return the name of the month based on the month number.

5. printMonthBody Method
java
Copy
public static void printMonthBody(int year, int month) {
    int startDay = getStartDay(year, month); // Get the starting day of the month
    int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month); // Get the number of days in the month

    // Print leading spaces for the first week
    for (int i = 0; i < startDay; i++) {
        System.out.print("    ");
    }

    // Print the days of the month
    for (int day = 1; day <= numberOfDaysInMonth; day++) {
        System.out.printf("%4d", day); // Print each day with proper spacing
        if ((day + startDay) % 7 == 0) // Move to the next line after Saturday
            System.out.println();
    }

    System.out.println();
}
Calculates the starting day of the month using getStartDay.

Prints leading spaces to align the first day of the month correctly.

Prints the days of the month in a grid format, moving to the next line after Saturday.

6. getStartDay Method
java
Copy
public static int getStartDay(int year, int month) {
    final int START_DAY_FOR_JANUARY_1_1800 = 3; // January 1, 1800, was a Wednesday (3)
    int totalNumberOfDays = getTotalNumberOfDays(year, month); // Total days from 1800 to the given month
    return (totalNumberOfDays + START_DAY_FOR_JANUARY_1_1800) % 7; // Calculate the starting day
}
Uses a fixed reference point (January 1, 1800, was a Wednesday).

Calculates the total number of days from January 1, 1800, to the start of the given month and year.

Returns the day of the week for the first day of the month (0 = Sunday, 1 = Monday, etc.).

7. getTotalNumberOfDays Method
java
Copy
public static int getTotalNumberOfDays(int year, int month) {
    int total = 0;

    // Add days for each year from 1800 to the year before the given year
    for (int i = 1800; i < year; i++) {
        total += isLeapYear(i) ? 366 : 365;
    }

    // Add days for each month before the given month in the given year
    for (int i = 1; i < month; i++) {
        total += getNumberOfDaysInMonth(year, i);
    }

    return total;
}
Calculates the total number of days from January 1, 1800, to the start of the given month and year.

Accounts for leap years when calculating the total days.

8. getNumberOfDaysInMonth Method
java
Copy
public static int getNumberOfDaysInMonth(int year, int month) {
    return switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        case 4, 6, 9, 11 -> 30;
        case 2 -> isLeapYear(year) ? 29 : 28;
        default -> 0; // Invalid month
    };
}
Returns the number of days in the given month, accounting for leap years in February.

9. isLeapYear Method
java
Copy
public static Boolean isLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
}
Determines if a given year is a leap year.

A year is a leap year if it is divisible by 400 or divisible by 4 but not by 100.

Example Output
For input year = 2023 and month = 10:

Copy
           October 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
   1    2    3    4    5    6    7
   8    9   10   11   12   13   14
  15   16   17   18   19   20   21
  22   23   24   25   26   27   28
  29   30   31
Key Points
The program uses a fixed reference point (January 1, 1800) to calculate the starting day of the month.

Leap years are handled correctly for February.

The calendar is displayed in a grid format, with days aligned under their respective weekdays.

This program is a great example of how to break down a complex problem into smaller, manageable methods.

