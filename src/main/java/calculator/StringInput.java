package calculator;

import camp.nextstep.edu.missionutils.Console;

public class StringInput {
    // 문자열 입력받는 메서드
    public String getInput() {
        System.out.println("덧셈할 문자열을 입력해주세요.");
        return Console.readLine();
    }
}
