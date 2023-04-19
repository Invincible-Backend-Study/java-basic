
> 💡 80p. 그렇다고, 변수 이름을 짓기 위해서 작명소까지 가라는 말은 아니다. (흠… 재미 없나?)

<br/>

## 자바 변수의 종류

- 지역 변수 local var
    - 중괄호 내에서 선언된 변수
    - 지역 변수를 선언한 중괄호 내에서만 유효하다.
- 매개 변수 parameter
    - 메소드에 넘겨주는 변수
    - 메소드가 호출될 때 생성, 메소드가 끝나면 소멸
- 인스턴스 변수 instance var
    - 메소드 밖에, 클래스 안에 선언된 변수. 앞에는 static 이라는 예약어가 없어야 한다.
    - 객체가 생성될 때 생성, 그 객체를 참조하는 다른 객체가 없으면 소멸
- 클래스 변수 class var
    - 메소드 밖에, 클래스 안에 선언된 변수. static 예약어도 포함되어야 한다.
    - 클래스가 처음 호출될 때 생성, 자바 프로그램이 끝날 때 소멸

```java
public class Var {
	int instanceVar;
	static int classVar;
	public void method(int parameter) {
		int localVar;
	}
}
```

<br/>

## 변수 이름 규칙 (컨벤션 X)

- 길이 제한이 없다
- 첫째글자는 유니코드 문자, 알파벳, $, _ 만 사용할 수 있다.
    - 하지만 일반적으로 첫 글자에 $, _ 를 사용하진 않는다.
- 둘째글자는 유니코드 문자, 알파벳, $, _, 숫자를 사용할 수 있다.
- 보통은 메소드 이름처럼 지정해서 사용한다. 첫 문자는 소문자로 시작하는 단ㄴ어이고, 두번째 단어의 첫 문자만 대문자로 시작하면 된다.

<br/>

## 자료형 종류

- 기본 자료형
    - 추가로 만들 수 없다.
    - 값을 직접 넣어준다.
    - 종류
        - 정수형: byte, short, int, long, char
            - 기본적으로 자바에서 숫자를 명시하면 int로 생각하기 때문에, long 타입의 숫자에는 명시적으로 뒤에 L을 붙여야된다.
        - 소수형: float, double
            - 돈 계산과 같이 중요한 부분에서는 이 타입들을 사용해서는 안된다.
            - 제공할 수 있는 범위를 넘어서면 그 값의 정확성을 보장하지 못한다.
            - 따라서 정확성이 요구될때는 java.math.BigDecimal 클래스를 사용
        - 기타: boolean
- 참조 자료형
    - 우리가 만들어 쓸 수 있다.
    - new 를 사용해서 생성된 객체를 대입한다.
    - String만은 예외인데, new 없이 `"내용"` 으로 초기화해 줄 수 있다.
    
<br/><br/>

# 책

## 직접해 봅시다

```java
public class ProfilePrint {
    private byte age;
    private String name;
    private boolean isMarried;

    public void setAge(byte age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarried(boolean flag) {
        isMarried = flag;
    }

    public byte getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public boolean getMarried() {
        return isMarried;
    }
}
```

## 정리해 봅시다

1. 네 가지 종류의 변수는 어떻게 구분할 수 있나요?
    - 생명주기에 따라 구분할 수 있다. 생명주기는 선언된 위치와 정적인지에 따라 나뉜다.
        
        ```java
        class example {
        	인스턴스_변수;
        	static 클래스_변수;
        	public method(파라미터_변수) {
        		로컬_변수;
        	}
        }
        ```
        
2. 변수의 이름을 지을 때 대문자로 시작해도 되나요?
    - 대문자로 시작해도 되지만 보통은 camelCase로 작성한다.
3. 자료형에는 기본 자료형과 어떤 자료형이 있나요?
    - 참조 자료형이 있다. 참조 자료형은 `참조자료형 = new Xxx()` 와 같은 형태로 초기화한다. 다만 예외로 String은 직접대입도 가능하다.
4. 기본 자료형에는 몇가지가 있나요?
    - 8가지가 있다. (byte, char, short, int, long, float, double, boolean)
5. 기본 자료형 중 정수형에는 어떤 것들이 있나요?
    - byte, char, short, int, long
6. 바이트는 몇 비트로 되어 잇나요?
    - 8 bit
7. 바이트는 왜 만들었을까요?
    - 저장공간을 효율적으로 활용하기 위해서
8. 인트와 롱 중 어떤 타입이 더 큰 숫자를 처리할 수  있나요?
    - 롱 타입!
9. 소수점을 처리하는 타입은 어떤 것이 있나요?
    - float, double 이 있다. 하지만 정확도가 필요한 작업에서는 java.math.BigDecimal 을 사용한다.
10. 차는 정수형인가요?
    - 유니코드를 저장한다. 65535, 케릭터,
11. a 라는 것을 차로 정의할 때 어떤 기호로 감싸주어야 하나요?
    - ‘a’
12. ture flase 두개의 값만 가지는 타입은 어떤 것인가요?
    - boolean

<br/><br/>

# 참고자료

[Java에서  정수를 표현할때 왜 Integer를 많이 사용할까?](https://syundev.tistory.com/217)

- IEEE는 `아이 이이이` 라고 읽는 것이 아니라 `아이 트리플이` 라고 읽는다.
