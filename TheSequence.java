/*
Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to).
The input to the program is a positive integer n: the number of the elements of the sequence the program should print. Output the sequence of numbers, written in a single line, space-separated.
For example, if n = 7, then the program should output 1 2 2 3 3 3 4.
 */
package machine;

import java.util.Scanner;

public class TheSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digitsToPrint = scanner.nextInt();
        int printedSign = 1;
        while (digitsToPrint > 0) {
            for (int j = 0; j < printedSign; j++) {
                if (digitsToPrint > 0) {
                    System.out.print(printedSign + " ");
                }
                digitsToPrint--;
            }
            printedSign++;
        }
    }
}

