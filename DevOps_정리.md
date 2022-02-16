- JDK (Java Development Kit)

- Open JDK : Java Standard Edition의 오픈소스 구현체

- JCP(Java Community Process) : Java 표준 관리
- JSR(Java Specification Request) : Java 스팩의 요구사항 정의
- Open JDK : JSR의 공식 레퍼런스 구현체 (링크 예외가 있는 GNU GPL2 라이선스)
    * Oracle JDK : Open JDK를 기반으로 안정화, 플러그인 등 추가 (유료 구독형 라이선스)
- Uniform Resource Identifier(URI)

- 온 프레미스 On-Premises : 일반적이고 전통적인 시스템 운영 방식, 자체적으로 데이터 센터를 보유, 직접 시스템 구축/운영유지 수행
- 오프 프레미스 Off-Premiser : 클라우드 컴퓨팅을 활용하는 방식

Dockerfile : 텍스트 형식으로 구성된 이미지를 생성하는 명령어의 집합
    ㄴ명령어
    MAINTAINER 작성자
    WORKDIR 작업 위치
    ENTRYPOINT 데몬 실행
    VOlUME 볼륨 마운트
    ENV 환경 변수 설정
    FROM 베이스 이미지 지정

latest [형] 최신의
Compose 구성하다
release 【동사】출시하다, 공개하다, 발매하다, 발표하다, 개봉하다
leak (【명사】누출, 누수, 새는 곳 ) 
survey 조사, 측량, 검사
주석(Comment)
composition 구성
종속성(Dependency)
product 제품
Exception 익셉션
Parameterized Test 파라미터...? 매개변수
Dynamic 다이나믹
Minor 마이너
Critical 비판적인, 결정적인
Blocker 블로커
Warning 경고




- -FindBugs 개요-
Correctness(정확성)
Bad Practice(잘못된 사례)
Performance(성능)
Multi-Thread Correctness(멀티 스레드 안정성)
Dodgy(위험성)

Code Smell
리팩토링 관련 코드 악취 -> 기술 부채(Technical debt) 발생

명명 규칙(Naming Convention)
동사 동사구 

Paradigm shift -Reactive

보통 높은 결합성, 낮은 응집성, 낮은 가독성 등으로 이루어진 코드는 점점 유지보수 및 확장이 어려운 어플리케이션이 되어 갑니다.

테스팅 사분면(Testing Matrix)
TDD(테스트 주도 개발 영역) - 아키텍처와 코드 로직에 집중
BDD - 비즈니스 요구사항에 집중


타임아웃, 서킷브레이커, 벌크 헤드 기술은 마이크로서비스에 장애가 있을 경우 전체 시스템 가동 유지에 도움이 됨.

마샬링(Marshalling) : 데이터 형태를 변환, 원격 서비스로 전달하는 메시지를 캡슐화함
API 간 통신 횟수 감소, 지연 시간을 줄이기 위해 굵게 나뉜 통신 형태

단위 테스트(Unit Test) : 테스트 가능한 가장 작은 단위를 독립된 환경에서 테스트하는 것, 주로 클래스나 메서드 단위 동작 검증

독립 단위 테스트(Solitary Unit Testing) : 테스트 객체와 의존성이 있는 부분을 Test Doubles 등의 기능으로 대체하여 테스트

연동 단위 테스트(Sociable Unit Testing) : 객체 상태 변화를 관찰하여 모듈의 동작을 테스트하는데 초점을 맞춤

제라드 메사로스 - 테스트 더블(Test Doubles) 언급 : 테스트 시 실제 객체를 대신 할 수 있는 객체

소프트웨어 컴포넌트
종속 관계에 있는 컴포넌트가 완성되지 않거나 컴포넌트에 오류가 있는 경우
가상의 테스트용 클래스와 메서드 구현 -> 목업(Mock-up)클래스

xUnit - Setup, Exercose, Verify,Teardown
BDD - Given, When, Then / Arrange, Act, Assert

Gof패턴? 에릭 감마

애자일 방법론의 한 형태인 XP를 만든 켄트 벡

Integration Test 통합 테스트

스텁(stud) : 테스트 중인 모듈이 의존하는 소프트웨어 구성 요소의 동작을 시물레이션하는 프로그램

ORM기술 캐싱, 플러싱 지원

데이터 영속성(Persistence) : 데이터를 생성한 프로그램의 실행이 종료되더라도 사라지지 않는 데이터의 특성 

라우팅(routing) : 어떤 네트워크 안에서 통신 데이터를 보낼 때 최적의 경로를 선택하는 과정

피엠디(PMD, Programming Mistake Detector)는 자바 프로그램의 소스코드를 분석하여 프로그램의 부적절한 부분을 찾아내고 성능을 높이도록 도와주는 공개 소프트웨어 점검 도구이다.
