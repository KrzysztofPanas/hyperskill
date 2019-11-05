/*
Given the number N with an even number of digits.
If the sum of the first half of the digits equals the sum of the second half of the digits, then this number is considered lucky.
For a given number, output "YES" if this number is lucky, otherwise output "NO".
 */
package machine;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int halfDigitsSum = 0;
        for (int i = 0; i < input.length() / 2; i++) {
            halfDigitsSum += Character.getNumericValue(input.charAt(i));
        }
        for (int i = input.length() / 2; i < input.length(); i++) {
            halfDigitsSum -= Character.getNumericValue(input.charAt(i));
        }
        if (halfDigitsSum == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
