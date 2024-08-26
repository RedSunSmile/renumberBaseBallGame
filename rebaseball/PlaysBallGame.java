import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlaysBallGame {
    private List<Integer> userball;
    private List<Integer> partnerball;

    public PlaysBallGame() {
        this.userball = this.userball;
        this.partnerball = this.partnerball;
    }

    public static void main(String[] args) {
        UserInput();
    }

    static void UserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        String userInput = sc.next();
        List<Integer> userInputList = new ArrayList();
        char[] var3 = userInput.toCharArray();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            char c = var3[var5];
            userInputList.add(Character.getNumericValue(c));
        }

        List<Integer> partnerball = new ArrayList(NumberGenerator.makeRandomNumbers());
        System.out.println("Userball: " + userInputList);
        System.out.println("Partnerball: " + partnerball);
        BothBallCompare compare = new BothBallCompare();
        compare.CountMatch(userInputList, partnerball);
    }

    static void reStart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        Scanner again = new Scanner(System.in);
        String choice = again.nextLine();

        while(!choice.equals("2")) {
            if (choice.equals("1")) {
                UserInput();
            }
        }

    }
}
