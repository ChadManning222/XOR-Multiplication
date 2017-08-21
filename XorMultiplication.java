/**
 * @author: Chad.
 * Instructor: Hal Mendoza
 * Class: Comp B11 TTh @ 1 pm
 * Created on: 5/16/2017
 */

import java.util.Scanner;

public class XorMultiplication {
    public static void main(String[] args) {
        int operand1, operand2, result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two Integers: ");
        operand1 = scanner.nextInt();
        operand2 = scanner.nextInt();
        scanner.close();
        result = XorMultiply(operand1, operand2);

        System.out.printf("%d XOR %d = %d", operand1, operand2, result);
    }

    public static int XorMultiply(int op1, int op2) {
        String op1Binary = Integer.toBinaryString(op1);
        String op2Binary = Integer.toBinaryString(op2);
        String xorResult = "";
        String smallerNum, biggerNum;

        smallerNum = (op1 < op2) ? op1Binary : op2Binary;
        biggerNum = (op2 < op1) ? op1Binary : op2Binary;
        while(smallerNum.length() != biggerNum.length()) {
            smallerNum = "0" + smallerNum;
        }

        for(int i = 0; i < smallerNum.length(); ++i) {
            if(smallerNum.charAt(i) != biggerNum.charAt(i)) {
                xorResult += "1";
            } else {
                xorResult += "0";
            }
        }

        return Integer.parseInt(xorResult, 2);
    }
}
