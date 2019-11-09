/*
Given a simple equation, you should output the correct value for variable "x". The equation has two numbers greater than 0 and variable "x", and between these can be "+", "-" or "=". Numbers, variable "x", symbols "+", "-", "=" all separated by a space.
It is guaranteed that the equation is correct. The result should be an integer.
Sample Input 1: 5 + x = 15 Sample Output 1: 10
Sample Input 2: x - 8 = 10 Sample Output 2: 18
Sample Input 3: 10 = 12 + x Sample Output 3: -2
 */
package machine;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstElement = scanner.next();
        String operator = scanner.next();
        String secondElement = scanner.next();
        String equalitySign = scanner.next();
        String result = scanner.nextLine();
        if (equalitySign.contains("=")) {
            if (result.contains("x")) {
                if (operator.contains("+")) {
                    System.out.println(Integer.parseInt(firstElement) + Integer.parseInt(secondElement));
                } else {
                    System.out.println(Integer.parseInt(firstElement) - Integer.parseInt(secondElement));
                }

            } else {
                String resultClean = result.substring(1);
                calculte(firstElement, operator, secondElement, resultClean);
            }
        } else {
            if (firstElement.contains("x")) {
                String cleanResult = result.substring(1);
                if (equalitySign.contains("+")) {
                    System.out.println(Integer.parseInt(secondElement) + Integer.parseInt(cleanResult));
                } else {
                    System.out.println(Integer.parseInt(secondElement) - Integer.parseInt(cleanResult));
                }
            } else {
                String resultClean = result.substring(1);
                calculte(secondElement, equalitySign, resultClean, firstElement);

            }
        }
    }

    private static void calculte(String firstElement, String operator, String secondElement, String result) {
        if (operator.contains("+")) {
            if (firstElement.contains("x")) {
                System.out.println(Integer.parseInt(result) - Integer.parseInt(secondElement));
            } else {
                System.out.println(Integer.parseInt(result) - Integer.parseInt(firstElement));
            }
        } else {
            if (firstElement.contains("x")) {
                System.out.println(Integer.parseInt(result) + Integer.parseInt(secondElement));
            } else {
                System.out.println(Integer.parseInt(firstElement) - Integer.parseInt(result));
            }
        }
    }
}
