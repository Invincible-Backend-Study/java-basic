# 책

## 직접해 봅시다

### Profile 클래스를 수정하자

1. String 타입의 name과 int 타입의 age라는 변수를 선언
2. public void setName(String str) 추가
3. public void setAge(int val) 추가
4. public void printName() 추가
5. public void printAge() 추가
6. Profile 클래스 객체 선언한 후
7. setName(”Min”), setAge(20)
8. printName(), printAge() 를 실행

<br/>

## 정리해 봅시다

1. 클래스와 객체의 차이점을 말해주세요.
    1. 클래스는 객체를 만드는 틀
    2. 객체는 클래스를 통해 만들어진 인스턴스
2. 객체를 생성하기 위해서 꼭 사용해야 하는 예약어는 뭐라고 했죠?
    1. new
3. 객체를 생성하기 위해서 사용하는 메소드 같이 생긴 클래스 이름에 소괄호가 있는 것을 뭐라고 하나요?
    1. 생성자
4. 객체의 메소드를 사용하려면 어떤 기호를 객체 이름과 메소드 이름 사이에 넣어주어야하나요?
    1. .
5. 여러분들이 메소드를 사용하기 위해서는 어떤 것을 만들어야 하나요?
    1. 객체 (생성된 객체 안에 public 메소드를 호출해야한다.)
6. 5번 문제에서 만들어야 하는 것은 어떤 예약어를 사용하고, 클래스의 무엇을 사용해야 하나요?
    1. new 예약어를 사용하여, 클래스의 생성자를 호출한다.

---

# 간단 정리

## 클래스

- 상태와 행위가 있어야 한다.
- 핸드폰을 객체로서 생각해보기
    - 핸드폰의 상태
        
        ```java
        1. 화면의 상태
        	1. 화면이 꺼져있는 상태
        	2. 잠금화면 상태
        	3. 바탕화면 상태
        	4. 특정 어플이 동작하는 상태
        2. 스마트폰 종류
        ```
        
    - 핸드폰의 행위
        
        ```java
        1. 화면을 켜는 행위
        2. 화면을 끄는 행위
        3. 비밀번호를 입력해 잠금을 푸는 행위
        4. 특정 어플에 동작시키는 행위
        ```
        
    - 위 내용을 기반으로 `SmartPhone` 클래스 만들어보기 (IDE 없이)
        
        ```java
        public Class SmarthPhone {
        	String name;  // 스마트폰 명
        	String display;  // View - 현재 화면 상태
        	
        	public SmartPhone() {
        	}
        	public void turnOn() {
        	}
        	public void turnOff() {
        	}
        	public void unlock() {
        	}
        	public void runApp(Class<?> appName) {
        	}
        }
        ```
        
    

## 클래스 vs 객체

- 클래스는 틀
    - 기본생성자는 클래스를 컴파일할 때 javac를 실행하면 클래스 파일안에 자동으로 만들어진다.
    - 참조되는 클래스들도 자동으로 컴파일된다. 예를 들어 CarManager 클래스를 컴파일하면 참조 중인 Car 클래스도 컴파일 된다.
- 객체는 인스턴스
