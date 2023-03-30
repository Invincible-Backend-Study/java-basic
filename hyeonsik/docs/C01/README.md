1. Caculatorf라는 이름을 갖는 클래스를 텍스트 파일에 만들어 보자. 실제 코드를 여러분들이 만들어 실행하는 방법은 다음 장에서 배우니, 원하는 파일에 Caculator 클래스를 만들자.


2. 본문에서 살펴본 더하기 외에 빼기, 곱하기 나누기를 하고 그 결과를 리턴해주는 메소드를 만들어 보자.
- 빼기 : public int subtract(int num1, int num2)
- 곱하기 : public int multiply(int num1, int num2)
- 나누기 : public int divide(int num1, int num2)

```java
package C01;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return (int)(num1 / num2);
    }
}
```

---
1. 클래스가 뭔가요?
- 자바의 가장 작은 단위로, 객체를 만들기위한 기반정보를 담고있다. 

2. 메소드가 뭔가요?
- 입력에 대한 결과를 출력하는 것을 메소드라고 하며
  - 입력을 매개변수 parameter 라고 부른다.
  - 출력을 return type 이라고 부른다.
  - 입력과 출력은 존재하지 않을 수도 있다. (void)
  
3. 메소드의 매개 변수는 어디에 적어주나요?
- 괄호안에 적어줘야한다. (`type parameterName`)

4. 메소드 이름 앞에 꼭 적어 줘야 하는 건 뭐죠?
- return type

5. 클래스가 갖고 있어야 한다고 한 두가지가 뭐죠?
- 상태(state:classVar), 행동(behavior:method)이며 반드시 존재해야하는 것은 아니다.

6. 메소드에서 결과를 돌려주려면 어떤 예약어를 사용해야 하나요?
- void를 제외한 원시타입을 사용해야한다.

