package study;
// 1~9까지 서로다른 임의이수 3개 =>(상대) 컴퓨터가 무작위 선택 표시
//  3개 숫자 정해져 3개다맞추면 3스트라이크로 종료
//  1) 1개 위치 같구, 위치다르고 숫자같으면 1볼 1스트라이크
//2) 숫자도 위치가 안같아 낫싱
// 3) 위치,숫자 모두같아 =>3스트라이크 게임종료
//4) 게임 새로시작 1, 게임 종료 2

import java.util.Scanner;

public class BaseBallGame {
    //static빼면 다른 부분메서드에서 인식못함!
        public static int[] partnerNumber = new int[3];
        public static int ball_cnt=0;
        public static int strike_cnt=0;
public static void main(String[] args) {
        BaseBallGame ball = new BaseBallGame();
        ball.partnerNumber();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.print("숫자를 입력해 주세요 : ");
            String userInput=sc.nextLine();
            ball.BothBallNumberCheck(userInput);
            if(strike_cnt==3) {
                  System.out.println((strike_cnt) + "스트라이크");
                  System.out.println((strike_cnt) + "개의 숫자를 모두 맞히셨습니다! 게임종료");
                  System.out.println("게임을 새로 시작하려면  1"+", "+"종료하려면 2룰 입력하세요");
                  String choice=sc.nextLine();
                if(choice.equals("2")){
                    break;
                }else if(choice.equals("1")){
                    ball.BothBallNumberCheck(userInput);
                }
            }
        }
    }

    //내가 번호입력되면 자동으로 상대방 야구번호가 3자리 마지막보여주기
    public int[] partnerNumber() {
        int i;
        for (i = 0; i < partnerNumber.length; i++) {
            partnerNumber[i] = (int) (1 + 9 * Math.random());
        }
          return partnerNumber;
    }

    //나의 3개숫자와 상대파트너가 가진3개숫자 비교하기
    public void BothBallNumberCheck(String userInput) {
        if (userInput.length() != 3 || !userInput.matches("[0-9]{3}")) {
            System.out.println("숫자를 입력해 주세요"+userInput);
            return;
        }
        char[] userNumber = userInput.toCharArray();
        int[] userGuess = new int[3];
        for (int i = 0; i < userNumber.length; i++) {
            userGuess[i] = Character.getNumericValue(userNumber[i]);
        }
        ball_cnt=0;
        strike_cnt=0;

        for (int i = 0; i < userGuess.length; i++) {
                if (userGuess[i] == partnerNumber[i] ) {
                  strike_cnt++;

                }else if (containingPartnerNumber(userGuess[i]) ) {
                  ball_cnt++;
            }
        }
        if(ball_cnt > 0 && strike_cnt > 0) {
              System.out.println((ball_cnt) + "볼" + " " + (strike_cnt) + "스트라이크");
        }else if(strike_cnt>0){
              System.out.println((strike_cnt) + "스트라이크");
        }else if(ball_cnt>0){
              System.out.println((ball_cnt) + "볼");
        }
    }


    //상대숫자포함하는지 확인하기
    public boolean containingPartnerNumber(int number) {
        for (int i : partnerNumber) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}