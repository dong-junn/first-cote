package problem1.review;

import java.util.Scanner;

public class Problem1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            words[i] = sc.nextLine();
        }
        words = new Problem1_4().solution(words, count);
        for (String word : words) {
            System.out.println(word);
        }
    }
    public String[] solution(String[] words, int count) {
        for (int i = 0; i < count; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return words;
    }
}
