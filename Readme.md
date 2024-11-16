# 계산기 만들기 개인과제
객체 지향적 설계의 연습을 위한 프로젝트



<div style="width: 10px; height: 10px; background-color: green; border-radius: 50%; display: inline-block;"></div> Online


![Your GitHub stats](https://github-readme-stats.vercel.app/api?username=hajoo0322&show_icons=true&theme=radical)

![GitHub Streak](https://github-readme-streak-stats.herokuapp.com/?user=hajoo0322&theme=dark)


## 클래스 다이어그램
Click[here](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FrCqeZ%2FbtsKGSi4dmH%2FjsBrg2B5dnHeYh5lqIcGAk%2Fimg.png)


## ⌚️ 개발 기간
2024-11-12 ~ 11-17
  
  >와이어 프레임설계  
  
  >리펙토링  
  
  >와이어 프레임 재설계  

  >Java 코드 작성  
  
  >Readme 작성

  >리펙토링 완료

  >11-17 개발 완료


## 프로젝트
입력된 두 값을 더하고 저장하는 프로그램입니다.

```java
public class CalculatingMachine{
    public static boolean start() throws BadInputException{
        // 클라이언트
    }
}
```
CalculatingMachine을 클라이언트 클래스로 지정해서 객체들의 기능을 이용하도록 합니다.

다이어 그램에 표시했듯이 CalculatingMachine은 Check과 SaveResults
의 기능에 의존하고 있습니다

Check 클래스는 Database 클래스에 입력된 값을 저장해줍니다.

SaveResults 클래스는 데이터베이스에 결과 값을 저장하고 Calculater 클래스를 의존하는 것으로 클라이언트에서
SaveResults를 통해서 Calculater의 기능을 호출할수 있게 했습니다.
  
-추가 SaveResults가 의존성을 주입하도록 오브젝트 의존관계를 변경

~~Calculater 클래스는 Calculate 인터페이스에 의존성을 주입하고 (정적 의존성 주입)
계산결과를 리턴해주는 역할을 합니다.~~
Calculater 클래스는 계산을 요청하는 책임만 가지게됩니다.
Calculate 인터페이스를 구현하는 4개의 계산 로직 클래스가 있으며 제네릭을 사용함으로 타입안정성을 조금 더 향상 시켜주었습니다.


![Build Status](https://img.shields.io/github/workflow/status/hajoo0322/Calculata_PP/CI?label=build&logo=github)
![Version](https://img.shields.io/badge/version-1.0.0-blue)
![Open Issues](https://img.shields.io/github/issues/hajoo0322/Calculata_PP.svg)


