package problem1.review;

import java.util.*;

public class Problem1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Problem1_2().solution(str));
    }

    public String solution(String input) {
        StringBuilder sb = new StringBuilder();
        for(char c : input.toCharArray()) {
            sb = (Character.isLowerCase(c)) ? sb.append(Character.toUpperCase(c)) : sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }
}
