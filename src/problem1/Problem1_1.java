package problem1;

import java.util.Scanner;

public class Problem1_1 {

    public static int answerCount = 0;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        solution(input1, input2);
        System.out.println(answerCount);
    }

    private static void solution(String input1, String input2) {
        String input1TolowerCase = input1.toLowerCase();
        char input2Char = input2.toLowerCase().charAt(0);

        char[] input1CharArray = input1TolowerCase.toCharArray();
        for (int i = 0; i < input1CharArray.length; i++) {
            if (input1CharArray[i] == input2Char) {
                answerCount++;
            }
        }
    }

}
