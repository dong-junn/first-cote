package problem1;

import java.util.Scanner;

public class Problem1_9 {

    public String solution(String str) {
        str = str.replaceAll("[^0-9]", "");
        return String.valueOf(Integer.parseInt(str));

//아래 방법으로도 가능하나 parseInt를 사용하면 더 쉽게 처리할 수 있다
/*
        String answer = "";
        str = str.replaceAll("[^0-9]", "");
        boolean isZero = false;
        for(char c : str.toCharArray()) {
            if (!isZero && c == '0') continue;
            isZero = true;
            answer += c;
        }
        return answer;
*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new Problem1_9().solution(input));
    }
}
