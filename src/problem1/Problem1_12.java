package problem1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1_12 {

    public String solution(String str, int quantity) {
        str = str.replace('#', '1').replace('*', '0');
        char[] arr = new char[quantity];
        for (int i = 0; i < quantity; i++) {
            arr[i] = (char)Integer.parseInt(str.substring(i * 7, i * 7 + 7), 2);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        String str = sc.next();
        System.out.println(new Problem1_12().solution(str, quantity));
    }
}
