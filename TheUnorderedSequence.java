/*
Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered (in ascending or descending order), otherwise, false.
Keep in mind, if a number has the same value as the following number, it does not break the order.
The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least one number (excluding 0).

Sample Input 1: 9 8 7 6 5 4 3 2 1 0
Sample Output 1: true
Sample Input 2:  1 2 3 3 9 0
Sample Output 2: true
Sample Input 3: 1 2 5 5 2 3 0
Sample Output 3: false
 */
package machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheUnorderedSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Integer i;
        do {
            i = scanner.nextInt();
            if (i != 0) list.add(i);
        } while (i != 0);
        boolean isOrdered = true;
        if (list.size() == 1) System.out.println(isOrdered);
        if (list.size() == 2) {
            if (list.get(0) == list.get(1)) System.out.println(!isOrdered);
            else System.out.println(isOrdered);
        }
        if (list.size() > 2) {
            for (i = 0; i < list.size() - 2; i++) {
                if (list.get(i) > list.get(i + 1) && list.get(i + 1) < list.get(i + 2) || list.get(i) < list.get(i + 1) && list.get(i + 1) > list.get(i + 2)) {
                    isOrdered = false;
                    break;
                }
            }
            System.out.println(isOrdered);
        }
    }
}
