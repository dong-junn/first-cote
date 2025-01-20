package problem1.review;

import java.util.Scanner;

public class Problem1_8 {

    private static String solution(String input) {
        String answer = "NO";
        input = input.toLowerCase().replaceAll("[^a-zA-Z]", "");
        StringBuilder sb = new StringBuilder(input);
        if (input.equals(sb.reverse().toString())) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
