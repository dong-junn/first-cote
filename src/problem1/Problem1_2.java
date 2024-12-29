package problem1;

import java.util.Scanner;

public class Problem1_2 {

    public void solution(String input) {

        char[] inputCharArray = input.toCharArray();

        for (int i = 0; i < inputCharArray.length; i++) {
            inputCharArray[i] = Character.isUpperCase(inputCharArray[i])
            ? Character.toLowerCase(inputCharArray[i])
            : Character.toUpperCase(inputCharArray[i]);
        }

        System.out.println(inputCharArray);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        new Problem1_2().solution(input);
    }
}
