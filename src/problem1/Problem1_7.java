package problem1;

import java.util.Scanner;

public class Problem1_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String input = sc.nextLine();
        System.out.println(new Problem1_7().solution(input));
    }

    public YesOrNo solution(String input) {
        input = input.toLowerCase(); //대.소문자 구분 안하기 때문에 소문자로 만들고
        String revertedString = new StringBuilder(input).reverse().toString(); //거꾸로 만든 다음

        //palidrome-String(회문 문자열)인지 확인한다
        YesOrNo yesOrNo;
        yesOrNo = checkingPalindrome(input, revertedString);

        return yesOrNo;
    }

    //checkingPalindrome메서드에서 palindromeString이면 YES, 아니면 NO로 표시하기 위한 ENUM.
    //YES, NO를 static변수로 지정해서 사용하는게 더 나았을까??
    //모르겠다 하면서 고민해봐야지
    public enum YesOrNo {
        YES, NO

    }
    //거꾸로 만든 문자열이 입력값과 같다면(회문 문자열) YES, 다르다면 NO를 설정하는 method

    private static YesOrNo checkingPalindrome(String input, String revertedString) {
        YesOrNo yesOrNo;
        if (revertedString.equals(input)) {
            yesOrNo = YesOrNo.YES;
        } else yesOrNo = YesOrNo.NO;
        return yesOrNo;
    }
}
