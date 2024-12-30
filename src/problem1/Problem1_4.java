package problem1;

import java.util.Scanner;

public class Problem1_4 {

    public void solution(String[] inputs) {
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = new StringBuilder(inputs[i]).reverse().toString();
            //배열에 있는 단어들을 StringBuilder.reverse 사용해서 다시 배열에 대입
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt(); //N개의 단어를 quantity변수에 넣어 놓고
        sc.nextLine(); //줄바꿈(개행문자 처리)
        String[] inputs = new String[quantity]; //N개의 단어만큼 배열 선언

        for (int i = 0; i < quantity; i++) { //for문 돌려서 배열들에 담아 주고
            inputs[i] = sc.nextLine();
        }

        new Problem1_4().solution(inputs); //정답처리 메서드 선언한 후

        for (String s : inputs) { //정답들 출력 처리
            System.out.println(s);
        }
    }
}
