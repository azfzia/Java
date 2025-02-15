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



MORE details for number 7: (using deepseek)
Purpose of the Method
The method getTotalNumberOfDays calculates the total number of days from January 1, 1800, up to the start of the given month and year. For example:

If you pass year = 2023 and month = 5, it will calculate the total number of days from January 1, 1800, to May 1, 2023.

Key Components
1800 is the Starting Year:

The method assumes January 1, 1800, as the starting point. This is an arbitrary choice, and 1800 is used as the base year for the calculation.

Leap Years:

Leap years have 366 days instead of 365. The method checks if a year is a leap year using the isLeapYear method.

Days in Each Month:

The number of days in each month varies (e.g., January has 31 days, February has 28 or 29 days in a leap year, etc.). The method uses the getNumberOfDaysInMonth method to determine the number of days in a specific month.

Step-by-Step Explanation
1. Adding Days for Each Year (1800 to the Year Before the Given Year)
java
Copy
for (int i = 1800; i < year; i++) {
    total += isLeapYear(i) ? 366 : 365;
}
This loop iterates through every year from 1800 up to the year before the given year.

For each year, it checks if the year is a leap year using the isLeapYear method:

If it’s a leap year (isLeapYear(i) returns true), it adds 366 days to total.

If it’s not a leap year, it adds 365 days to total.

By the end of this loop, total will contain the total number of days from January 1, 1800, to December 31 of the year before the given year.

2. Adding Days for Each Month Before the Given Month in the Given Year
java
Copy
for (int i = 1; i < month; i++) {
    total += getNumberOfDaysInMonth(year, i);
}
This loop iterates through every month from January (1) up to the month before the given month.

For each month, it uses the getNumberOfDaysInMonth method to determine how many days are in that month.

For example:

January has 31 days.

February has 28 days (or 29 days in a leap year).

April has 30 days, etc.

It adds the number of days for each month to total.

By the end of this loop, total will contain the total number of days from January 1, 1800, to the start of the given month and year.

Example Walkthrough
Let’s say we call the method with year = 2023 and month = 5 (May 2023):

Step 1: Add Days for Each Year (1800 to 2022):

The loop runs from 1800 to 2022.

For each year, it adds 365 or 366 days depending on whether it’s a leap year.

For example:

1800: 365 days (not a leap year).

2000: 366 days (leap year).

2022: 365 days (not a leap year).

After this step, total will contain the total number of days from January 1, 1800, to December 31, 2022.

Step 2: Add Days for Each Month (January to April 2023):

The loop runs from January (1) to April (4).

For each month, it adds the number of days:

January: 31 days.

February: 28 days (2023 is not a leap year).

March: 31 days.

April: 30 days.

After this step, total will contain the total number of days from January 1, 1800, to April 30, 2023.

Final Result:

The method returns total, which is the total number of days from January 1, 1800, to May 1, 2023.

Why 1800?
The year 1800 is just an arbitrary starting point. You could choose any other year as the base year, but 1800 is commonly used in such calculations because it’s a relatively recent year and simplifies the logic.

Key Methods Used
isLeapYear(int year):

This method checks if a given year is a leap year. A leap year is divisible by 4 but not by 100, unless it’s also divisible by 400.

getNumberOfDaysInMonth(int year, int month):

This method returns the number of days in a specific month of a specific year. It accounts for February having 28 or 29 days depending on whether the year is a leap year.

Summary
The method calculates the total number of days from January 1, 1800, to the start of the given month and year.

It does this by:

Adding the total days for all years from 1800 to the year before the given year.

Adding the total days for all months from January to the month before the given month in the given year.

The result is the cumulative number of days up to the start of the specified month and year.

Let me know if you need further clarification! 😊

