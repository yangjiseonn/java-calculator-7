package calculator;

public class Application {
    public static void main(String[] args) {
        StringInput stringInput = new StringInput();
        String input = stringInput.getInput();

        // 빈 입력 처리
        if (input == null || input.isEmpty()) {
            System.out.println("결과: 0");
            return;
        }
    }
}
