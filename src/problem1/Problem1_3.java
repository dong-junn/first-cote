package problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1_3 {

    public String solution(String input) {

        String answer = "";
        ArrayList<Integer> blanks = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) { //공란 위치 blanks 리스트에 저장
            if (input.charAt(i) == ' ') {
                blanks.add(i);
            }
        }

        if (blanks.isEmpty()) {  // 공백이 없는 경우 그대로 리턴
            return input;
        }

        words.add(input.substring(0, blanks.get(0))); //first word
        for (int i = 0; i < blanks.size() - 1; i++) {
            words.add(input.substring(blanks.get(i) + 1, blanks.get(i + 1))); //찾은 공란을 기반으로 단어 쪼개서 words에 저장
        }
        words.add(input.substring(blanks.get(blanks.size() - 1) +1)); //last word

        for (String s : words) { //단어 비교해서 현재 단어가 더 크면 answer에 대입
            if (s.length() > answer.length()) {
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new Problem1_3().solution(input));

    }
}
