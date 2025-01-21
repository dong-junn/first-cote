package problem1.review;

import java.util.Scanner;

public class Problem1_9 {

    private static int solution(String input) {
        input = input.replaceAll("[^0-9]", "");
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
