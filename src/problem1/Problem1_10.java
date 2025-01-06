package problem1;

import java.util.Scanner;

public class Problem1_10 {

    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;

        for (int i = 0; i < answer.length; i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = answer.length -1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        for (int i : new Problem1_10().solution(input, c)) {
            System.out.print(i + " ");
        }
    }
}
