package test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static study.BaseBallGame.partnerNumber;

import study.BaseBallGame;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseBallGameTest {
    BaseBallGame baseballgame;
    int ball_cnt=0;
    int strike_cnt=0;
    //@BeforeEach는 각테스트가 실행되기전ㅇ에 준비작업을 수행하는ㅇ유용
    // @BeforeEach사용하여 테스트메소드가 시행되기전에 BaseBallGame처럼 객체를 초기화하는 기능을함
    @BeforeEach
    public void setUp(){
            baseballgame = new BaseBallGame();
    }

    @Test
    @DisplayName("상대편숫자 만들기")
    public void partnerNumber(){
            baseballgame=new BaseBallGame();
            int[] partnerNumber = new int[3];
            int[] inputpartnerNumber = new int[3];
            int i;
            for (i = 0; i < partnerNumber.length; i++) {
                  partnerNumber[i] = (int) (1 + 9 * Math.random());
                  inputpartnerNumber[i]=partnerNumber[i];
            }
            Assertions.assertArrayEquals(inputpartnerNumber, partnerNumber);

    }
    static int[] containgPartnerNumberTest(){
            return Stream.of(3,6,9).mapToInt(i->i).toArray();
    }

    //상대편숫자포함하는지유효성검사하기
   @ParameterizedTest
   @MethodSource("containgPartnerNumberTest")
    public boolean containgPartnerNumberTest(int number){
            baseballgame.partnerNumber();
            boolean result=baseballgame.containingPartnerNumber(number);
            for (int i : partnerNumber) {
                  if (i == number) {
                    Assertions.assertTrue(true);
                  }
            }
           Assertions.assertFalse(false);
           return result;
   }

   //상대편숫자와 사용자숫자입력 맞는지 확인하기
   @ParameterizedTest
   @ValueSource(strings={"3","6","9"})
   public void BothBallNumberCheckTest(String userInput){
            String result="369";
            baseballgame.BothBallNumberCheck(userInput);
            assertThat(userInput).isEqualTo(result);

            char[] userNumber = userInput.toCharArray();
            int[] userGuess = new int[3];
            for (int i = 0; i < userNumber.length; i++) {
                  userGuess[i] = Character.getNumericValue(userNumber[i]);
            }
           int[] expectedNumber={3,8,9};
           Assertions.assertArrayEquals(expectedNumber,userGuess);
           ball_cnt=0;
           strike_cnt=0;
           int expectedStrikeCount=3;
           int expectedBallCount=3;
           for (int i = 0; i < userGuess.length; i++) {

                 if (userGuess[i] == partnerNumber[i] ) {
                   strike_cnt++;
               } else if (containgPartnerNumberTest(userGuess[i]) ) {
                   ball_cnt++;
               }
           }
           assertThat(strike_cnt).isEqualTo(expectedStrikeCount);
           assertThat(ball_cnt).isEqualTo(expectedBallCount);
//       ball_cnt=0;
//       strike_cnt=0;
           if(ball_cnt > 0 && strike_cnt > 0) {
             System.out.println((ball_cnt) + "볼" + " " + (strike_cnt) + "스트라이크");
          }else if(strike_cnt>0){
             System.out.println((strike_cnt) + "스트라이크");
          }else if(ball_cnt>0){
             System.out.println((ball_cnt) + "볼");
          }
           Assertions.assertEquals(ball_cnt,strike_cnt);
   }
}
