# [2022-01-12 정리본]

## TypeScript
1. node.js 설치
2. CategoryInfo : 보안 오류: (:) [], PSSecurityException
    FullyQualifiedErrorId : UnauthorizedAccess

    위와 같이 보안 오류 발생시 

       * ExecutionPolicy <-- 현재 상태 확인
       Set-ExecutionPolicy Unrestricted <-- 상태변경
       * Restricted <-- 모든 스크립트 막은 상태
       * Unrestricted <-- 모든 스크립트 허용 상태

## 언어 정리
      1. export default [클래스명] 해야 import가 가능하다. (없으면 빨간줄)

      2. 클래스 대신 enum(열거형)으로 선언 가능하다.

      3. as 다운 캐스팅 / union는 뭐야?

      4. for of문 - 타입과 관계없이 배열에 담긴 '값'을 순서대로 얻을 때 사용
          for in문 - 배열의 순서(인덱스)를 얻을 때 사용

      5. splice : 원본 배열 자체를 수정, 기존 요소 삭제 or 교체(시작인덱스,[제거할 요소의 수],[추가할 것])
          - [제거할 요소의 수]를 지정하지 않으면 start부터 모든 요소를 제거한다.
          - 제거한 요소를 반환한다.

      6. throw new Error : 예외 발생? ex) throw new Error('No such club name : ' + name);

      7. readline-sync : (readline 비동기적 입력) 입력을 동기적으로 처리하기 위한 package이다. 콘솔(TTY)을 통해 사용자와 대화하기 위해 대화식으로 실행하기 위한 동기식.
      입력/출력 스트림과 같이 리디렉션 되는 경우에도 스크립트가 콘솔을 통해 사용자와 대화할 수 있도록 한다.

      [참고 사이트] https://velog.io/@yujo/node.js%ED%91%9C%EC%A4%80-%EC%9E%85%EB%A0%A5-%EB%B0%9B%EA%B8%B0

      8. process - 프로그램과 관련된 정보를 나타내는 객체. 속성, 메소드 많음. (0은 정상종료, 1은 비정상종료)

      9.  enum : 같은 종류를 나타내는 여러 개의 숫자 혹은 문자열을 다뤄야 할 때 각각 적당한 이름을 붙여서 코드의 가독성을 높이고 싶을 때 사용.
       리버스 매핑(reverse mapping) 지원 : 값으로도 키를 얻을 수 있음.
       내부적으로 값 할당, 별도의 명시가 없다면 0부터 1씩 증가하는 형태로 할당.

      10. !! : 다른 타입의 데이터를 boolean 타입으로 명시적으로 형변환하기 위해 사용
          undefined, "", 0일 경우 결과 false
          그 외는 모두 true이다. (문자열 0은 true)
          ex)
              a    :: undefined
              !a   :: true
              !!a  :: false

              b    :: true
              !b   :: false
              !!b  :: true

              c    :: null
              !c   :: true
              !!c  :: false

              적용 전]
              var data = "1";
              if(data != undefined && data != "")
              {
              //실행 함수
              }

              적용 후]
              var data = "1";
              if(!!data)
              {
              //실행 함수
              }

      11. 빈 문자열은 length 가 0이다.

      12. <자바스크립트에서만 제공하는 논리연산자 or의 추가 기능>
       ex) or 연산자와 피연산자가 여러개인 경우
           result = value1 || value2 || value3;

       - 왼쪽 피연산자부터 오른쪽으로 나아가며 평가
       - 각 피연산자를 boolean형으로 변환, 그 값이 true이면 해당 피연산자의 변환 전 원래 값을 반환
       - 모두 없으면 마지막 값을 보여준다.

      13. <템플릿 리터럴> - 내장된 표현식을 허용하는 문자열 리터럴
          - 런타임 시점에 일반 자바스크립트 문자열로 처리/변환됨
          - ''(백틱)으로 감싸준다.
          - ES6 이전에는 "" + a + "" 로 사용 (동일하다)

      14. 내보내기(export)
          ㄱ) 유명(named) : 여러개 
          ㄴ) 기본(default) : 하나

          - 외부 모듈을 import하는 방식.
          - ES6에서 새로 추가된 방식
          - 불러올 때 : import {객체} from './해당 객체들이 포함된 모듈';

      15. 객체를 로깅할 때는 객체의 내용 변경사항이 실시간으로 업데이트 된다.
          만약에, 

              var obj = {};
              console.log(obj);
              obj.a = 1;
              console.log(obj);

          - 첫번째는 {} 두번째는 {a:1}이지만 콘솔을 보면 {}인 첫번째 로그를 펼쳐보면 a:1이 들어있다. 즉, console.log()는 참조를 로깅하기 때문에 객체와 같이 내용물이 변할 수 있는 것들은 내용이 실시간으로 바뀐다.

      16. typeScript 실행하기 - (1)js로 변경해서 실행 / (2)바로 실행
          <선행조건>
          1) node.js -> typescript를 설치하기 위함
          2) typescript : typescript를 javascript로 변경하는 컴파일러를 제공
              npm install -g typescript
          3) ts-node : typescript를 바로 실행하는데 사용
              npm install -g ts-node

          tsc --init 하면 tsconfig.json 파일이 생성된다.

          에러 발생시 - Error: Cannot find module 'readline-sync'
              npm install --save readline-sync 입력

          => 실행되는데 뭔가 이상함

      17. 화살표 함수 표현(arrow function expression)

      18. <extends 예약어>
          - 상속의 한 형태
          - 부모에서 선언된 메소드 혹은 변수를 자식은 모두 상속 받아 그대로 사용할 수 있다.
          - TypeScript는 다중 상속을 지원하지 않는다.

          <implements 예약어>
          - 부모의 메소드나 변수를 그대로 가져다 쓰는 게 아니라 반드시 오버라이드 해서 사용해야 한다.
          - 해당 인터페이스에 있는 프로퍼티 및 메소드를 전부 가지고 있거나 구현해야 한다.
          - 다중 상속도 지원한다.

      19. 코드 해석 질문 정리

          const members = Array.from(this.memberMap.values());

          return members.filter(member => member.name === memberName)
                  .map(targetMember => MemberDto.fromEntity(targetMember));

          members에 memberMap에서 values들을 담고
          그걸 입력한 값과 비교해서 존재하면
          map을 생성해서
          targetMember라는 게 존재하면 MemberDto.fromEntity(targetMember)가 실행된다.

      20. npm(Node Package Manager) : 프로젝트에 필요한 라이브러리를 다운로드 또는   
          관리 할 수 있도록 해주는 프로그램
          - npm init -> package.json 파일을 프로젝트 폴더 바로 아래에 생성하여 모듈과 해당 모듈의 버전을 관리한다.
          - CLI를 통해서 프로젝트를 생성하면 기본적으로 함께 포함되어 있다.
          - --save : 패키지(plugin)를 ./node_moduels 디렉터리에 설치하고, ./package.json 파일의 dependency 항목에 모듈(플러그인 정보)을 추가한다는 의미이다.(의존성 관리)
              --production 빌드시 해당 플러그인이 포함.
          - save-dev : 위와 동일한데 devDependencies 항목에 플러그인 정보 저장
              --production 빌드시 해당 플러그인이 포함되지 않는다.
          - npm5부터는 --save 옵션을 기본 옵션으로 적용하게 되어서 dependecies에 항목이 추가된다.
          - 나중에 다른 곳에 해당 프로젝트를 가져오더라도 모든 모듈을 일일이 설치할 필요 없이 '$npm install'만 입력하면 dependencies 항목을 기반으로 필요한 모듈을 모두 자동으로 설치한다.
          - 개발용으로 쓸 경우, 예시로 실제 릴리즈시에는 필요없을 때 dev에 넣는다. 
              dev항목에 넣기 하나만 설치하려면    
              
                  $npm install --only=prod[uction] | --only=dev[elopment]

      21. git pull / git clone

      git pull은 다른 사람이 PR을 통해서 코드를 업데이트 했거나, 아니면 Github를 통해서 commit 했을 때 그 내용을 클라이언트로 내려받는 명령어입니다.

          git pull origin master 하면 origin의 내용이 master로 복사된다.

      git clone은 클라이언트 상에 아무것도 없을 때 서버의 프로젝트를 내려받는 명령어입니다. 자동으로 init도 됩니다.

      22. Array.from()
          () 안에 string을 넣어주면 분할돼서 생성되고, set이나 map을 쓰면 아래와 같이 생성된다.

          * string에서 배열 만들기

                  Array.from('foo');
                  // ["f", "o", "o"]
          
          * set에서 배열 만들기

                  const s = new Set(['foo', window]); 
                  Array.from(s);
                  // ["foo", window]
          
          * map에서 배열 만들기

                  const m = new Map([[1,2], [2,4], [4, 8]]);
                  Array.from(m);
                  // [[1, 2], [2, 4], [4, 8]]

                  const mapper = new Map([['1', 'a'], ['2', 'b']]);
                  Array.from(mapper.values());
                  // ['a', 'b'];
              
                  Array.from(mapper.keys());
                  // ['1', '2'];
          
          * 배열 형태를 가진 객체(arguments)에서 배열 만들기

                  function f() {
                  return Array.from(arguments);
                  }

                  f(1, 2, 3);
                  // [1, 2, 3]
          
          * Array.from과 화살표 함수 사용하기

                  // Using an arrow function as the map function to
                  // manipulate the elements
                  Array.from([1, 2, 3], x => x + x);      
                  // [2, 4, 6]
              
                  // Generate a sequence of numbers
                  // Since the array is initialized with `undefined` on each position,
                  // the value of `v` below will be `undefined`
                  Array.from({length: 5}, (v, i) => i);
                  // [0, 1, 2, 3, 4]

      23. <필터 관련 정리 사이트>
          https://7942yongdae.tistory.com/49 

          주어진 배열의 값들을 오름차순으로 접근해 callbackfn을 통해 true를 반환하는 요소를 기준으로 신규 배열을 만들어 반환한다.

          const numbers = [1, 2, 3, 4, 5];    
          const result = numbers.filter(number => number > 3);   
          console.log(numbers); // [1, 2, 3, 4, 5];   
          console.log(result); // [4, 5]   

      24. const로 선언하는 이유 : 상수화 시킬 때 사용. 중간에 값을 변경할 수 없다.   
          let - 중복선언이 되지 않습니다. 블럭 내부의 변수는 외부에서 사용할 수 없습니다.   
          var - 중복선언이 가능합니다. 블럭 내부의 변수를 외부에서 사용이 가능합니다.   

      25. .gitignore에 package.json   
          package-lock.json   
          typescrpit-travelclub-stage03-02.iml   
          를 적어야 git에 올릴 때 빼고 올려진다.   

      26. 람다(lambda, Arrow function) = 익명함수 : 한번만 사용하는 함수 
          - this나 super에 대한 바인딩이 없고, methods 로 사용될 수 없습니다.
          - new.target 키워드가 없습니다.
          - 생성자로 사용할 수 없습니다.

      27. 스키마 (schema) : 자료의 구조, 자료의 표현 방법, 자료 간의 관계를 형식 언어로 정의한 구조. (사용자)
      - 3층 구조로 이루어져 있다

          - 외부 스키마(External Schema) : 프로그래머나 사용자의 입장에서 데이터베이스의 모습으로 조직의 일부분을 정의한 것
          - 개념 스키마(Conceptual Schema) : 모든 응용 시스템과 사용자들이 필요로하는 데이터를 통합한 조직 전체의 데이터베이스 구조를 논리적으로 정의한 것
          - 내부 스키마(Internal Schema) : 전체 데이터베이스의 물리적 저장 형태를 기술하는 것
           
       28. 이터레이터(iterator)란 ? set이나 map같은 자료구조를 반복시킬 때 사용한다.

       29. 레이어(layer) - 시스템의 논리 구조를 표현 
           티어(Tier) - 물리적인 서버를 표현

       MapStorage : 싱글톤, 게시판 저장소와 게시글 저장소를 모두 확인

       Entity : 저장소에서 관리되는 객체
       객체의 속성을 묶기 위한 용도의 객체는 Value Object 
       객체의 특성을 표현하기 위해 인터페이스를 활용

       정보의 특성 : 정보는 정의(모델링)하고 기록(데이터 저장)하고 제시(UI개발)할 수 있어야 한다.

       1단계 : 게시글을 남길 수 있는 여행클럽을 클래스로 정의하고 객체로 생성
       2단계 : 다양한 기능이 추가된 여행클럽 애플리케이션의 메뉴를 표현하는 방법
       3단계 : 게시판과 멤버십이 있는 여행클럽을 관리하기 위해 필요한 서비스 구현
       4단계 : 저장을 담당하는 클래스를 분리하여 애플리케이션 구성원들의 역할과 책임을 나누어 구현

        30. map() 메서드는 배열 내의 모든 요소 각각에 대하여 주어진 함수를 호출한 결과를 모아 새로운 배열을 반환한다.

            ex)
             const array1 = [1, 4, 9, 16];

            // pass a function to map
            const map1 = array1.map(x => x * 2);

            console.log(map1);
            // expected output: Array [2, 8, 18, 32]

        31. 데이터 정합성 : 어떤 데이터들이 값이 서로 일치함(모순 없이 일관되게 일치해야함)    
                - 같은 성격?의 데이터를 다루는 테이블들 간에
            데이터 무결성 : 데이터 값이 정확하고 완전한 상태    
                - 말이 안되는 값 예) 부모가 없는 자식 등

        dto는 디비 묶음?
        service는 인터페이스 틀

        32. if (a in b) - in 연산자는 명시된 속성이 명시된 객체에 존재하면 true를 반환
            (속성 in 객체명)
            속성의 이름이나 배열의 인덱스를 뜻하는 문자열 또는 수 값
