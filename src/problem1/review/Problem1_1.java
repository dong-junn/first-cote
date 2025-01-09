package problem1.review;

import java.util.*;

public class Problem1_1 {

    public int solution(String str, String c) {
        str = str.toLowerCase();
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (c.toLowerCase().equals(String.valueOf(ch))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String c  = sc.nextLine();
        System.out.println(new Problem1_1().solution(str ,c));
    }
}
