#2020_05_28 (Day_4)

##string
_String_변수_.startWith("글자"): 글자로 시작하는 String변수인지를 확인 => true, false로 반환
_String_변수_.charAt(index): 해당 변수의 index번째 글자를 반환

##중첩 for
loop:for( ; ; ){
        for( ; ; ){
            if()                     =====================>>> loop로 지정된 부분까지 벗어나는 것이 가능하다.
                break loop;
        }
}

#2020_05_29 (Day_5)
: 배열을 이용한 반복문을 할 예정
- 1차원 배열만 할 줄 알면 왠만큼 할 수 있음
##
#### 조퇴로 인해 업로드 지연
#### 정보 처리 기사 시험 이후 업데이트 예정

#2020_06_01 (DAY_6)
: 클래스에 관한 내용을 진행

##클래스의 3가지 구성요소
##### - 인스턴스 변수: 데이터가 실제 저장되는 곳
##### - 메소드: 인스턴스 변수에 저장된 속성값을 수정하거나 조회하는 역할
##### - 생성자: 인스턴스 변수를 초기화하는 역할, 변수에 데이터를 제일 처음 저장할 때 사용

## 생성자(Constructor)
####: 객체 생성 시 자동 호출되는 메소드

### 형식
#### 접근지정자 메소드명()

###특징
#####1. 일반 메소드하고 차이점: 리턴형이 없다.
#####2. 메소드 명은 반드시 클래스와 같아야 한다.(대소문자 동일)
#####3. Overloading이 가능하다. -> 여러 개의 생성자를 만들 수 있다.
#####4. 생성자가 없을 경우 기본 생성자로 생성이 가능하다.
#####5. 생성자에서는 주로 멤버의 초기화를 담당한다.
#####6. 같은 생성자끼리 호출은 "this()" -> this는 첫 줄?
#####7. 생성자가 따로 지정될 경우 Default 생성자는 사라지게 되며, 필요한 경우에는 따로 생성해주어야 한다.

###예제
#####CardTest_01.java: 인스턴스 변수와 클래스 변수에 대한 설명
#####Counter_02.java: static 변수의 사용에 따른 결과값 변화
#####TestA_03.java, ObTestA_03.java: 클래스 변수와 인스턴스 변수의 호출의 차이
#####ConstTest_04.java: 생성자와 메소드의 사용
#####ConstTest_05.java: 생성자와 메소드 사용 실습
#####ConstOver_06.java: Overloading의 사용 
#####ConstThis_07.java: this를 이용한 생성자 활용

##접근지정자
###pritvate
#####: 해당 클래스가 가진 멤버 메소드만 접근 가능 -> 변수를 캡슐화 한 것
###protected
#####: 패키지가 다를 경우 상속받은 클래스만 접근 가능
###default(아무것도 안 쓴 경우)
#####: 패키지가 다를 경우 접근 불가
###public
#####: 패키지 상관없이 어디서든 접근 가능
###예제
#####Student_08.java, StudentTest_08: private로 만들어진 인스턴스 변수를 변경하는 getter, setter
#####MyDateTest_09: Alt+Insert를 이용해 getter, setter 자동 생성

##Method
###예제
#####MethodTest_10, MethodTest_11: Method 생성 연습
#####MethodReturn_12: return을 통해 결과값 반환
#####MehtodReturn_13: return을 사용하여 메소드를 벗어나는 방법
#####PersonTest_14: 생성자 실습
#####InfoData_15, InfoDataTest_15: 메소드 실습
#####Sangpum_16, SangpumTest_16: 메소드 실습
#####ScoreTest_17: 생성자, 메소드 실습