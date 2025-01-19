package problem1.review;

import java.util.Scanner;

public class Problem1_7 {

    private static String solution(String input) {
        String answer = "NO";
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
