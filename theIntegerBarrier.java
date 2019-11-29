/*
 The integer barrier
Write a program that reads a sequence of integer numbers in a loop and adds up all numbers.
If a new number is equal to 0, the program must stop the loop and output the accumulated sum.
When the sum is equal or exceeded 1000 (the barrier), the program should also stop and output the value equal to sum - 1000.
Note, the input can contain extra numbers. Just ignore them.
Sample Input 1:
800
101
102
300
0
Sample Output 1:
3
Sample Input 2:
103
105
109
0
1000
Sample Output 2:
317
 */
package machine;

import java.util.Scanner;

public class theIntegerBarrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        int sum = 0;
        int input = 1;
        int output = 0;
        boolean gotAnswer = false;
            while (!(line = scanner.nextLine()).isEmpty()) {
                input = Integer.parseInt(line);
                if (input == 0 && gotAnswer == false) {
                    gotAnswer = true;
                } else {
                    sum += input;
                    if (sum >= 1000 && gotAnswer == false) {
                        output = sum - 1000;
                        gotAnswer = true;

                    } else if (gotAnswer == false){
                        output = sum;
                    }
                }

            }
        System.out.println(output);
        }
    }

