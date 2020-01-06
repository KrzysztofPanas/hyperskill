/* Alphabetical order
Write a program that reads an array of strings and checks whether the array is in alphabetical order or not.
There are several rules to do it:
1) You can compare chars with < to see if one comes before the other one (i.e. by comparing ASCII values).
2) Shorter strings come before longer strings whenever the shorter string is a subset of the longer one. So, "a" comes before "abc".
3) Finally, strings which are identical are in alphabetical order.

Input data format
The single input line contains strings separated by spaces.

Output data format
Only a single value - true or false.

Sample Input 1: a b c
Sample Output 1: true
Sample Input 2: a b c z a
Sample Output 2: false
 */
package flashcards;


import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[][] asciiArrayOfChars = new int[input.length()][input.length()];
        int rowNumber = 0;
        int colNumber = 0;
        for (int i = 0; i < input.length(); i++) {
            if ((int) input.charAt(i) != 32) {
                asciiArrayOfChars[rowNumber][colNumber] = (int) input.charAt(i);
                System.out.println(rowNumber + "." + colNumber + " = " + asciiArrayOfChars[rowNumber][colNumber]);
                colNumber++;
            } else {
                rowNumber++;
                colNumber = 0;
            }
        }
        boolean answear = true;
        for (int i = 0; i < rowNumber; i++) {
            int j = 0;

            while (asciiArrayOfChars[i][j] != 0) {
                if (asciiArrayOfChars[i][j] > asciiArrayOfChars[i + 1][j]) {
                    answear = false;
                    break;
                }
                j++;
            }
        }
        System.out.println(answear);

    }
}
