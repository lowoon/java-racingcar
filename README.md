# java-racingcar
자동차 경주 게임 미션 저장소

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)



## 기능 요구사항

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.



## 기능 구현 목록

- [ ] [입력] 이름을 입력받는다.
  - 이름이 없는 경우
  - 팀이 하나인 경우
  - 이름을 5자 이상 입력한 경우
- [ ] [입력] 시도할 횟수를 입력받는다.
  - 숫자가 아닌 경우
- [ ] [기능] 이름을 기준으로 차량을 만든다.
- [ ] [기능] 0~9 사이 랜덤값을 입력받고, 4이상경우 전진한다.
- [ ] [출력] 시도횟수별 차량현황을 출력한다.
- [ ] [출력] 최종 우승자를 출력한다.



