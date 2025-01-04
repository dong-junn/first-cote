package problem1;

import java.util.*;

public class Problem1_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Problem1_8().solution(str));
    }

    public String solution(String str) {
        String filteredStr = toPureStr(str);
        return checkPalindromeStr(filteredStr);
    }

    //띄어쓰기, 콤마, :등을 제거하고 알파벳만으로 구성된 문자열을 return하는 메서드
    private String toPureStr(String str) {
        str = str.toLowerCase();
        StringBuilder alphabetOnly = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                alphabetOnly.append(c);
            }
        }
        return alphabetOnly.toString();
    }

    //회문 문자열인지 체크하여 return 하는 메서드
    private String checkPalindromeStr(String filteredStr) {
        for (int i = 0; i < filteredStr.length()/2; i++) {
            if (filteredStr.charAt(i) != filteredStr.charAt(filteredStr.length()-i-1)) return "NO";
        }
        return "YES";
    }

}
