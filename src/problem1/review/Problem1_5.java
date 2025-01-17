package problem1.review;

import java.util.Scanner;

public class Problem1_5 {

    private static String solution(String input) {
        char[] charArray = input.toCharArray();
        int lt = 0, rt = charArray.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else {
                char tmp = charArray[rt];
                charArray[rt] = charArray[lt];
                charArray[lt] = tmp;
                lt++;
                rt--;
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