---
# 3~10일까지


## node의 npm이란?
    export default 기본 내보내기 - JavaScript 모듈에서 함수, 객체, 원시 값을 내보낼 때 사용합니다. 내보낸 값은 다른 프로그램에서 import 문으로 가져가 사용할 수 있습니다.
    HTML안에 작성한 스크립트에서는 사용할 수 없습니다.

### - 내보내기 종류
      1. named (여러개)
      2. default (하나) - 어떤 이름으로도 가져올 수 있다.

      부모 모듈이 자식 모듈을 가져와서 다시 내보낼 수도 있다.
      ex) import foo from 'bar.js';
          export foo;

## 코드 에러시 install
    1. process.exit(0); 사용하기 위해 터미널에 입력
        npm i -D typescript @types/node

    2. import { question } from 'readline-sync'; 사용하기 위해 터미널에 입력 -> package-lock.json파일 생성됨 
        npm install --save @types/readline-sync


## [영어]

    hasMembers : 회원이 있음
    currentClub : 현재 클럽
    memberHelper : 멤버 도우미
    exist : 존재하다
    register : 등록하다
    Choose Again : 다시 선택
    answer : 대답 / 앤써
    It's a invalid number : 잘못된 번호입니다
    modify : 수정하다
    retrieve : 검색하다
    ClubCoordinator : 클럽 코디네이터
    get Instance : 인스턴스 가져오기
    keyIter : 키이터? / 이터레이터 함수 키셋같은 애들 돌릴 때 
    RoleInClub : 클럽에서의 역할
    uniqueInstance : 고유 인스턴스
    throw new Error : 새로운 오류를 던지다
    register : 등록하다
    No clubs in the storage : 창고에 클럽이 없습니다.
    clubFound : 클럽 발견
    newIntro : 새로운 소개
    Member with this email already exists : 이 메일을 가진 회원이 이미 있습니다.
    tellMeAboutYou : 너에 대해 말해줘
    foundClub : 발견 클럽
    Find All : 모두 찾기
    store : 저장?
    ClubStorage : 클럽 보관소
    Input a valid digit. : 올바른 숫자를 입력하세요 / 디지트
    President : 대통령대통령? 사장? 수장? 프레지던트
    RoleInClub : 클럽에서의 역할
    inviteLeader : 초대리더 인바이트 리더
    Name should be longer than : 이름은 다음보다 길어야 합니다.
    modify : 수정하다 모디파이
    logic : 논리 로직
    role : 역할
    foundedDate: 설립일
    currentClub : 현재 클럽
    find Another Club : 다른? 하나의? 클럽 찾기 // 파인드 어나더 클럽
    clubFound : 클럽 발견 ?
    yet : 아직 옛
    foundMember : 회원을 찾았습니다
    Registered : 등기, 등록된 레지스터드
    Club already exists with name : 이름이 있는 클럽이 이미 존재합니다. 얼레디 익시스츠 윗 네임
    confirmStr : 확인하다 / 컴펌 str
    Remove cancelled, your club is safe : 취소 취소, 귀하의 클럽은 안전합니다.
    Previous : 이전의 / 프리비어스
   - should : ~해야한다. 슈드
   - Entity : 실재, 본체
   - writer: 작가 롸이터
   - sequence : 순서, 연속, 열  시퀀스
   - Previous : 이전의 프리비어스
   - foundationDay : 기초, 초대의 날 설립일 파운데이션데이
   - uniqueInstance : 고유 인스턴스
   - already : 이미 올레디
   - such : 그런, 이러한 서치
   - with : ~와 함께, 와, 으로
   - retrieveByName : 이름 검색
   - No such a posting with id : 아이디가 있는 게시물이 없습니다.
   - 
    shareInstance : 공유 인스턴스 쉐어
    cler : 점원
    Current : 현재의 커런트
    uniqueInstance : 고유 인스턴스
    retrieve : 검색하다 리트리브
    isValidEmailAddress : 유효한 이메일 주소 입니다 (?)
    writtenDate : 작성된 날짜 리튼 데이트
    info : 정보
    toCommentInPosting : 댓글 작성하기
    retrieveByPostingId : 검색별 게시 ID
    by : ~에 의해, ~으로, ~에 의하여
    invalid : 유효하지 않은