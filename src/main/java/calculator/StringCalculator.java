package calculator;

public class StringCalculator {

    public String[] extractNumbers(String input) {
        // 쉼표 또는 콜론을 기준으로 문자열 분리
        return input.split(",|:");
    }

}
