package problem1;

import java.util.*;

public class Problem1_5 {

    public String solution(String str) {
        char[] strToCharArray = str.toCharArray();

        int fc = 0, lc = strToCharArray.length - 1; //첫번째 문자(fc), 마지막 문자(rc)의 위치 대입


        while (fc < lc) { //전부 거꾸로 바뀌었다면 그 이후는 false가 된다
            //특수문자일 경우 위치를 다음으로 이동시킨다
            if (!Character.isAlphabetic(strToCharArray[fc])) fc++;
            else if (!Character.isAlphabetic(strToCharArray[lc])) lc--;

            //앞쪽 문자와 뒷쪽 문자의 위치를 서로 변경하면서 위치를 감소한다
            else {
                //여기서 위치를 변경하고
                char tmp = strToCharArray[fc];
                strToCharArray[fc] = strToCharArray[lc];
                strToCharArray[lc] = tmp;

                //여기서 위치를 감소시킨다
                fc++;
                lc--;
            }
        }
        return new String(strToCharArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Problem1_5().solution(str));
    }
}
