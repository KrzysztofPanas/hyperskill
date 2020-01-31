/*
Implement a function for preparing full name. The function takes two string arguments: firstName and lastName.
You need to concat them together with a space in the middle.
If an argument is null then do not add it and a space to the full name.

Sample Input 1:
Joseph
Brown
Sample Output 1: Joseph Brown
Sample Input 2:
Joseph
null
Sample Output 2: Joseph
 */
package flashcards;

import java.util.Scanner;

public class PreparingFullName {

    public static String prepareFullName(String firstName, String lastName) {
        String nameOne = (firstName == null) ? "NA" : firstName;
        String nameTwo = (lastName == null) ? "NA" : lastName;
        if (!nameOne.equals("NA") && !nameTwo.equals("NA")) return nameOne+" "+nameTwo;
        else if (nameOne.equals("NA")) return nameTwo;
        else return nameOne;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }

}
