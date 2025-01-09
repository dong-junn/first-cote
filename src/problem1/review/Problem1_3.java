package problem1.review;

import java.util.*;

public class Problem1_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Problem1_3().solution(str));
    }

    public String solution(String input) {
        String answer = "";
        String[] words = input.split(" ");
        for (String s : words) {
            if (s.length() > answer.length()) answer = s;
        }
        return answer;
    }
}
