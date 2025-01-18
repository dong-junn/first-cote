package problem1.review;

import java.util.Scanner;

public class Problem1_6 {

    private static String solution(String input) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) {
                answer.append(input.charAt(i));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
