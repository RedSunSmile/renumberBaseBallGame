숫자야구게임코드를 시작으로 TDD 클린코드 연습을 위하여 진행하였습니다. 또한 기본코드로도 쓰지만 자료구조를 사용하는데 부족함과  test코드를 만든는데 어려움과 갈증을 느껴서 제대로 사용하고 적용하고자 연습하게 되었습니다.

1) 모든 java파일은 before와 after로 나누어 구성됩니다.

2) 처음을 숫자야구게임은 rebaseball방안에 before로 설명을 붙여 숫자야구게임 자바파일은 하나의 클래스안에 각각의 메서드별로 기능구현 하였습니다.

3) 처음만든 숫자야구게임은 test방에서 before로 설명이 붙어있으며 자바파일도 하나의 클래스안에 각각의 메서드별로 단위테스트 구현하였습니다.

4) rebaseball방과 test방안에 before로 만든 숫자게임코드파일은 자료구조가 들어가지 않는 boolean, for, if, while, array와 같은 기본코드로 구성하였습니다

5) reabaseball방과 test방안에 before 숫자게임코드파일은 우선 작동이 되는것을 목표로하여 작성하였습니다.

6) rebaseball방과 test방안에 두번째 after 숫자야구게임코드는 하나의 메서드는 하나의 기능만 하게 따로 분리하여 진행하였습니다.

7) rebaseball방과 test방안에 after숫자야구게임메서드별로 상대방과 사용자별 메서드는 중복이 되지않는 구조를 목표로하여 Set자료구조를 선택하여 진행하였습니다.

8) reabseball방과 test방안에 after로 숫자야구게임에서의 상대방과 사용자의 숫자맞추기 비교로직메서드를 구성하는데 있어서 각각의 숫자를 순차적으로 비교하기 위해 ArrayList를 선택하여 진행하였습니다.

9) reabseball방에 after 상대방과 사용자와의 메서드를 main에서 ArrayList자료구조를 사용함으로써 순서대로 비교가 용이하게 선택하여 진행하였습니다.  

10) 공통적으로 before와 after main에서 게임을 시작하고, 재시작하거나 종료할수 있도록 구성하였습니다. 

11) 나중에 after에서 코드작성시 하나의 메서드기능만 하도록 시작과 재시작 메서드별로 기능을 나누었습니다.

12) before test코드 작성시 클래스별로 @DisplayName을 적용하여 이름을 쉽게 구분하고 @ParameterizedTest를 통한 @MethodSource와 @ValueSource를 사용하여 메서드를 활용 및 값을 넣어서 단위테스트를 진행하였습니다.

13) after에서 test코드 작성시 각각의 메서드를 구현함에 있어 assertThat, stream, assertEquals, 람다를 적용하여 가독성있고 명료하게 사용하고자 단위테스트를 진행하였습니다.

    추가적인 사항은 https://www.notion.so/c67cf49ad02740d6b0fca4dd91ee2900?pvs=4 제 블로그에서 확인 가능합니다.
   기타 에피소드는 블로그에 정리하여 올리겠습니다. 
