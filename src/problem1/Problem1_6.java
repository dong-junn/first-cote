package problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1_6 {

    /**
     *     고민결과 ArrayList의 contains를 활용하는 방식을 사용
     *     입력 문자열의 길이만큼 for문을 돌리고
     *     for문 안에서는 contains로 검증하는 방법으로 정답 도출

     */
    public String solution(String str) {

        //contains 메서드를 사용하기 위해 ArrayList 사용
        ArrayList<Character> answerChar = new ArrayList<>();

        /*
        입력 문자열의 길이만큼 돌리고 contains를 통해 i위치의 문자가
        ArrayList에 포함되어 있지 않을때 ArrayList에 추가한다
         */
        for (int i = 0; i < str.length(); i++) {
            if (!answerChar.contains(str.charAt(i))) {
                answerChar.add(str.charAt(i));
            }
        }

        //이후 ArrayList에 있는 char들을 string화 해준 후 정답으로 return
        StringBuilder sb = new StringBuilder();
        for (Character c : answerChar) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Problem1_6().solution(str));
    }
}
